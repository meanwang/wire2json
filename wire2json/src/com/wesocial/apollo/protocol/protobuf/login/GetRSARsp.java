// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\login.proto
package com.wesocial.apollo.protocol.protobuf.login;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.UINT32;

public final class GetRSARsp extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Integer DEFAULT_TIMESTAMP = 0;
  public static final ByteString DEFAULT_PUB_KEY = ByteString.EMPTY;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = UINT32)
  public final Integer timestamp;

  /**
   * 服务器时间 (秒, client需要保存)
   */
  @ProtoField(tag = 3, type = BYTES)
  public final ByteString pub_key;

  public GetRSARsp(ByteString reserved_buf, Integer timestamp, ByteString pub_key) {
    this.reserved_buf = reserved_buf;
    this.timestamp = timestamp;
    this.pub_key = pub_key;
  }

  private GetRSARsp(Builder builder) {
    this(builder.reserved_buf, builder.timestamp, builder.pub_key);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetRSARsp)) return false;
    GetRSARsp o = (GetRSARsp) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(timestamp, o.timestamp)
        && equals(pub_key, o.pub_key);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (timestamp != null ? timestamp.hashCode() : 0);
      result = result * 37 + (pub_key != null ? pub_key.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetRSARsp> {

    public ByteString reserved_buf;
    public Integer timestamp;
    public ByteString pub_key;

    public Builder() {
    }

    public Builder(GetRSARsp message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.timestamp = message.timestamp;
      this.pub_key = message.pub_key;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder timestamp(Integer timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    /**
     * 服务器时间 (秒, client需要保存)
     */
    public Builder pub_key(ByteString pub_key) {
      this.pub_key = pub_key;
      return this;
    }

    @Override
    public GetRSARsp build() {
      return new GetRSARsp(this);
    }
  }
}