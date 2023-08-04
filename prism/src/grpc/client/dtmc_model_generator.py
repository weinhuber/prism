from service_provider.service_provider_base import ServiceProviderBase
from stub_classes.prism_log import PrismLog
from stub_classes.prism import Prism
from random_walk import RandomWalk

main_log = PrismLog("devnull")

# Initialise PRISM engine
prism = Prism(main_log)
prism.initialise()

# Create a model generator to specify the model that PRISM should build (in this case a simple random walk)
model_gen = ServiceProviderBase(RandomWalk(5, 0.6))

# prism.load_model_generator(model_gen)

prism.close_down()

# Load the model generator into PRISM
# prism.load_model_generator(model_gen)

# prism.close_down()


