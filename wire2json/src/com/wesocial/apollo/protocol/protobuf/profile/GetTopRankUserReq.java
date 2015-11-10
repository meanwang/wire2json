// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\profile.proto
package com.wesocial.apollo.protocol.protobuf.profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.UINT32;

/**
 * 获取某个榜单的详细列表
 */
public final class GetTopRankUserReq extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Integer DEFAULT_RANK_TYPE = 0;
  public static final Integer DEFAULT_VERSION = 0;
  public static final Integer DEFAULT_BEGIN_IDX = 0;
  public static final Integer DEFAULT_NUM = 0;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = UINT32)
  public final Integer rank_type;

  /**
   * 榜单类型 1 女神 日榜单, 2 女神 周榜单， 3 土豪 日榜单， 4 土豪 周榜单
   */
  @ProtoField(tag = 3, type = UINT32)
  public final Integer version;

  /**
   * 榜单的版本号
   */
  @ProtoField(tag = 4, type = UINT32)
  public final Integer begin_idx;

  /**
   * 开始位置
   */
  @ProtoField(tag = 5, type = UINT32)
  public final Integer num;

  public GetTopRankUserReq(ByteString reserved_buf, Integer rank_type, Integer version, Integer begin_idx, Integer num) {
    this.reserved_buf = reserved_buf;
    this.rank_type = rank_type;
    this.version = version;
    this.begin_idx = begin_idx;
    this.num = num;
  }

  private GetTopRankUserReq(Builder builder) {
    this(builder.reserved_buf, builder.rank_type, builder.version, builder.begin_idx, builder.num);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetTopRankUserReq)) return false;
    GetTopRankUserReq o = (GetTopRankUserReq) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(rank_type, o.rank_type)
        && equals(version, o.version)
        && equals(begin_idx, o.begin_idx)
        && equals(num, o.num);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (rank_type != null ? rank_type.hashCode() : 0);
      result = result * 37 + (version != null ? version.hashCode() : 0);
      result = result * 37 + (begin_idx != null ? begin_idx.hashCode() : 0);
      result = result * 37 + (num != null ? num.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetTopRankUserReq> {

    public ByteString reserved_buf;
    public Integer rank_type;
    public Integer version;
    public Integer begin_idx;
    public Integer num;

    public Builder() {
    }

    public Builder(GetTopRankUserReq message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.rank_type = message.rank_type;
      this.version = message.version;
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
     * 榜单类型 1 女神 日榜单, 2 女神 周榜单， 3 土豪 日榜单， 4 土豪 周榜单
     */
    public Builder version(Integer version) {
      this.version = version;
      return this;
    }

    /**
     * 榜单的版本号
     */
    public Builder begin_idx(Integer begin_idx) {
      this.begin_idx = begin_idx;
      return this;
    }

    /**
     * 开始位置
     */
    public Builder num(Integer num) {
      this.num = num;
      return this;
    }

    @Override
    public GetTopRankUserReq build() {
      return new GetTopRankUserReq(this);
    }
  }
}