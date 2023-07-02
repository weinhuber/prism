from model.prismpy_base_model import PrismPyBaseModel


class UndefinedConstants(PrismPyBaseModel):
    undefined_constants = None

    def __init__(self, modules_file, properties_file, property_object):
        super().__init__()
