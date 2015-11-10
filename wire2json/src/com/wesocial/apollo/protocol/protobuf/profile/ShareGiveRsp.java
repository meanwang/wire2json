// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\profile.proto
package com.wesocial.apollo.protocol.protobuf.profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.INT32;

public final class ShareGiveRsp extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Integer DEFAULT_FLOWER_NUM = 0;
  public static final Integer DEFAULT_NEW_ADD = 0;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = INT32)
  public final Integer flower_num;

  /**
   * 用户目前总的花的数目
   */
  @ProtoField(tag = 3, type = INT32)
  public final Integer new_add;

  public ShareGiveRsp(ByteString reserved_buf, Integer flower_num, Integer new_add) {
    this.reserved_buf = reserved_buf;
    this.flower_num = flower_num;
    this.new_add = new_add;
  }

  private ShareGiveRsp(Builder builder) {
    this(builder.reserved_buf, builder.flower_num, builder.new_add);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ShareGiveRsp)) return false;
    ShareGiveRsp o = (ShareGiveRsp) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(flower_num, o.flower_num)
        && equals(new_add, o.new_add);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (flower_num != null ? flower_num.hashCode() : 0);
      result = result * 37 + (new_add != null ? new_add.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ShareGiveRsp> {

    public ByteString reserved_buf;
    public Integer flower_num;
    public Integer new_add;

    public Builder() {
    }

    public Builder(ShareGiveRsp message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.flower_num = message.flower_num;
      this.new_add = message.new_add;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder flower_num(Integer flower_num) {
      this.flower_num = flower_num;
      return this;
    }

    /**
     * 用户目前总的花的数目
     */
    public Builder new_add(Integer new_add) {
      this.new_add = new_add;
      return this;
    }

    @Override
    public ShareGiveRsp build() {
      return new ShareGiveRsp(this);
    }
  }
}
