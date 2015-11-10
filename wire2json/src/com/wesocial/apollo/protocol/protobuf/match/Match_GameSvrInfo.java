// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\match.proto
package com.wesocial.apollo.protocol.protobuf.match;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;

public final class Match_GameSvrInfo extends Message {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_GAMESVR_ID = 0;
  public static final Integer DEFAULT_TABLE_NUM = 0;

  @ProtoField(tag = 1, type = INT32)
  public final Integer gamesvr_id;

  /**
   * gamesvr id
   */
  @ProtoField(tag = 2, type = INT32)
  public final Integer table_num;

  public Match_GameSvrInfo(Integer gamesvr_id, Integer table_num) {
    this.gamesvr_id = gamesvr_id;
    this.table_num = table_num;
  }

  private Match_GameSvrInfo(Builder builder) {
    this(builder.gamesvr_id, builder.table_num);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Match_GameSvrInfo)) return false;
    Match_GameSvrInfo o = (Match_GameSvrInfo) other;
    return equals(gamesvr_id, o.gamesvr_id)
        && equals(table_num, o.table_num);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = gamesvr_id != null ? gamesvr_id.hashCode() : 0;
      result = result * 37 + (table_num != null ? table_num.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Match_GameSvrInfo> {

    public Integer gamesvr_id;
    public Integer table_num;

    public Builder() {
    }

    public Builder(Match_GameSvrInfo message) {
      super(message);
      if (message == null) return;
      this.gamesvr_id = message.gamesvr_id;
      this.table_num = message.table_num;
    }

    public Builder gamesvr_id(Integer gamesvr_id) {
      this.gamesvr_id = gamesvr_id;
      return this;
    }

    /**
     * gamesvr id
     */
    public Builder table_num(Integer table_num) {
      this.table_num = table_num;
      return this;
    }

    @Override
    public Match_GameSvrInfo build() {
      return new Match_GameSvrInfo(this);
    }
  }
}
