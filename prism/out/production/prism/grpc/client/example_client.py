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

prism2 = Prism(main_log2)
prism2.initialise()

prism3 = Prism(main_log3)
prism3.initialise()

# Parse and load a PRISM model from a file
modulesFile = prism.parse_and_load_model_file("examples/dice.pm")
main_log2 = prism2.parse_and_load_model_file("examples/dice.pm")
main_log3 = prism3.parse_and_load_model_file("examples/dice.pm")

# # Parse and load a property from the file
# propertiesFile = prism.parse_properties_file(modulesFile, "examples/dice.pctl")
#
# # Model check the first property from the file
# print(propertiesFile.get_property_object(0))
# result = prism.model_check(propertiesFile, 0)
# print(result)