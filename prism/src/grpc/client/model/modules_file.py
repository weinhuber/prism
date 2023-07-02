import uuid

from model.prismpy_model import PrismPyBaseModel


class ModulesFile(PrismPyBaseModel):

    model_file_name = None
    module_object_id = None

    def __init__(self, model_file_name):
        # name of original property file
        self.model_file_name = model_file_name
        # id of the module object in the prism server
        self.module_object_id = str(uuid.uuid4())

