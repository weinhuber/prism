class PropertyObject:
    property_object_id = None
    property_string = None

    def __init__(self):
        # id of the module object in the prism server
        self.module_object_id = str(id(self))

    def __str__(self):
        return self.property_string
