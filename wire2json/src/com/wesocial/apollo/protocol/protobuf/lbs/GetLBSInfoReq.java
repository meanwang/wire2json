// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\lbs.proto
package com.wesocial.apollo.protocol.protobuf.lbs;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.UINT64;
import static com.squareup.wire.Message.Label.REPEATED;

/**
 * ////////////////////////////////////////////////////////////////////////////
 * 该接口已废弃
 * cmd = GET_LBS_INFO
 */
public final class GetLBSInfoReq extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final List<Long> DEFAULT_FRIEND_IDS = Collections.emptyList();

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = UINT64, label = REPEATED)
  public final List<Long> friend_ids;

  public GetLBSInfoReq(ByteString reserved_buf, List<Long> friend_ids) {
    this.reserved_buf = reserved_buf;
    this.friend_ids = immutableCopyOf(friend_ids);
  }

  private GetLBSInfoReq(Builder builder) {
    this(builder.reserved_buf, builder.friend_ids);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetLBSInfoReq)) return false;
    GetLBSInfoReq o = (GetLBSInfoReq) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(friend_ids, o.friend_ids);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (friend_ids != null ? friend_ids.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetLBSInfoReq> {

    public ByteString reserved_buf;
    public List<Long> friend_ids;

    public Builder() {
    }

    public Builder(GetLBSInfoReq message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.friend_ids = copyOf(message.friend_ids);
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder friend_ids(List<Long> friend_ids) {
      this.friend_ids = checkForNulls(friend_ids);
      return this;
    }

    @Override
    public GetLBSInfoReq build() {
      return new GetLBSInfoReq(this);
    }
  }
}