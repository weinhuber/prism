import logging

"""
Usage guide: 
# Log to console only
logger = SingletonLogger(log_to_file=False).get_logger()
logger.info('This is an info message')

# Log to console and file
logger = SingletonLogger(log_to_file=True, log_file='my_log.log').get_logger()
logger.info('This is an info message')

In both cases, you get the same logger instance, so all parts of your application will log to the same places.
"""


class PrismPyLogger:
    _instance = None

    def __new__(cls, *args, **kwargs):
        if not cls._instance:
            cls._instance = super(PrismPyLogger, cls).__new__(cls, *args, **kwargs)
            cls._instance._initialized = False
        return cls._instance

    def __init__(self, log_to_file=False, log_file='app.log'):
        if self._initialized:
            return
        self._initialized = True

        self.logger = logging.getLogger('prismpy')
        self.logger.setLevel(logging.DEBUG)

        formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')

        # Log to console
        console_handler = logging.StreamHandler()
        console_handler.setFormatter(formatter)
        self.logger.addHandler(console_handler)

        # Optionally log to a file
        if log_to_file:
            file_handler = logging.FileHandler(log_file)
            file_handler.setFormatter(formatter)
            self.logger.addHandler(file_handler)

    def get_logger(self):
        return self.logger
