// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\pvpmatch.proto
package com.wesocial.apollo.protocol.protobuf.pvpmatch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;

/**
 * -------------------------------------------------------------
 * 2. 相关基础结构体
 * -------------------------------------------------------------
 */
public final class PvpMatch_GameInfo extends Message {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_GAME_ID = 0;
  public static final Integer DEFAULT_GAME_POLICY = 0;
  public static final Integer DEFAULT_BASE_COIN = 0;
  public static final Integer DEFAULT_MATHCING_OVER_TIME = 0;
  public static final Integer DEFAULT_GROUP_NUM = 0;

  @ProtoField(tag = 1, type = INT32)
  public final Integer game_id;

  /**
   * 游戏id
   */
  @ProtoField(tag = 2, type = INT32)
  public final Integer game_policy;

  /**
   * 游戏的玩法
   */
  @ProtoField(tag = 3, type = INT32)
  public final Integer base_coin;

  /**
   * 游戏金币
   */
  @ProtoField(tag = 4, type = INT32)
  public final Integer mathcing_over_time;

  /**
   * 排队超时时间
   */
  @ProtoField(tag = 5, type = INT32)
  public final Integer group_num;

  public PvpMatch_GameInfo(Integer game_id, Integer game_policy, Integer base_coin, Integer mathcing_over_time, Integer group_num) {
    this.game_id = game_id;
    this.game_policy = game_policy;
    this.base_coin = base_coin;
    this.mathcing_over_time = mathcing_over_time;
    this.group_num = group_num;
  }

  private PvpMatch_GameInfo(Builder builder) {
    this(builder.game_id, builder.game_policy, builder.base_coin, builder.mathcing_over_time, builder.group_num);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof PvpMatch_GameInfo)) return false;
    PvpMatch_GameInfo o = (PvpMatch_GameInfo) other;
    return equals(game_id, o.game_id)
        && equals(game_policy, o.game_policy)
        && equals(base_coin, o.base_coin)
        && equals(mathcing_over_time, o.mathcing_over_time)
        && equals(group_num, o.group_num);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = game_id != null ? game_id.hashCode() : 0;
      result = result * 37 + (game_policy != null ? game_policy.hashCode() : 0);
      result = result * 37 + (base_coin != null ? base_coin.hashCode() : 0);
      result = result * 37 + (mathcing_over_time != null ? mathcing_over_time.hashCode() : 0);
      result = result * 37 + (group_num != null ? group_num.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<PvpMatch_GameInfo> {

    public Integer game_id;
    public Integer game_policy;
    public Integer base_coin;
    public Integer mathcing_over_time;
    public Integer group_num;

    public Builder() {
    }

    public Builder(PvpMatch_GameInfo message) {
      super(message);
      if (message == null) return;
      this.game_id = message.game_id;
      this.game_policy = message.game_policy;
      this.base_coin = message.base_coin;
      this.mathcing_over_time = message.mathcing_over_time;
      this.group_num = message.group_num;
    }

    public Builder game_id(Integer game_id) {
      this.game_id = game_id;
      return this;
    }

    /**
     * 游戏id
     */
    public Builder game_policy(Integer game_policy) {
      this.game_policy = game_policy;
      return this;
    }

    /**
     * 游戏的玩法
     */
    public Builder base_coin(Integer base_coin) {
      this.base_coin = base_coin;
      return this;
    }

    /**
     * 游戏金币
     */
    public Builder mathcing_over_time(Integer mathcing_over_time) {
      this.mathcing_over_time = mathcing_over_time;
      return this;
    }

    /**
     * 排队超时时间
     */
    public Builder group_num(Integer group_num) {
      this.group_num = group_num;
      return this;
    }

    @Override
    public PvpMatch_GameInfo build() {
      return new PvpMatch_GameInfo(this);
    }
  }
}