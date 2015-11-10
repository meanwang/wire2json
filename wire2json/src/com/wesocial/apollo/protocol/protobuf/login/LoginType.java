// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\login.proto
package com.wesocial.apollo.protocol.protobuf.login;

import com.squareup.wire.ProtoEnum;

public enum LoginType
    implements ProtoEnum {
  kLoginByGuest(0),
  /**
   * 游客模式
   */
  kLoginByQQ(1),
  /**
   * QQ登录
   */
  kLoginByMobile(2),
  /**
   * 手机登录
   */
  kLoginByWeChat(3),
  /**
   * 微信登录
   */
  kLoginByQQOpenid(4);

  private final int value;

  private LoginType(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }
}
