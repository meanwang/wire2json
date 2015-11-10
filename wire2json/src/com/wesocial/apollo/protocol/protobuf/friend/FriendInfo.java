// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\friend.proto
package com.wesocial.apollo.protocol.protobuf.friend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.UINT64;

public final class FriendInfo extends Message {
  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_INNER_ID = 0L;
  public static final Integer DEFAULT_TYPE = 0;
  public static final Long DEFAULT_TIMESTAMP = 0L;
  public static final ByteString DEFAULT_NICK_NAME = ByteString.EMPTY;

  @ProtoField(tag = 1, type = UINT64)
  public final Long inner_id;

  /**
   * friend的inner_id
   */
  @ProtoField(tag = 2, type = INT32)
  public final Integer type;

  /**
   * type 根据不同命令FriendType或者GreetType定义
   */
  @ProtoField(tag = 3, type = INT64)
  public final Long timestamp;

  /**
   * 时戳 (second)
   */
  @ProtoField(tag = 4, type = BYTES)
  public final ByteString nick_name;

  public FriendInfo(Long inner_id, Integer type, Long timestamp, ByteString nick_name) {
    this.inner_id = inner_id;
    this.type = type;
    this.timestamp = timestamp;
    this.nick_name = nick_name;
  }

  private FriendInfo(Builder builder) {
    this(builder.inner_id, builder.type, builder.timestamp, builder.nick_name);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FriendInfo)) return false;
    FriendInfo o = (FriendInfo) other;
    return equals(inner_id, o.inner_id)
        && equals(type, o.type)
        && equals(timestamp, o.timestamp)
        && equals(nick_name, o.nick_name);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = inner_id != null ? inner_id.hashCode() : 0;
      result = result * 37 + (type != null ? type.hashCode() : 0);
      result = result * 37 + (timestamp != null ? timestamp.hashCode() : 0);
      result = result * 37 + (nick_name != null ? nick_name.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<FriendInfo> {

    public Long inner_id;
    public Integer type;
    public Long timestamp;
    public ByteString nick_name;

    public Builder() {
    }

    public Builder(FriendInfo message) {
      super(message);
      if (message == null) return;
      this.inner_id = message.inner_id;
      this.type = message.type;
      this.timestamp = message.timestamp;
      this.nick_name = message.nick_name;
    }

    public Builder inner_id(Long inner_id) {
      this.inner_id = inner_id;
      return this;
    }

    /**
     * friend的inner_id
     */
    public Builder type(Integer type) {
      this.type = type;
      return this;
    }

    /**
     * type 根据不同命令FriendType或者GreetType定义
     */
    public Builder timestamp(Long timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    /**
     * 时戳 (second)
     */
    public Builder nick_name(ByteString nick_name) {
      this.nick_name = nick_name;
      return this;
    }

    @Override
    public FriendInfo build() {
      return new FriendInfo(this);
    }
  }
}
