class Result:

    result_object_id = None

    result = None

    def __init__(self):
        # id of the module object in the prism server
        self.result_object_id = str(id(self))

    def get_result(self):
        return self.result