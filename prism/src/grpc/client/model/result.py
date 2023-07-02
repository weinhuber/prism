import uuid


class Result:

    result_object_id = None

    result = None

    def __init__(self):
        # id of the module object in the prism server
        self.result_object_id = str(uuid.uuid4())

    def get_result(self):
        return self.result