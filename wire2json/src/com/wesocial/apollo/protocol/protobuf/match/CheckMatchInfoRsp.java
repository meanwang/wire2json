// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\match.proto
package com.wesocial.apollo.protocol.protobuf.match;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import com.wesocial.apollo.protocol.protobuf.game.GamePlayerInfo;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Label.REPEATED;

public final class CheckMatchInfoRsp extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final List<GamePlayerInfo> DEFAULT_PLAYER_INFO = Collections.emptyList();
  public static final Integer DEFAULT_MATCH_STATUS = 0;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, label = REPEATED, messageType = GamePlayerInfo.class)
  public final List<GamePlayerInfo> player_info;

  /**
   * 玩家匹配到的所有玩家列表
   */
  @ProtoField(tag = 3, type = INT32)
  public final Integer match_status;

  public CheckMatchInfoRsp(ByteString reserved_buf, List<GamePlayerInfo> player_info, Integer match_status) {
    this.reserved_buf = reserved_buf;
    this.player_info = immutableCopyOf(player_info);
    this.match_status = match_status;
  }

  private CheckMatchInfoRsp(Builder builder) {
    this(builder.reserved_buf, builder.player_info, builder.match_status);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof CheckMatchInfoRsp)) return false;
    CheckMatchInfoRsp o = (CheckMatchInfoRsp) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(player_info, o.player_info)
        && equals(match_status, o.match_status);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (player_info != null ? player_info.hashCode() : 1);
      result = result * 37 + (match_status != null ? match_status.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<CheckMatchInfoRsp> {

    public ByteString reserved_buf;
    public List<GamePlayerInfo> player_info;
    public Integer match_status;

    public Builder() {
    }

    public Builder(CheckMatchInfoRsp message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.player_info = copyOf(message.player_info);
      this.match_status = message.match_status;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder player_info(List<GamePlayerInfo> player_info) {
      this.player_info = checkForNulls(player_info);
      return this;
    }

    /**
     * 玩家匹配到的所有玩家列表
     */
    public Builder match_status(Integer match_status) {
      this.match_status = match_status;
      return this;
    }

    @Override
    public CheckMatchInfoRsp build() {
      return new CheckMatchInfoRsp(this);
    }
  }
}