// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello_world.proto

package io.grpc.examples.helloworld;

public final class HelloWorldProto {
  private HelloWorldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_helloworld_HelloRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_helloworld_HelloResponse_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloInt_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_helloworld_HelloInt_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloByte_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_helloworld_HelloByte_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloDouble_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_helloworld_HelloDouble_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloComplex_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_helloworld_HelloComplex_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021hello_world.proto\022\nhelloworld\"\034\n\014Hello" +
      "Request\022\014\n\004name\030\001 \001(\t\" \n\rHelloResponse\022\017" +
      "\n\007message\030\001 \001(\t\"\027\n\010HelloInt\022\013\n\003num\030\001 \001(\005" +
      "\"\030\n\tHelloByte\022\013\n\003num\030\001 \001(\014\"\032\n\013HelloDoubl" +
      "e\022\013\n\003num\030\001 \001(\001\"~\n\014HelloComplex\022!\n\003int\030\001 " +
      "\001(\0132\024.helloworld.HelloInt\022$\n\003dbl\030\002 \001(\0132\027" +
      ".helloworld.HelloDouble\022%\n\003str\030\003 \001(\0132\030.h" +
      "elloworld.HelloRequest2\320\001\n\007Greeter\022A\n\010Sa" +
      "yHello\022\030.helloworld.HelloRequest\032\031.hello" +
      "world.HelloResponse\"\000\022@\n\014ClientStream\022\025.",
      "helloworld.HelloByte\032\025.helloworld.HelloB" +
      "yte\"\000(\001\022@\n\014ServerStream\022\025.helloworld.Hel" +
      "loByte\032\025.helloworld.HelloByte\"\0000\001B0\n\033io." +
      "grpc.examples.helloworldB\017HelloWorldProt" +
      "oP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_helloworld_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_helloworld_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_helloworld_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_helloworld_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_helloworld_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_helloworld_HelloResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_helloworld_HelloInt_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_helloworld_HelloInt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_helloworld_HelloInt_descriptor,
        new java.lang.String[] { "Num", });
    internal_static_helloworld_HelloByte_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_helloworld_HelloByte_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_helloworld_HelloByte_descriptor,
        new java.lang.String[] { "Num", });
    internal_static_helloworld_HelloDouble_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_helloworld_HelloDouble_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_helloworld_HelloDouble_descriptor,
        new java.lang.String[] { "Num", });
    internal_static_helloworld_HelloComplex_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_helloworld_HelloComplex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_helloworld_HelloComplex_descriptor,
        new java.lang.String[] { "Int", "Dbl", "Str", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
