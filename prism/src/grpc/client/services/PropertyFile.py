class PropertyFile:
    def __init__(self, module_file, property_file_name, prism_property_name, property_object):
        # Object of type ModuleFile
        self.module_file = module_file
        # name of original property file (on python client side)
        self.property_file_name = property_file_name
        # Reference of the name how it was stored on the server (on prism server side)
        self.prism_property_name = prism_property_name
        # Object of type prism_pb2.PropertyObject which contains the parsed properties
        self.property_object = property_object

    def get_property_object(self, index):
        return self.property_object[index]
