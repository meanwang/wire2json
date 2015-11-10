// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\friend.proto
package com.wesocial.apollo.protocol.protobuf.friend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.UINT32;

/**
 * 获取最新的打招呼人的信息 (GET_NEWEST_GREET_LIST 407)
 */
public final class NewestGreetPersonReq extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Integer DEFAULT_GREET_TYPE = 0;
  public static final Long DEFAULT_TIMESTAMP = 0L;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = UINT32)
  public final Integer greet_type;

  /**
   * 类型 kTypeGreet / kTypeBeGreeted
   */
  @ProtoField(tag = 3, type = INT64)
  public final Long timestamp;

  public NewestGreetPersonReq(ByteString reserved_buf, Integer greet_type, Long timestamp) {
    this.reserved_buf = reserved_buf;
    this.greet_type = greet_type;
    this.timestamp = timestamp;
  }

  private NewestGreetPersonReq(Builder builder) {
    this(builder.reserved_buf, builder.greet_type, builder.timestamp);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof NewestGreetPersonReq)) return false;
    NewestGreetPersonReq o = (NewestGreetPersonReq) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(greet_type, o.greet_type)
        && equals(timestamp, o.timestamp);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (greet_type != null ? greet_type.hashCode() : 0);
      result = result * 37 + (timestamp != null ? timestamp.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<NewestGreetPersonReq> {

    public ByteString reserved_buf;
    public Integer greet_type;
    public Long timestamp;

    public Builder() {
    }

    public Builder(NewestGreetPersonReq message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.greet_type = message.greet_type;
      this.timestamp = message.timestamp;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder greet_type(Integer greet_type) {
      this.greet_type = greet_type;
      return this;
    }

    /**
     * 类型 kTypeGreet / kTypeBeGreeted
     */
    public Builder timestamp(Long timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    @Override
    public NewestGreetPersonReq build() {
      return new NewestGreetPersonReq(this);
    }
  }
}
