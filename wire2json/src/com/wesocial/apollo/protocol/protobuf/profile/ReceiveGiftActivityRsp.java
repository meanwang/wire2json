// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\profile.proto
package com.wesocial.apollo.protocol.protobuf.profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.STRING;

public final class ReceiveGiftActivityRsp extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final String DEFAULT_CDKEY = "";

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = STRING)
  public final String cdkey;

  public ReceiveGiftActivityRsp(ByteString reserved_buf, String cdkey) {
    this.reserved_buf = reserved_buf;
    this.cdkey = cdkey;
  }

  private ReceiveGiftActivityRsp(Builder builder) {
    this(builder.reserved_buf, builder.cdkey);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ReceiveGiftActivityRsp)) return false;
    ReceiveGiftActivityRsp o = (ReceiveGiftActivityRsp) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(cdkey, o.cdkey);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (cdkey != null ? cdkey.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ReceiveGiftActivityRsp> {

    public ByteString reserved_buf;
    public String cdkey;

    public Builder() {
    }

    public Builder(ReceiveGiftActivityRsp message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.cdkey = message.cdkey;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder cdkey(String cdkey) {
      this.cdkey = cdkey;
      return this;
    }

    @Override
    public ReceiveGiftActivityRsp build() {
      return new ReceiveGiftActivityRsp(this);
    }
  }
}
