// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\profile.proto
package com.wesocial.apollo.protocol.protobuf.profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.INT64;

/**
 * XIX. 领取礼包
 * CMD为RECEIVE_GIFT_ACTIVITY（303）
 */
public final class ReceiveGiftActivityReq extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Long DEFAULT_ID = 0L;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = INT64)
  public final Long id;

  public ReceiveGiftActivityReq(ByteString reserved_buf, Long id) {
    this.reserved_buf = reserved_buf;
    this.id = id;
  }

  private ReceiveGiftActivityReq(Builder builder) {
    this(builder.reserved_buf, builder.id);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ReceiveGiftActivityReq)) return false;
    ReceiveGiftActivityReq o = (ReceiveGiftActivityReq) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(id, o.id);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (id != null ? id.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ReceiveGiftActivityReq> {

    public ByteString reserved_buf;
    public Long id;

    public Builder() {
    }

    public Builder(ReceiveGiftActivityReq message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.id = message.id;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    @Override
    public ReceiveGiftActivityReq build() {
      return new ReceiveGiftActivityReq(this);
    }
  }
}
