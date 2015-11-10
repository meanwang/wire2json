// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\game.proto
package com.wesocial.apollo.protocol.protobuf.game;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;

public final class DoGameCommandRsp extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final ByteString DEFAULT_GAME_RSP_BUF = ByteString.EMPTY;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = BYTES)
  public final ByteString game_rsp_buf;

  public DoGameCommandRsp(ByteString reserved_buf, ByteString game_rsp_buf) {
    this.reserved_buf = reserved_buf;
    this.game_rsp_buf = game_rsp_buf;
  }

  private DoGameCommandRsp(Builder builder) {
    this(builder.reserved_buf, builder.game_rsp_buf);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DoGameCommandRsp)) return false;
    DoGameCommandRsp o = (DoGameCommandRsp) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(game_rsp_buf, o.game_rsp_buf);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (game_rsp_buf != null ? game_rsp_buf.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<DoGameCommandRsp> {

    public ByteString reserved_buf;
    public ByteString game_rsp_buf;

    public Builder() {
    }

    public Builder(DoGameCommandRsp message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.game_rsp_buf = message.game_rsp_buf;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder game_rsp_buf(ByteString game_rsp_buf) {
      this.game_rsp_buf = game_rsp_buf;
      return this;
    }

    @Override
    public DoGameCommandRsp build() {
      return new DoGameCommandRsp(this);
    }
  }
}
