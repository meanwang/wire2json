// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\profile.proto
package com.wesocial.apollo.protocol.protobuf.profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.INT32;

public final class ModifyUserInfoRsp extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Integer DEFAULT_FLOWER_NUM = 0;
  public static final Integer DEFAULT_RECIEVE_GAME_COIN_NUM = 0;
  public static final Integer DEFAULT_RECIEVE_DIAMOND_NUM = 0;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2)
  public final UserVersion user_version;

  @ProtoField(tag = 3, type = INT32)
  public final Integer flower_num;

  /**
   * 个人总的花的数量
   */
  @ProtoField(tag = 4, type = INT32)
  public final Integer recieve_game_coin_num;

  /**
   * 注册送游戏币
   */
  @ProtoField(tag = 5, type = INT32)
  public final Integer recieve_diamond_num;

  public ModifyUserInfoRsp(ByteString reserved_buf, UserVersion user_version, Integer flower_num, Integer recieve_game_coin_num, Integer recieve_diamond_num) {
    this.reserved_buf = reserved_buf;
    this.user_version = user_version;
    this.flower_num = flower_num;
    this.recieve_game_coin_num = recieve_game_coin_num;
    this.recieve_diamond_num = recieve_diamond_num;
  }

  private ModifyUserInfoRsp(Builder builder) {
    this(builder.reserved_buf, builder.user_version, builder.flower_num, builder.recieve_game_coin_num, builder.recieve_diamond_num);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ModifyUserInfoRsp)) return false;
    ModifyUserInfoRsp o = (ModifyUserInfoRsp) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(user_version, o.user_version)
        && equals(flower_num, o.flower_num)
        && equals(recieve_game_coin_num, o.recieve_game_coin_num)
        && equals(recieve_diamond_num, o.recieve_diamond_num);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (user_version != null ? user_version.hashCode() : 0);
      result = result * 37 + (flower_num != null ? flower_num.hashCode() : 0);
      result = result * 37 + (recieve_game_coin_num != null ? recieve_game_coin_num.hashCode() : 0);
      result = result * 37 + (recieve_diamond_num != null ? recieve_diamond_num.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ModifyUserInfoRsp> {

    public ByteString reserved_buf;
    public UserVersion user_version;
    public Integer flower_num;
    public Integer recieve_game_coin_num;
    public Integer recieve_diamond_num;

    public Builder() {
    }

    public Builder(ModifyUserInfoRsp message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.user_version = message.user_version;
      this.flower_num = message.flower_num;
      this.recieve_game_coin_num = message.recieve_game_coin_num;
      this.recieve_diamond_num = message.recieve_diamond_num;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder user_version(UserVersion user_version) {
      this.user_version = user_version;
      return this;
    }

    public Builder flower_num(Integer flower_num) {
      this.flower_num = flower_num;
      return this;
    }

    /**
     * 个人总的花的数量
     */
    public Builder recieve_game_coin_num(Integer recieve_game_coin_num) {
      this.recieve_game_coin_num = recieve_game_coin_num;
      return this;
    }

    /**
     * 注册送游戏币
     */
    public Builder recieve_diamond_num(Integer recieve_diamond_num) {
      this.recieve_diamond_num = recieve_diamond_num;
      return this;
    }

    @Override
    public ModifyUserInfoRsp build() {
      return new ModifyUserInfoRsp(this);
    }
  }
}