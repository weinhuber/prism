from model.prismpy_model import PrismPyBaseModel


class ModulesFile(PrismPyBaseModel):

    model_file_name = None

    def __init__(self, model_file_name):
        super().__init__()
        # name of original property file
        self.model_file_name = model_file_name

