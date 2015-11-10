// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\gameinfo.proto
package com.wesocial.apollo.protocol.protobuf.gameinfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.INT32;

/**
 * 游戏基础信息
 */
public final class GameInfo extends Message {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_GAME_ID = 0;
  public static final ByteString DEFAULT_GAME_NAME = ByteString.EMPTY;
  public static final ByteString DEFAULT_GAME_ICON_URL = ByteString.EMPTY;
  public static final ByteString DEFAULT_GAME_TITLE = ByteString.EMPTY;
  public static final ByteString DEFAULT_GAME_ABSTRACT = ByteString.EMPTY;
  public static final ByteString DEFAULT_GAME_JUMP_URL = ByteString.EMPTY;
  public static final ByteString DEFAULT_GAME_SO = ByteString.EMPTY;
  public static final Integer DEFAULT_MULTI_FLAG = 0;
  public static final Integer DEFAULT_PK_FLAG = 0;
  public static final Integer DEFAULT_MATHCING_OVER_TIME = 0;
  public static final Integer DEFAULT_GROUP_NUM = 0;
  public static final Integer DEFAULT_IF_AI_PLAY = 0;
  public static final ByteString DEFAULT_GAME_PROPERTY = ByteString.EMPTY;

  @ProtoField(tag = 1, type = INT32)
  public final Integer game_id;

  /**
   * 游戏id
   */
  @ProtoField(tag = 2, type = BYTES)
  public final ByteString game_name;

  /**
   * 游戏名称
   */
  @ProtoField(tag = 3, type = BYTES)
  public final ByteString game_icon_url;

  /**
   * 游戏icon
   */
  @ProtoField(tag = 4, type = BYTES)
  public final ByteString game_title;

  /**
   * 游戏标题
   */
  @ProtoField(tag = 5, type = BYTES)
  public final ByteString game_abstract;

  /**
   * 游戏一句话简介
   */
  @ProtoField(tag = 6, type = BYTES)
  public final ByteString game_jump_url;

  /**
   * 游戏跳转url
   */
  @ProtoField(tag = 7, type = BYTES)
  public final ByteString game_so;

  /**
   * 游戏so
   */
  @ProtoField(tag = 8, type = INT32)
  public final Integer multi_flag;

  /**
   * 游戏是否支持多人场 1支持 0不支持
   */
  @ProtoField(tag = 9, type = INT32)
  public final Integer pk_flag;

  /**
   * 游戏是否支持pk场 1支持 0不支持
   */
  @ProtoField(tag = 10, type = INT32)
  public final Integer mathcing_over_time;

  /**
   * 游戏匹配超时时间 单位s
   */
  @ProtoField(tag = 11, type = INT32)
  public final Integer group_num;

  /**
   * 游戏匹配人数
   */
  @ProtoField(tag = 12)
  public final GamePolicyInfo policy_info;

  /**
   * 游戏场次信息
   */
  @ProtoField(tag = 13, type = INT32)
  public final Integer if_ai_play;

  /**
   * 游戏匹配超时时是否可以添加ai 0不能 1可以
   */
  @ProtoField(tag = 14, type = BYTES)
  public final ByteString game_property;

  public GameInfo(Integer game_id, ByteString game_name, ByteString game_icon_url, ByteString game_title, ByteString game_abstract, ByteString game_jump_url, ByteString game_so, Integer multi_flag, Integer pk_flag, Integer mathcing_over_time, Integer group_num, GamePolicyInfo policy_info, Integer if_ai_play, ByteString game_property) {
    this.game_id = game_id;
    this.game_name = game_name;
    this.game_icon_url = game_icon_url;
    this.game_title = game_title;
    this.game_abstract = game_abstract;
    this.game_jump_url = game_jump_url;
    this.game_so = game_so;
    this.multi_flag = multi_flag;
    this.pk_flag = pk_flag;
    this.mathcing_over_time = mathcing_over_time;
    this.group_num = group_num;
    this.policy_info = policy_info;
    this.if_ai_play = if_ai_play;
    this.game_property = game_property;
  }

  private GameInfo(Builder builder) {
    this(builder.game_id, builder.game_name, builder.game_icon_url, builder.game_title, builder.game_abstract, builder.game_jump_url, builder.game_so, builder.multi_flag, builder.pk_flag, builder.mathcing_over_time, builder.group_num, builder.policy_info, builder.if_ai_play, builder.game_property);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GameInfo)) return false;
    GameInfo o = (GameInfo) other;
    return equals(game_id, o.game_id)
        && equals(game_name, o.game_name)
        && equals(game_icon_url, o.game_icon_url)
        && equals(game_title, o.game_title)
        && equals(game_abstract, o.game_abstract)
        && equals(game_jump_url, o.game_jump_url)
        && equals(game_so, o.game_so)
        && equals(multi_flag, o.multi_flag)
        && equals(pk_flag, o.pk_flag)
        && equals(mathcing_over_time, o.mathcing_over_time)
        && equals(group_num, o.group_num)
        && equals(policy_info, o.policy_info)
        && equals(if_ai_play, o.if_ai_play)
        && equals(game_property, o.game_property);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = game_id != null ? game_id.hashCode() : 0;
      result = result * 37 + (game_name != null ? game_name.hashCode() : 0);
      result = result * 37 + (game_icon_url != null ? game_icon_url.hashCode() : 0);
      result = result * 37 + (game_title != null ? game_title.hashCode() : 0);
      result = result * 37 + (game_abstract != null ? game_abstract.hashCode() : 0);
      result = result * 37 + (game_jump_url != null ? game_jump_url.hashCode() : 0);
      result = result * 37 + (game_so != null ? game_so.hashCode() : 0);
      result = result * 37 + (multi_flag != null ? multi_flag.hashCode() : 0);
      result = result * 37 + (pk_flag != null ? pk_flag.hashCode() : 0);
      result = result * 37 + (mathcing_over_time != null ? mathcing_over_time.hashCode() : 0);
      result = result * 37 + (group_num != null ? group_num.hashCode() : 0);
      result = result * 37 + (policy_info != null ? policy_info.hashCode() : 0);
      result = result * 37 + (if_ai_play != null ? if_ai_play.hashCode() : 0);
      result = result * 37 + (game_property != null ? game_property.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GameInfo> {

    public Integer game_id;
    public ByteString game_name;
    public ByteString game_icon_url;
    public ByteString game_title;
    public ByteString game_abstract;
    public ByteString game_jump_url;
    public ByteString game_so;
    public Integer multi_flag;
    public Integer pk_flag;
    public Integer mathcing_over_time;
    public Integer group_num;
    public GamePolicyInfo policy_info;
    public Integer if_ai_play;
    public ByteString game_property;

    public Builder() {
    }

    public Builder(GameInfo message) {
      super(message);
      if (message == null) return;
      this.game_id = message.game_id;
      this.game_name = message.game_name;
      this.game_icon_url = message.game_icon_url;
      this.game_title = message.game_title;
      this.game_abstract = message.game_abstract;
      this.game_jump_url = message.game_jump_url;
      this.game_so = message.game_so;
      this.multi_flag = message.multi_flag;
      this.pk_flag = message.pk_flag;
      this.mathcing_over_time = message.mathcing_over_time;
      this.group_num = message.group_num;
      this.policy_info = message.policy_info;
      this.if_ai_play = message.if_ai_play;
      this.game_property = message.game_property;
    }

    public Builder game_id(Integer game_id) {
      this.game_id = game_id;
      return this;
    }

    /**
     * 游戏id
     */
    public Builder game_name(ByteString game_name) {
      this.game_name = game_name;
      return this;
    }

    /**
     * 游戏名称
     */
    public Builder game_icon_url(ByteString game_icon_url) {
      this.game_icon_url = game_icon_url;
      return this;
    }

    /**
     * 游戏icon
     */
    public Builder game_title(ByteString game_title) {
      this.game_title = game_title;
      return this;
    }

    /**
     * 游戏标题
     */
    public Builder game_abstract(ByteString game_abstract) {
      this.game_abstract = game_abstract;
      return this;
    }

    /**
     * 游戏一句话简介
     */
    public Builder game_jump_url(ByteString game_jump_url) {
      this.game_jump_url = game_jump_url;
      return this;
    }

    /**
     * 游戏跳转url
     */
    public Builder game_so(ByteString game_so) {
      this.game_so = game_so;
      return this;
    }

    /**
     * 游戏so
     */
    public Builder multi_flag(Integer multi_flag) {
      this.multi_flag = multi_flag;
      return this;
    }

    /**
     * 游戏是否支持多人场 1支持 0不支持
     */
    public Builder pk_flag(Integer pk_flag) {
      this.pk_flag = pk_flag;
      return this;
    }

    /**
     * 游戏是否支持pk场 1支持 0不支持
     */
    public Builder mathcing_over_time(Integer mathcing_over_time) {
      this.mathcing_over_time = mathcing_over_time;
      return this;
    }

    /**
     * 游戏匹配超时时间 单位s
     */
    public Builder group_num(Integer group_num) {
      this.group_num = group_num;
      return this;
    }

    /**
     * 游戏匹配人数
     */
    public Builder policy_info(GamePolicyInfo policy_info) {
      this.policy_info = policy_info;
      return this;
    }

    /**
     * 游戏场次信息
     */
    public Builder if_ai_play(Integer if_ai_play) {
      this.if_ai_play = if_ai_play;
      return this;
    }

    /**
     * 游戏匹配超时时是否可以添加ai 0不能 1可以
     */
    public Builder game_property(ByteString game_property) {
      this.game_property = game_property;
      return this;
    }

    @Override
    public GameInfo build() {
      return new GameInfo(this);
    }
  }
}
