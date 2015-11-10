// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\gameinfo.proto
package com.wesocial.apollo.protocol.protobuf.gameinfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.FLOAT;
import static com.squareup.wire.Message.Datatype.INT32;

/**
 * -------------------------------------------------------------
 * 3. 客户端和服务端交互协议
 * -------------------------------------------------------------
 * 获取首页游戏推荐列表 GET_RECOMMEND_GAME_LIST
 */
public final class GetRecommendGameListReq extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Integer DEFAULT_BEGIN_IDX = 0;
  public static final Integer DEFAULT_NUM = 0;
  public static final Float DEFAULT_LATITUDE = 0F;
  public static final Float DEFAULT_LONGITUDE = 0F;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = INT32)
  public final Integer begin_idx;

  /**
   * 拉取的起始编号(从1开始计数)
   */
  @ProtoField(tag = 3, type = INT32)
  public final Integer num;

  /**
   * 数目
   */
  @ProtoField(tag = 4, type = FLOAT)
  public final Float latitude;

  /**
   * 当前位置的纬度信息
   */
  @ProtoField(tag = 5, type = FLOAT)
  public final Float longitude;

  public GetRecommendGameListReq(ByteString reserved_buf, Integer begin_idx, Integer num, Float latitude, Float longitude) {
    this.reserved_buf = reserved_buf;
    this.begin_idx = begin_idx;
    this.num = num;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  private GetRecommendGameListReq(Builder builder) {
    this(builder.reserved_buf, builder.begin_idx, builder.num, builder.latitude, builder.longitude);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetRecommendGameListReq)) return false;
    GetRecommendGameListReq o = (GetRecommendGameListReq) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(begin_idx, o.begin_idx)
        && equals(num, o.num)
        && equals(latitude, o.latitude)
        && equals(longitude, o.longitude);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (begin_idx != null ? begin_idx.hashCode() : 0);
      result = result * 37 + (num != null ? num.hashCode() : 0);
      result = result * 37 + (latitude != null ? latitude.hashCode() : 0);
      result = result * 37 + (longitude != null ? longitude.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetRecommendGameListReq> {

    public ByteString reserved_buf;
    public Integer begin_idx;
    public Integer num;
    public Float latitude;
    public Float longitude;

    public Builder() {
    }

    public Builder(GetRecommendGameListReq message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.begin_idx = message.begin_idx;
      this.num = message.num;
      this.latitude = message.latitude;
      this.longitude = message.longitude;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
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

    /**
     * 数目
     */
    public Builder latitude(Float latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     * 当前位置的纬度信息
     */
    public Builder longitude(Float longitude) {
      this.longitude = longitude;
      return this;
    }

    @Override
    public GetRecommendGameListReq build() {
      return new GetRecommendGameListReq(this);
    }
  }
}
