// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\profile.proto
package com.wesocial.apollo.protocol.protobuf.profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.INT32;

/**
 * XI. 拉取推荐标签
 * CMD为GET_RECOMMEND_TAG_V2（105）
 */
public final class GetRecommendTagV2Req extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Integer DEFAULT_INDEX = 0;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = INT32)
  public final Integer index;

  public GetRecommendTagV2Req(ByteString reserved_buf, Integer index) {
    this.reserved_buf = reserved_buf;
    this.index = index;
  }

  private GetRecommendTagV2Req(Builder builder) {
    this(builder.reserved_buf, builder.index);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetRecommendTagV2Req)) return false;
    GetRecommendTagV2Req o = (GetRecommendTagV2Req) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(index, o.index);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (index != null ? index.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetRecommendTagV2Req> {

    public ByteString reserved_buf;
    public Integer index;

    public Builder() {
    }

    public Builder(GetRecommendTagV2Req message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.index = message.index;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder index(Integer index) {
      this.index = index;
      return this;
    }

    @Override
    public GetRecommendTagV2Req build() {
      return new GetRecommendTagV2Req(this);
    }
  }
}
