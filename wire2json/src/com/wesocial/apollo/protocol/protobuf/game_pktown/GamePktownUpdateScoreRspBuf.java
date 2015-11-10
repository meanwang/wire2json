// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\game_pktown.proto
package com.wesocial.apollo.protocol.protobuf.game_pktown;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GamePktownUpdateScoreRspBuf extends Message {
  private static final long serialVersionUID = 0L;

  @ProtoField(tag = 1)
  public final GamePktownGamedata game_data;

  public GamePktownUpdateScoreRspBuf(GamePktownGamedata game_data) {
    this.game_data = game_data;
  }

  private GamePktownUpdateScoreRspBuf(Builder builder) {
    this(builder.game_data);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GamePktownUpdateScoreRspBuf)) return false;
    return equals(game_data, ((GamePktownUpdateScoreRspBuf) other).game_data);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = game_data != null ? game_data.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<GamePktownUpdateScoreRspBuf> {

    public GamePktownGamedata game_data;

    public Builder() {
    }

    public Builder(GamePktownUpdateScoreRspBuf message) {
      super(message);
      if (message == null) return;
      this.game_data = message.game_data;
    }

    public Builder game_data(GamePktownGamedata game_data) {
      this.game_data = game_data;
      return this;
    }

    @Override
    public GamePktownUpdateScoreRspBuf build() {
      return new GamePktownUpdateScoreRspBuf(this);
    }
  }
}