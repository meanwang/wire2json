// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\pvpmatch.proto
package com.wesocial.apollo.protocol.protobuf.pvpmatch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.INT32;

/**
 * -------------------------------------------------------------
 * 3. 客户端和服务端交互协议
 * -------------------------------------------------------------
 * 游戏匹配请求 MATCH_PLAYER
 */
public final class MatchPlayerReq extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Integer DEFAULT_GAME_ID = 0;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = INT32)
  public final Integer game_id;

  public MatchPlayerReq(ByteString reserved_buf, Integer game_id) {
    this.reserved_buf = reserved_buf;
    this.game_id = game_id;
  }

  private MatchPlayerReq(Builder builder) {
    this(builder.reserved_buf, builder.game_id);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MatchPlayerReq)) return false;
    MatchPlayerReq o = (MatchPlayerReq) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(game_id, o.game_id);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (game_id != null ? game_id.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<MatchPlayerReq> {

    public ByteString reserved_buf;
    public Integer game_id;

    public Builder() {
    }

    public Builder(MatchPlayerReq message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.game_id = message.game_id;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder game_id(Integer game_id) {
      this.game_id = game_id;
      return this;
    }

    @Override
    public MatchPlayerReq build() {
      return new MatchPlayerReq(this);
    }
  }
}
