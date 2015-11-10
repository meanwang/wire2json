// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\push.proto
package com.wesocial.apollo.protocol.protobuf.push;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.UINT64;

/**
 * II. 推送注销命令
 * 客户端用户在点击注销之后发起命令，这台机器不需要再收到任何推送命令
 * 请求结构为PushLogoutReq，回应结构为空
 */
public final class PushLogoutReq extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Long DEFAULT_INNER_ID = 0L;
  public static final ByteString DEFAULT_DEVICE_TOKEN = ByteString.EMPTY;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = UINT64)
  public final Long inner_id;

  /**
   * 内部id
   */
  @ProtoField(tag = 3, type = BYTES)
  public final ByteString device_token;

  public PushLogoutReq(ByteString reserved_buf, Long inner_id, ByteString device_token) {
    this.reserved_buf = reserved_buf;
    this.inner_id = inner_id;
    this.device_token = device_token;
  }

  private PushLogoutReq(Builder builder) {
    this(builder.reserved_buf, builder.inner_id, builder.device_token);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof PushLogoutReq)) return false;
    PushLogoutReq o = (PushLogoutReq) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(inner_id, o.inner_id)
        && equals(device_token, o.device_token);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (inner_id != null ? inner_id.hashCode() : 0);
      result = result * 37 + (device_token != null ? device_token.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<PushLogoutReq> {

    public ByteString reserved_buf;
    public Long inner_id;
    public ByteString device_token;

    public Builder() {
    }

    public Builder(PushLogoutReq message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.inner_id = message.inner_id;
      this.device_token = message.device_token;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder inner_id(Long inner_id) {
      this.inner_id = inner_id;
      return this;
    }

    /**
     * 内部id
     */
    public Builder device_token(ByteString device_token) {
      this.device_token = device_token;
      return this;
    }

    @Override
    public PushLogoutReq build() {
      return new PushLogoutReq(this);
    }
  }
}
