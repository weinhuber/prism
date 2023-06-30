class ModuleFile:
    def __init__(self, property_file_name, prism_module_name):
        # name of original property file
        self.property_file_name = property_file_name
        # Reference of the name how it was stored on the server
        self.prism_module_name = prism_module_name
