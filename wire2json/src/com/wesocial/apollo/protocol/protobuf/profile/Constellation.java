// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\profile.proto
package com.wesocial.apollo.protocol.protobuf.profile;

import com.squareup.wire.ProtoEnum;

public enum Constellation
    implements ProtoEnum {
  kNoBirthday(0),
  /**
   * 无生日
   */
  kAquarius(1),
  /**
   * 水瓶
   */
  kPisces(2),
  /**
   * 双鱼
   */
  kAries(3),
  /**
   * 牧羊
   */
  kTaurus(4),
  /**
   * 金牛
   */
  kGemini(5),
  /**
   * 双子
   */
  kCancer(6),
  /**
   * 巨蟹
   */
  kLeo(7),
  /**
   * 狮子
   */
  kVirgo(8),
  /**
   * 处女
   */
  kLibra(9),
  /**
   * 天秤
   */
  kScorpio(10),
  /**
   * 天蝎
   */
  kSagittarius(11),
  /**
   * 射手
   */
  kCapricorn(12);

  private final int value;

  private Constellation(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }
}
