import uuid
from model.prismpy_model import PrismPyBaseModel


class PropertyObject(PrismPyBaseModel):
    property_string = None

    def __init__(self):
        super().__init__()
        # id of the module object in the prism server

    def __str__(self):
        return self.property_string
