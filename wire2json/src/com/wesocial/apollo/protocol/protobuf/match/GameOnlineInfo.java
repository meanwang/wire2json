// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\match.proto
package com.wesocial.apollo.protocol.protobuf.match;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Label.REPEATED;

public final class GameOnlineInfo extends Message {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_GAME_ID = 0;
  public static final Integer DEFAULT_GAMESVR_ID = 0;
  public static final Integer DEFAULT_TABLE_ID = 0;
  public static final Long DEFAULT_TABLE_SEQ = 0L;
  public static final Integer DEFAULT_GAME_STATUS = 0;
  public static final List<OnlineUserInfo> DEFAULT_USER_INFO = Collections.emptyList();

  @ProtoField(tag = 1, type = INT32)
  public final Integer game_id;

  /**
   * 游戏id
   */
  @ProtoField(tag = 2, type = INT32)
  public final Integer gamesvr_id;

  /**
   * gamesvr id
   */
  @ProtoField(tag = 3, type = INT32)
  public final Integer table_id;

  /**
   * 牌桌id
   */
  @ProtoField(tag = 4, type = INT64)
  public final Long table_seq;

  /**
   * 牌桌seq
   */
  @ProtoField(tag = 5, type = INT32)
  public final Integer game_status;

  /**
   * 牌局状态 1:游戏进行中 2:游戏已结束
   */
  @ProtoField(tag = 6, label = REPEATED, messageType = OnlineUserInfo.class)
  public final List<OnlineUserInfo> user_info;

  public GameOnlineInfo(Integer game_id, Integer gamesvr_id, Integer table_id, Long table_seq, Integer game_status, List<OnlineUserInfo> user_info) {
    this.game_id = game_id;
    this.gamesvr_id = gamesvr_id;
    this.table_id = table_id;
    this.table_seq = table_seq;
    this.game_status = game_status;
    this.user_info = immutableCopyOf(user_info);
  }

  private GameOnlineInfo(Builder builder) {
    this(builder.game_id, builder.gamesvr_id, builder.table_id, builder.table_seq, builder.game_status, builder.user_info);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GameOnlineInfo)) return false;
    GameOnlineInfo o = (GameOnlineInfo) other;
    return equals(game_id, o.game_id)
        && equals(gamesvr_id, o.gamesvr_id)
        && equals(table_id, o.table_id)
        && equals(table_seq, o.table_seq)
        && equals(game_status, o.game_status)
        && equals(user_info, o.user_info);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = game_id != null ? game_id.hashCode() : 0;
      result = result * 37 + (gamesvr_id != null ? gamesvr_id.hashCode() : 0);
      result = result * 37 + (table_id != null ? table_id.hashCode() : 0);
      result = result * 37 + (table_seq != null ? table_seq.hashCode() : 0);
      result = result * 37 + (game_status != null ? game_status.hashCode() : 0);
      result = result * 37 + (user_info != null ? user_info.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GameOnlineInfo> {

    public Integer game_id;
    public Integer gamesvr_id;
    public Integer table_id;
    public Long table_seq;
    public Integer game_status;
    public List<OnlineUserInfo> user_info;

    public Builder() {
    }

    public Builder(GameOnlineInfo message) {
      super(message);
      if (message == null) return;
      this.game_id = message.game_id;
      this.gamesvr_id = message.gamesvr_id;
      this.table_id = message.table_id;
      this.table_seq = message.table_seq;
      this.game_status = message.game_status;
      this.user_info = copyOf(message.user_info);
    }

    public Builder game_id(Integer game_id) {
      this.game_id = game_id;
      return this;
    }

    /**
     * 游戏id
     */
    public Builder gamesvr_id(Integer gamesvr_id) {
      this.gamesvr_id = gamesvr_id;
      return this;
    }

    /**
     * gamesvr id
     */
    public Builder table_id(Integer table_id) {
      this.table_id = table_id;
      return this;
    }

    /**
     * 牌桌id
     */
    public Builder table_seq(Long table_seq) {
      this.table_seq = table_seq;
      return this;
    }

    /**
     * 牌桌seq
     */
    public Builder game_status(Integer game_status) {
      this.game_status = game_status;
      return this;
    }

    /**
     * 牌局状态 1:游戏进行中 2:游戏已结束
     */
    public Builder user_info(List<OnlineUserInfo> user_info) {
      this.user_info = checkForNulls(user_info);
      return this;
    }

    @Override
    public GameOnlineInfo build() {
      return new GameOnlineInfo(this);
    }
  }
}