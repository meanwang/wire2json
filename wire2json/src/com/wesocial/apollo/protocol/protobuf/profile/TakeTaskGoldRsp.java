// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\profile.proto
package com.wesocial.apollo.protocol.protobuf.profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.UINT32;

public final class TakeTaskGoldRsp extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Integer DEFAULT_INCR_GOLD = 0;
  public static final Integer DEFAULT_CUR_GOLD = 0;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  @ProtoField(tag = 2, type = UINT32)
  public final Integer incr_gold;

  /**
   * 新增金币数
   */
  @ProtoField(tag = 3, type = UINT32)
  public final Integer cur_gold;

  public TakeTaskGoldRsp(ByteString reserved_buf, Integer incr_gold, Integer cur_gold) {
    this.reserved_buf = reserved_buf;
    this.incr_gold = incr_gold;
    this.cur_gold = cur_gold;
  }

  private TakeTaskGoldRsp(Builder builder) {
    this(builder.reserved_buf, builder.incr_gold, builder.cur_gold);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof TakeTaskGoldRsp)) return false;
    TakeTaskGoldRsp o = (TakeTaskGoldRsp) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(incr_gold, o.incr_gold)
        && equals(cur_gold, o.cur_gold);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (incr_gold != null ? incr_gold.hashCode() : 0);
      result = result * 37 + (cur_gold != null ? cur_gold.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<TakeTaskGoldRsp> {

    public ByteString reserved_buf;
    public Integer incr_gold;
    public Integer cur_gold;

    public Builder() {
    }

    public Builder(TakeTaskGoldRsp message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.incr_gold = message.incr_gold;
      this.cur_gold = message.cur_gold;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    public Builder incr_gold(Integer incr_gold) {
      this.incr_gold = incr_gold;
      return this;
    }

    /**
     * 新增金币数
     */
    public Builder cur_gold(Integer cur_gold) {
      this.cur_gold = cur_gold;
      return this;
    }

    @Override
    public TakeTaskGoldRsp build() {
      return new TakeTaskGoldRsp(this);
    }
  }
}
