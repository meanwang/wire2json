// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\push.proto
package com.wesocial.apollo.protocol.protobuf.push;

import com.squareup.wire.ProtoEnum;

public enum NetWorkType
    implements ProtoEnum {
  kNetworkUnknow(0),
  kNetworkWifi(1),
  kNetworkGPRS(2),
  kNetworkEdge(3),
  kNetworkWCDMA(4),
  kNetworkHSDPA(5),
  kNetworkHSUPA(6),
  kNetworkCDMA1x(7),
  kNetworkCDMAEVDORev0(8),
  kNetworkCDMAEVDORevA(9),
  kNetworkCDMAEVDORevB(10),
  kNetworkHRPD(11),
  kNetworkLTE(12);

  private final int value;

  private NetWorkType(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }
}