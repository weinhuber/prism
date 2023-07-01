class PropertiesFile:

    property_file_name = None
    property_object_id = None

    def __init__(self, property_file_name):
        # name of original property file
        self.property_file_name = property_file_name
        # id of the module object in the prism server
        self.module_object_id = str(id(self))

