from service_provider.model_generator import ModelGenerator
from service_provider.model_type import ModelType
from service_provider.reward_generator import RewardGenerator
from service_provider.service_provider_base import ServiceProviderBase
from stub_classes.prism_log import PrismLog
from stub_classes.prism import Prism



main_log = PrismLog("devnull")

# Initialise PRISM engine
#prism = Prism(main_log)
#prism.initialise()

# Create a model generator to specify the model that PRISM should build (in this case a simple random walk)
#model_gen = RandomWalk(5, 0.6)

# Load the model generator into PRISM
#prism.load_model_generator(model_gen)

#prism.close_down()


