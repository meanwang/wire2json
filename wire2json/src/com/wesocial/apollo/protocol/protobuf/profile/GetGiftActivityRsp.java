// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\profile.proto
package com.wesocial.apollo.protocol.protobuf.profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Label.REPEATED;

public final class GetGiftActivityRsp extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final List<GiftActivity> DEFAULT_GIFT_ACTIVITY_LIST = Collections.emptyList();

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, label = REPEATED, messageType = GiftActivity.class)
  public final List<GiftActivity> gift_activity_list;

  public GetGiftActivityRsp(ByteString reserved_buf, List<GiftActivity> gift_activity_list) {
    this.reserved_buf = reserved_buf;
    this.gift_activity_list = immutableCopyOf(gift_activity_list);
  }

  private GetGiftActivityRsp(Builder builder) {
    this(builder.reserved_buf, builder.gift_activity_list);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetGiftActivityRsp)) return false;
    GetGiftActivityRsp o = (GetGiftActivityRsp) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(gift_activity_list, o.gift_activity_list);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (gift_activity_list != null ? gift_activity_list.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetGiftActivityRsp> {

    public ByteString reserved_buf;
    public List<GiftActivity> gift_activity_list;

    public Builder() {
    }

    public Builder(GetGiftActivityRsp message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.gift_activity_list = copyOf(message.gift_activity_list);
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder gift_activity_list(List<GiftActivity> gift_activity_list) {
      this.gift_activity_list = checkForNulls(gift_activity_list);
      return this;
    }

    @Override
    public GetGiftActivityRsp build() {
      return new GetGiftActivityRsp(this);
    }
  }
}
