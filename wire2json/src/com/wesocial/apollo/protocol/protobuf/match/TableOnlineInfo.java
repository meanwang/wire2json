// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\match.proto
package com.wesocial.apollo.protocol.protobuf.match;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import com.wesocial.apollo.protocol.protobuf.game.RouteInfo;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Label.REPEATED;

public final class TableOnlineInfo extends Message {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_TABLE_STATUS = 0;
  public static final Long DEFAULT_TABLE_VERSION = 0L;
  public static final List<TableMember> DEFAULT_TABLE_MEMBER = Collections.emptyList();
  public static final Integer DEFAULT_CREATE_TIMESTAMP = 0;
  public static final Integer DEFAULT_GAME_POLICY = 0;

  @ProtoField(tag = 1)
  public final RouteInfo route_info;

  /**
   * 路由信息
   */
  @ProtoField(tag = 2, type = INT32)
  public final Integer table_status;

  @ProtoField(tag = 3, type = INT64)
  public final Long table_version;

  /**
   * 牌桌版本号
   */
  @ProtoField(tag = 4, label = REPEATED, messageType = TableMember.class)
  public final List<TableMember> table_member;

  /**
   * 牌桌上用户inner id 列表
   */
  @ProtoField(tag = 5, type = INT32)
  public final Integer create_timestamp;

  /**
   * time
   */
  @ProtoField(tag = 6, type = INT32)
  public final Integer game_policy;

  public TableOnlineInfo(RouteInfo route_info, Integer table_status, Long table_version, List<TableMember> table_member, Integer create_timestamp, Integer game_policy) {
    this.route_info = route_info;
    this.table_status = table_status;
    this.table_version = table_version;
    this.table_member = immutableCopyOf(table_member);
    this.create_timestamp = create_timestamp;
    this.game_policy = game_policy;
  }

  private TableOnlineInfo(Builder builder) {
    this(builder.route_info, builder.table_status, builder.table_version, builder.table_member, builder.create_timestamp, builder.game_policy);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof TableOnlineInfo)) return false;
    TableOnlineInfo o = (TableOnlineInfo) other;
    return equals(route_info, o.route_info)
        && equals(table_status, o.table_status)
        && equals(table_version, o.table_version)
        && equals(table_member, o.table_member)
        && equals(create_timestamp, o.create_timestamp)
        && equals(game_policy, o.game_policy);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = route_info != null ? route_info.hashCode() : 0;
      result = result * 37 + (table_status != null ? table_status.hashCode() : 0);
      result = result * 37 + (table_version != null ? table_version.hashCode() : 0);
      result = result * 37 + (table_member != null ? table_member.hashCode() : 1);
      result = result * 37 + (create_timestamp != null ? create_timestamp.hashCode() : 0);
      result = result * 37 + (game_policy != null ? game_policy.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<TableOnlineInfo> {

    public RouteInfo route_info;
    public Integer table_status;
    public Long table_version;
    public List<TableMember> table_member;
    public Integer create_timestamp;
    public Integer game_policy;

    public Builder() {
    }

    public Builder(TableOnlineInfo message) {
      super(message);
      if (message == null) return;
      this.route_info = message.route_info;
      this.table_status = message.table_status;
      this.table_version = message.table_version;
      this.table_member = copyOf(message.table_member);
      this.create_timestamp = message.create_timestamp;
      this.game_policy = message.game_policy;
    }

    public Builder route_info(RouteInfo route_info) {
      this.route_info = route_info;
      return this;
    }

    /**
     * 路由信息
     */
    public Builder table_status(Integer table_status) {
      this.table_status = table_status;
      return this;
    }

    public Builder table_version(Long table_version) {
      this.table_version = table_version;
      return this;
    }

    /**
     * 牌桌版本号
     */
    public Builder table_member(List<TableMember> table_member) {
      this.table_member = checkForNulls(table_member);
      return this;
    }

    /**
     * 牌桌上用户inner id 列表
     */
    public Builder create_timestamp(Integer create_timestamp) {
      this.create_timestamp = create_timestamp;
      return this;
    }

    /**
     * time
     */
    public Builder game_policy(Integer game_policy) {
      this.game_policy = game_policy;
      return this;
    }

    @Override
    public TableOnlineInfo build() {
      return new TableOnlineInfo(this);
    }
  }
}
