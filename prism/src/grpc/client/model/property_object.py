import uuid
from model.prismpy_model import PrismPyBaseModel


class PropertyObject(PrismPyBaseModel):
    property_object_id = None
    property_string = None

    def __init__(self):
        # id of the module object in the prism server
        self.property_object_id = str(uuid.uuid4())

    def __str__(self):
        return self.property_string
