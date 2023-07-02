import uuid
from model.prismpy_model import PrismPyBaseModel


class Result(PrismPyBaseModel):
    result = None

    def __init__(self):
        super().__init__()

    def get_result(self):
        return self.result
