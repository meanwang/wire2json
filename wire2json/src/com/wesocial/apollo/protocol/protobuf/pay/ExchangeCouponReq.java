// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\pay.proto
package com.wesocial.apollo.protocol.protobuf.pay;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.UINT32;
import static com.squareup.wire.Message.Datatype.UINT64;

public final class ExchangeCouponReq extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Integer DEFAULT_GAME_COIN_NUM = 0;
  public static final Long DEFAULT_TID = 0L;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 3, type = UINT32)
  public final Integer game_coin_num;

  @ProtoField(tag = 4, type = UINT64)
  public final Long tid;

  public ExchangeCouponReq(ByteString reserved_buf, Integer game_coin_num, Long tid) {
    this.reserved_buf = reserved_buf;
    this.game_coin_num = game_coin_num;
    this.tid = tid;
  }

  private ExchangeCouponReq(Builder builder) {
    this(builder.reserved_buf, builder.game_coin_num, builder.tid);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ExchangeCouponReq)) return false;
    ExchangeCouponReq o = (ExchangeCouponReq) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(game_coin_num, o.game_coin_num)
        && equals(tid, o.tid);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (game_coin_num != null ? game_coin_num.hashCode() : 0);
      result = result * 37 + (tid != null ? tid.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ExchangeCouponReq> {

    public ByteString reserved_buf;
    public Integer game_coin_num;
    public Long tid;

    public Builder() {
    }

    public Builder(ExchangeCouponReq message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.game_coin_num = message.game_coin_num;
      this.tid = message.tid;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder game_coin_num(Integer game_coin_num) {
      this.game_coin_num = game_coin_num;
      return this;
    }

    public Builder tid(Long tid) {
      this.tid = tid;
      return this;
    }

    @Override
    public ExchangeCouponReq build() {
      return new ExchangeCouponReq(this);
    }
  }
}
