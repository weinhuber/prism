from services.Prism import Prism
from model.PrismDevNullLog import PrismDevNullLog

# Create a log for PRISM output (hidden or stdout)
mainLog = PrismDevNullLog()
# Initialise PRISM engine
prism = Prism(mainLog)
prism.initialise()

# Parse and load a PRISM model from a file
modulesFile = prism.parseAndLoadModelFile("examples/dice.pm")

# Parse and load a property from the file
propertiesFile = prism.parsePropertiesFile(modulesFile, "examples/dice.pctl")

# Model check the first property from the file
print(propertiesFile.get_property_object(0))
result = prism.modelCheck(propertiesFile, 0)
print(result)