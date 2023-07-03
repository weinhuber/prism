from model.prism_log import PrismLog
from model.undefined_constants import UndefinedConstants
from model.values import Values
from model.prism import Prism

main_log = PrismLog("devnull")
main_log2 = PrismLog("stdout")
main_log3 = PrismLog("hidden")

# Initialise PRISM engine
prism = Prism(main_log)
prism.initialise()

prism2 = Prism(main_log2)
prism2.initialise()

prism3 = Prism(main_log3)
prism3.initialise()

# Parse and load a PRISM model from a file
modules_file = prism.parse_model_file("examples/dice.pm")

prism.load_prism_model(modules_file)

modules_file2 = prism2.parse_model_file("examples/dice.pm")
prism2.load_prism_model(modules_file2)

modules_file3 = prism3.parse_model_file("examples/dice.pm")
prism3.load_prism_model(modules_file3)

# Parse and load a properties model for the model
properties_file = prism.parse_properties_file(modules_file, "examples/dice.pctl")

properties_file2 = prism2.parse_properties_file(modules_file2, "examples/dice.pctl")
# Model check the first property from the file
print(properties_file.get_property_object(0))
# Changed model_check to only accept a properties file and a property index
result = prism.model_check(properties_file, properties_file.get_property_object(0))
print(result.get_result())

# Model check the second property from the file (which has an undefined constant, whose value we set to 3)
consts = properties_file.get_undefined_constants_used_in_property(properties_file.get_property_object(1))
const_name = consts[0]

vals = Values()
vals.add_value(const_name, 3)
# here we synchronise with server during "add_value" call and not after Value object is created
properties_file.set_some_undefined_constants(vals)
print(properties_file.get_property_object(1), " for ", vals)

result = prism.model_check(properties_file, properties_file.get_property_object(1))
print(result.get_result())

# Model check the second property from the file
# (which has an undefined constant, which we check over a range 0,1,2)
undef_consts = UndefinedConstants(modules_file, properties_file, properties_file.get_property_object(1))
# here we synchronise with server after undefined constants object is created

undef_consts.define_using_const_switch(const_name + "=0:2")
n = undef_consts.get_number_property_iterations()