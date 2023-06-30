from services import prismGrpc_pb2


class RandomWalk:

    def __init__(self, numStates, prob):
        self.numStates = numStates
        self.prob = prob

    @staticmethod
    def get_proto():
        return prismGrpc_pb2.RandomWalk()


if __name__ == "__main__":
    rw = RandomWalk(5, 0.5)
    print(rw.get_proto())