# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: prism.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0bprism.proto\"A\n\rUploadRequest\x12\x12\n\x08\x66ilename\x18\x01 \x01(\tH\x00\x12\x14\n\nchunk_data\x18\x02 \x01(\x0cH\x00\x42\x06\n\x04\x64\x61ta\"\x1f\n\x0bUploadReply\x12\x10\n\x08\x66ilename\x18\x01 \x01(\t\"\x11\n\x0fPrismDevNullLog\"^\n\x0cPrismFileLog\x12(\n\x06output\x18\x01 \x01(\x0e\x32\x18.PrismFileLog.OutputType\"$\n\nOutputType\x12\n\n\x06STDOUT\x10\x00\x12\n\n\x06HIDDEN\x10\x01\"c\n\x08PrismLog\x12(\n\x0c\x64\x65v_null_log\x18\x01 \x01(\x0b\x32\x10.PrismDevNullLogH\x00\x12!\n\x08\x66ile_log\x18\x02 \x01(\x0b\x32\r.PrismFileLogH\x00\x42\n\n\x08log_type\"+\n\x11InitialiseRequest\x12\x16\n\x03log\x18\x01 \x01(\x0b\x32\t.PrismLog\"$\n\x12InitialiseResponse\x12\x0e\n\x06result\x18\x01 \x01(\t\"0\n\x15LoadPRISMModelRequest\x12\x17\n\x0fmodel_file_name\x18\x01 \x01(\t\"(\n\x16LoadPRISMModelResponse\x12\x0e\n\x06status\x18\x01 \x01(\t\"S\n\x1aParsePropertiesFileRequest\x12\x17\n\x0fmodel_file_name\x18\x01 \x01(\t\x12\x1c\n\x14properties_file_name\x18\x02 \x01(\t\"A\n\x1bParsePropertiesFileResponse\x12\x0e\n\x06status\x18\x01 \x01(\t\x12\x12\n\nproperties\x18\x02 \x03(\t\"\x85\x01\n\x1f\x44\x65\x66ineUndefinedConstantsRequest\x12\x17\n\x0fmodel_file_name\x18\x01 \x01(\t\x12\x1c\n\x14properties_file_name\x18\x02 \x01(\t\x12\x16\n\x0eproperty_index\x18\x03 \x01(\x05\x12\x13\n\x0b\x63onst_range\x18\x04 \x01(\t\"2\n DefineUndefinedConstantsResponse\x12\x0e\n\x06status\x18\x01 \x01(\t\"I\n\x11ModelCheckRequest\x12\x1c\n\x14properties_file_name\x18\x01 \x01(\t\x12\x16\n\x0eproperty_index\x18\x02 \x01(\x05\"$\n\x12ModelCheckResponse\x12\x0e\n\x06result\x18\x01 \x01(\x01\"p\n\x1eModelCheckWithConstantsRequest\x12\x1c\n\x14properties_file_name\x18\x01 \x01(\t\x12\x18\n\x10\x63onstants_values\x18\x02 \x01(\t\x12\x16\n\x0eproperty_index\x18\x03 \x01(\x05\"P\n\x1cParsePropertiesStringRequest\x12\x17\n\x0fmodel_file_name\x18\x01 \x01(\t\x12\x17\n\x0fproperty_string\x18\x02 \x01(\t\"/\n\x1dParsePropertiesStringResponse\x12\x0e\n\x06status\x18\x01 \x01(\t\"2\n\x17ModelCheckStringRequest\x12\x17\n\x0fproperty_string\x18\x01 \x01(\t\"*\n\x18ModelCheckStringResponse\x12\x0e\n\x06result\x18\x01 \x01(\t\"3\n\x18ParseAndLoadModelRequest\x12\x17\n\x0fmodel_file_name\x18\x01 \x01(\t\"(\n\x16ParseAndLoadModelReply\x12\x0e\n\x06result\x18\x01 \x01(\t\"\x13\n\x11\x43losePrismRequest\"$\n\x12\x43losePrismResponse\x12\x0e\n\x06status\x18\x01 \x01(\t2\xad\x06\n\x11PrismProtoService\x12.\n\nUploadFile\x12\x0e.UploadRequest\x1a\x0c.UploadReply\"\x00(\x01\x12\x37\n\nInitialise\x12\x12.InitialiseRequest\x1a\x13.InitialiseResponse\"\x00\x12I\n\x11ParseAndLoadModel\x12\x19.ParseAndLoadModelRequest\x1a\x17.ParseAndLoadModelReply\"\x00\x12\x43\n\x0eLoadPRISMModel\x12\x16.LoadPRISMModelRequest\x1a\x17.LoadPRISMModelResponse\"\x00\x12R\n\x13ParsePropertiesFile\x12\x1b.ParsePropertiesFileRequest\x1a\x1c.ParsePropertiesFileResponse\"\x00\x12\x61\n\x18\x44\x65\x66ineUndefinedConstants\x12 .DefineUndefinedConstantsRequest\x1a!.DefineUndefinedConstantsResponse\"\x00\x12\x37\n\nModelCheck\x12\x12.ModelCheckRequest\x1a\x13.ModelCheckResponse\"\x00\x12Q\n\x17ModelCheckWithConstants\x12\x1f.ModelCheckWithConstantsRequest\x1a\x13.ModelCheckResponse\"\x00\x12X\n\x15ParsePropertiesString\x12\x1d.ParsePropertiesStringRequest\x1a\x1e.ParsePropertiesStringResponse\"\x00\x12I\n\x10ModelCheckString\x12\x18.ModelCheckStringRequest\x1a\x19.ModelCheckStringResponse\"\x00\x12\x37\n\nClosePrism\x12\x12.ClosePrismRequest\x1a\x13.ClosePrismResponse\"\x00\x42\x1d\n\x1borg.prismmodelchecker.protob\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'prism_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033org.prismmodelchecker.proto'
  _UPLOADREQUEST._serialized_start=15
  _UPLOADREQUEST._serialized_end=80
  _UPLOADREPLY._serialized_start=82
  _UPLOADREPLY._serialized_end=113
  _PRISMDEVNULLLOG._serialized_start=115
  _PRISMDEVNULLLOG._serialized_end=132
  _PRISMFILELOG._serialized_start=134
  _PRISMFILELOG._serialized_end=228
  _PRISMFILELOG_OUTPUTTYPE._serialized_start=192
  _PRISMFILELOG_OUTPUTTYPE._serialized_end=228
  _PRISMLOG._serialized_start=230
  _PRISMLOG._serialized_end=329
  _INITIALISEREQUEST._serialized_start=331
  _INITIALISEREQUEST._serialized_end=374
  _INITIALISERESPONSE._serialized_start=376
  _INITIALISERESPONSE._serialized_end=412
  _LOADPRISMMODELREQUEST._serialized_start=414
  _LOADPRISMMODELREQUEST._serialized_end=462
  _LOADPRISMMODELRESPONSE._serialized_start=464
  _LOADPRISMMODELRESPONSE._serialized_end=504
  _PARSEPROPERTIESFILEREQUEST._serialized_start=506
  _PARSEPROPERTIESFILEREQUEST._serialized_end=589
  _PARSEPROPERTIESFILERESPONSE._serialized_start=591
  _PARSEPROPERTIESFILERESPONSE._serialized_end=656
  _DEFINEUNDEFINEDCONSTANTSREQUEST._serialized_start=659
  _DEFINEUNDEFINEDCONSTANTSREQUEST._serialized_end=792
  _DEFINEUNDEFINEDCONSTANTSRESPONSE._serialized_start=794
  _DEFINEUNDEFINEDCONSTANTSRESPONSE._serialized_end=844
  _MODELCHECKREQUEST._serialized_start=846
  _MODELCHECKREQUEST._serialized_end=919
  _MODELCHECKRESPONSE._serialized_start=921
  _MODELCHECKRESPONSE._serialized_end=957
  _MODELCHECKWITHCONSTANTSREQUEST._serialized_start=959
  _MODELCHECKWITHCONSTANTSREQUEST._serialized_end=1071
  _PARSEPROPERTIESSTRINGREQUEST._serialized_start=1073
  _PARSEPROPERTIESSTRINGREQUEST._serialized_end=1153
  _PARSEPROPERTIESSTRINGRESPONSE._serialized_start=1155
  _PARSEPROPERTIESSTRINGRESPONSE._serialized_end=1202
  _MODELCHECKSTRINGREQUEST._serialized_start=1204
  _MODELCHECKSTRINGREQUEST._serialized_end=1254
  _MODELCHECKSTRINGRESPONSE._serialized_start=1256
  _MODELCHECKSTRINGRESPONSE._serialized_end=1298
  _PARSEANDLOADMODELREQUEST._serialized_start=1300
  _PARSEANDLOADMODELREQUEST._serialized_end=1351
  _PARSEANDLOADMODELREPLY._serialized_start=1353
  _PARSEANDLOADMODELREPLY._serialized_end=1393
  _CLOSEPRISMREQUEST._serialized_start=1395
  _CLOSEPRISMREQUEST._serialized_end=1414
  _CLOSEPRISMRESPONSE._serialized_start=1416
  _CLOSEPRISMRESPONSE._serialized_end=1452
  _PRISMPROTOSERVICE._serialized_start=1455
  _PRISMPROTOSERVICE._serialized_end=2268
# @@protoc_insertion_point(module_scope)