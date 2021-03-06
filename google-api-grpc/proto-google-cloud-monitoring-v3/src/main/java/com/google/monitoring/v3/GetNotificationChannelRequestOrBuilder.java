// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/notification_service.proto

package com.google.monitoring.v3;

public interface GetNotificationChannelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.GetNotificationChannelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The channel for which to execute the request. The format is
   * `projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]`.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The channel for which to execute the request. The format is
   * `projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]`.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
