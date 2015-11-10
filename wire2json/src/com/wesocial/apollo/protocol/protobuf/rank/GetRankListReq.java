// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\rank.proto
package com.wesocial.apollo.protocol.protobuf.rank;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.INT32;

/**
 * 拉取游戏排行榜
 */
public final class GetRankListReq extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Integer DEFAULT_RANK_TYPE = 0;
  public static final Integer DEFAULT_RANK_CYCLE = 0;
  public static final Integer DEFAULT_GAME_ID = 0;
  public static final Integer DEFAULT_BEGIN_IDX = 0;
  public static final Integer DEFAULT_NUM = 0;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = INT32)
  public final Integer rank_type;

  /**
   * 榜单类型 1:全球排行榜 2:好友排行榜
   */
  @ProtoField(tag = 3, type = INT32)
  public final Integer rank_cycle;

  /**
   * 榜单周期 1:历史 2:本周
   */
  @ProtoField(tag = 4, type = INT32)
  public final Integer game_id;

  /**
   * 游戏ID
   */
  @ProtoField(tag = 5, type = INT32)
  public final Integer begin_idx;

  /**
   * 拉取的起始编号(从1开始计数)
   */
  @ProtoField(tag = 6, type = INT32)
  public final Integer num;

  public GetRankListReq(ByteString reserved_buf, Integer rank_type, Integer rank_cycle, Integer game_id, Integer begin_idx, Integer num) {
    this.reserved_buf = reserved_buf;
    this.rank_type = rank_type;
    this.rank_cycle = rank_cycle;
    this.game_id = game_id;
    this.begin_idx = begin_idx;
    this.num = num;
  }

  private GetRankListReq(Builder builder) {
    this(builder.reserved_buf, builder.rank_type, builder.rank_cycle, builder.game_id, builder.begin_idx, builder.num);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetRankListReq)) return false;
    GetRankListReq o = (GetRankListReq) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(rank_type, o.rank_type)
        && equals(rank_cycle, o.rank_cycle)
        && equals(game_id, o.game_id)
        && equals(begin_idx, o.begin_idx)
        && equals(num, o.num);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (rank_type != null ? rank_type.hashCode() : 0);
      result = result * 37 + (rank_cycle != null ? rank_cycle.hashCode() : 0);
      result = result * 37 + (game_id != null ? game_id.hashCode() : 0);
      result = result * 37 + (begin_idx != null ? begin_idx.hashCode() : 0);
      result = result * 37 + (num != null ? num.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetRankListReq> {

    public ByteString reserved_buf;
    public Integer rank_type;
    public Integer rank_cycle;
    public Integer game_id;
    public Integer begin_idx;
    public Integer num;

    public Builder() {
    }

    public Builder(GetRankListReq message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.rank_type = message.rank_type;
      this.rank_cycle = message.rank_cycle;
      this.game_id = message.game_id;
      this.begin_idx = message.begin_idx;
      this.num = message.num;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder rank_type(Integer rank_type) {
      this.rank_type = rank_type;
      return this;
    }

    /**
     * 榜单类型 1:全球排行榜 2:好友排行榜
     */
    public Builder rank_cycle(Integer rank_cycle) {
      this.rank_cycle = rank_cycle;
      return this;
    }

    /**
     * 榜单周期 1:历史 2:本周
     */
    public Builder game_id(Integer game_id) {
      this.game_id = game_id;
      return this;
    }

    /**
     * 游戏ID
     */
    public Builder begin_idx(Integer begin_idx) {
      this.begin_idx = begin_idx;
      return this;
    }

    /**
     * 拉取的起始编号(从1开始计数)
     */
    public Builder num(Integer num) {
      this.num = num;
      return this;
    }

    @Override
    public GetRankListReq build() {
      return new GetRankListReq(this);
    }
  }
}