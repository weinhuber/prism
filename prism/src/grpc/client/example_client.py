from model.Values import Values
from services.prism import Prism
from model.prism_dev_null_log import PrismDevNullLog
from model.prism_file_log import PrismFileLog

# Create a log for PRISM output (hidden or stdout)
main_log = PrismDevNullLog()
main_log2 = PrismFileLog("stdout")
main_log3 = PrismFileLog("hidden")

# Initialise PRISM engine
prism = Prism(main_log)
prism.initialise()

# prism2 = Prism(main_log2)
# prism2.initialise()

# prism3 = Prism(main_log3)
# prism3.initialise()

# Parse and load a PRISM model from a file
modules_file = prism.parse_model_file("examples/dice.pm")
prism.load_prism_model(modules_file)

# modules_file2 = prism2.parse_model_file("examples/dice.pm")
# prism2.load_prism_model(modules_file2)

# modules_file3 = prism3.parse_model_file("examples/dice.pm")
# prism3.load_prism_model(modules_file3)

# Parse and load a properties model for the model
properties_file = prism.parse_properties_file(modules_file, "examples/dice.pctl")
# properties_file2 = prism2.parse_properties_file(modules_file2, "examples/dice.pctl")
# properties_file3 = prism3.parse_properties_file(modules_file3, "examples/dice.pctl")

# Model check the first property from the file
print(properties_file.get_property_object(0))
# Changed model_check to only accept a properties file and a property index
result = prism.model_check(properties_file, 0)
print(result.get_result())

# Model check the second property from the file (which has an undefined constant, whose value we set to 3)
consts = properties_file.get_undefined_constants_used_in_property(properties_file.get_property_object(1))
const_name = consts[0]

vals = Values()
vals.add_value(const_name, 3)
properties_file.set_some_undefined_constants(vals)
