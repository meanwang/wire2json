// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\match.proto
package com.wesocial.apollo.protocol.protobuf.match;

import com.squareup.wire.ProtoEnum;

public enum TableType
    implements ProtoEnum {
  kMultiType(1),
  /**
   * 多人场
   */
  kPkType(2);

  private final int value;

  private TableType(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }
}