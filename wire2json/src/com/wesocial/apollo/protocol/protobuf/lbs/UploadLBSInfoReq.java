// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\lbs.proto
package com.wesocial.apollo.protocol.protobuf.lbs;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.DOUBLE;

/**
 * ////////////////////////////////////////////////////////////////////////////
 * 上报LBS信息
 * cmd = UPLOAD_LBS_INFO
 */
public final class UploadLBSInfoReq extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Double DEFAULT_LATITUDE = 0D;
  public static final Double DEFAULT_LONGITUDE = 0D;
  public static final Double DEFAULT_ACCURACY = 0D;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = DOUBLE)
  public final Double latitude;

  /**
   * 纬度
   */
  @ProtoField(tag = 3, type = DOUBLE)
  public final Double longitude;

  /**
   * 经度
   */
  @ProtoField(tag = 4, type = DOUBLE)
  public final Double accuracy;

  public UploadLBSInfoReq(ByteString reserved_buf, Double latitude, Double longitude, Double accuracy) {
    this.reserved_buf = reserved_buf;
    this.latitude = latitude;
    this.longitude = longitude;
    this.accuracy = accuracy;
  }

  private UploadLBSInfoReq(Builder builder) {
    this(builder.reserved_buf, builder.latitude, builder.longitude, builder.accuracy);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof UploadLBSInfoReq)) return false;
    UploadLBSInfoReq o = (UploadLBSInfoReq) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(latitude, o.latitude)
        && equals(longitude, o.longitude)
        && equals(accuracy, o.accuracy);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (latitude != null ? latitude.hashCode() : 0);
      result = result * 37 + (longitude != null ? longitude.hashCode() : 0);
      result = result * 37 + (accuracy != null ? accuracy.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<UploadLBSInfoReq> {

    public ByteString reserved_buf;
    public Double latitude;
    public Double longitude;
    public Double accuracy;

    public Builder() {
    }

    public Builder(UploadLBSInfoReq message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.latitude = message.latitude;
      this.longitude = message.longitude;
      this.accuracy = message.accuracy;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder latitude(Double latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     * 纬度
     */
    public Builder longitude(Double longitude) {
      this.longitude = longitude;
      return this;
    }

    /**
     * 经度
     */
    public Builder accuracy(Double accuracy) {
      this.accuracy = accuracy;
      return this;
    }

    @Override
    public UploadLBSInfoReq build() {
      return new UploadLBSInfoReq(this);
    }
  }
}