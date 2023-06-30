from services.prism import Prism
from model.prism_dev_null_log import PrismDevNullLog

# Create a log for PRISM output (hidden or stdout)
mainLog = PrismDevNullLog()
# Initialise PRISM engine
prism = Prism(mainLog)
prism.initialise()

# Parse and load a PRISM model from a file
modulesFile = prism.parse_and_load_model_file("examples/dice.pm")

# Parse and load a property from the file
propertiesFile = prism.parse_properties_file(modulesFile, "examples/dice.pctl")

# Model check the first property from the file
print(propertiesFile.get_property_object(0))
result = prism.model_check(propertiesFile, 0)
print(result)