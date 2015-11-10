// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\game.proto
package com.wesocial.apollo.protocol.protobuf.game;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

/**
 * 游戏结果
 */
public final class GameResult extends Message {
  private static final long serialVersionUID = 0L;

  public static final List<PlayerResult> DEFAULT_PLAYER_RESULT = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED, messageType = PlayerResult.class)
  public final List<PlayerResult> player_result;

  public GameResult(List<PlayerResult> player_result) {
    this.player_result = immutableCopyOf(player_result);
  }

  private GameResult(Builder builder) {
    this(builder.player_result);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GameResult)) return false;
    return equals(player_result, ((GameResult) other).player_result);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = player_result != null ? player_result.hashCode() : 1);
  }

  public static final class Builder extends Message.Builder<GameResult> {

    public List<PlayerResult> player_result;

    public Builder() {
    }

    public Builder(GameResult message) {
      super(message);
      if (message == null) return;
      this.player_result = copyOf(message.player_result);
    }

    public Builder player_result(List<PlayerResult> player_result) {
      this.player_result = checkForNulls(player_result);
      return this;
    }

    @Override
    public GameResult build() {
      return new GameResult(this);
    }
  }
}
