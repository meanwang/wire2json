// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\pvpmatch.proto
package com.wesocial.apollo.protocol.protobuf.pvpmatch;

import com.squareup.wire.ProtoEnum;

public enum PvpMatch_UserStatus
    implements ProtoEnum {
  kPlaying(1),
  /**
   * 游戏中
   */
  kPlayOver(2),
  /**
   * 用户游戏结束
   */
  kPlayQuit(3),
  /**
   * 用户退出
   */
  kPlayMatching(4),
  /**
   * 用户匹配中
   */
  kPlayInit(5);

  private final int value;

  private PvpMatch_UserStatus(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }
}