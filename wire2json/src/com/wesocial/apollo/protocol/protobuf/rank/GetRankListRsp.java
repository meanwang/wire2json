// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\rank.proto
package com.wesocial.apollo.protocol.protobuf.rank;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Label.REPEATED;

public final class GetRankListRsp extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final List<RankRecord> DEFAULT_RANK_LIST = Collections.emptyList();
  public static final Integer DEFAULT_TOTAL_NUM = 0;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, label = REPEATED, messageType = RankRecord.class)
  public final List<RankRecord> rank_list;

  /**
   * 榜单列表
   */
  @ProtoField(tag = 3, type = INT32)
  public final Integer total_num;

  /**
   * 总数
   */
  @ProtoField(tag = 4)
  public final RankRecord my_rank;

  public GetRankListRsp(ByteString reserved_buf, List<RankRecord> rank_list, Integer total_num, RankRecord my_rank) {
    this.reserved_buf = reserved_buf;
    this.rank_list = immutableCopyOf(rank_list);
    this.total_num = total_num;
    this.my_rank = my_rank;
  }

  private GetRankListRsp(Builder builder) {
    this(builder.reserved_buf, builder.rank_list, builder.total_num, builder.my_rank);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetRankListRsp)) return false;
    GetRankListRsp o = (GetRankListRsp) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(rank_list, o.rank_list)
        && equals(total_num, o.total_num)
        && equals(my_rank, o.my_rank);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (rank_list != null ? rank_list.hashCode() : 1);
      result = result * 37 + (total_num != null ? total_num.hashCode() : 0);
      result = result * 37 + (my_rank != null ? my_rank.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetRankListRsp> {

    public ByteString reserved_buf;
    public List<RankRecord> rank_list;
    public Integer total_num;
    public RankRecord my_rank;

    public Builder() {
    }

    public Builder(GetRankListRsp message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.rank_list = copyOf(message.rank_list);
      this.total_num = message.total_num;
      this.my_rank = message.my_rank;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder rank_list(List<RankRecord> rank_list) {
      this.rank_list = checkForNulls(rank_list);
      return this;
    }

    /**
     * 榜单列表
     */
    public Builder total_num(Integer total_num) {
      this.total_num = total_num;
      return this;
    }

    /**
     * 总数
     */
    public Builder my_rank(RankRecord my_rank) {
      this.my_rank = my_rank;
      return this;
    }

    @Override
    public GetRankListRsp build() {
      return new GetRankListRsp(this);
    }
  }
}