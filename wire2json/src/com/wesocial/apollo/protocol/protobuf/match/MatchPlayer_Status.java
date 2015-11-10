// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\match.proto
package com.wesocial.apollo.protocol.protobuf.match;

import com.squareup.wire.ProtoEnum;

public enum MatchPlayer_Status
    implements ProtoEnum {
  kMatchAcceptOk(1),
  /**
   * 接受匹配请求
   */
  kMatchAlreadyGaming(2),
  /**
   * 拒绝匹配请求 玩家已经在游戏中
   */
  kMatchAlreadyMathing(3),
  /**
   * 拒绝匹配请求 玩家处于匹配中
   */
  kMatchCoinNotEnough(4);

  private final int value;

  private MatchPlayer_Status(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }
}