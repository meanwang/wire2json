// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\profile.proto
package com.wesocial.apollo.protocol.protobuf.profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;

/**
 * 返回用户的基础信息、扩展信息、头像信息以及对应的版本
 * 对于拉取自己的信息时还会返回推送信息，拉取他人信息时则不返回推送信息
 */
public final class GetUserInfoRsp extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2)
  public final AllUserInfo user_info;

  public GetUserInfoRsp(ByteString reserved_buf, AllUserInfo user_info) {
    this.reserved_buf = reserved_buf;
    this.user_info = user_info;
  }

  private GetUserInfoRsp(Builder builder) {
    this(builder.reserved_buf, builder.user_info);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetUserInfoRsp)) return false;
    GetUserInfoRsp o = (GetUserInfoRsp) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(user_info, o.user_info);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (user_info != null ? user_info.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetUserInfoRsp> {

    public ByteString reserved_buf;
    public AllUserInfo user_info;

    public Builder() {
    }

    public Builder(GetUserInfoRsp message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.user_info = message.user_info;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder user_info(AllUserInfo user_info) {
      this.user_info = user_info;
      return this;
    }

    @Override
    public GetUserInfoRsp build() {
      return new GetUserInfoRsp(this);
    }
  }
}