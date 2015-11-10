// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\pvpmatch.proto
package com.wesocial.apollo.protocol.protobuf.pvpmatch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;

public final class CheckPlayerOnlineRsp extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2)
  public final PlayerOnlineInfo online_info;

  public CheckPlayerOnlineRsp(ByteString reserved_buf, PlayerOnlineInfo online_info) {
    this.reserved_buf = reserved_buf;
    this.online_info = online_info;
  }

  private CheckPlayerOnlineRsp(Builder builder) {
    this(builder.reserved_buf, builder.online_info);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof CheckPlayerOnlineRsp)) return false;
    CheckPlayerOnlineRsp o = (CheckPlayerOnlineRsp) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(online_info, o.online_info);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (online_info != null ? online_info.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<CheckPlayerOnlineRsp> {

    public ByteString reserved_buf;
    public PlayerOnlineInfo online_info;

    public Builder() {
    }

    public Builder(CheckPlayerOnlineRsp message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.online_info = message.online_info;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder online_info(PlayerOnlineInfo online_info) {
      this.online_info = online_info;
      return this;
    }

    @Override
    public CheckPlayerOnlineRsp build() {
      return new CheckPlayerOnlineRsp(this);
    }
  }
}