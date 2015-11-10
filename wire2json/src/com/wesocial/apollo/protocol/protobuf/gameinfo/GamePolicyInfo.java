// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\gameinfo.proto
package com.wesocial.apollo.protocol.protobuf.gameinfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class GamePolicyInfo extends Message {
  private static final long serialVersionUID = 0L;

  public static final List<PolicyDetail> DEFAULT_POLICY_INFO = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED, messageType = PolicyDetail.class)
  public final List<PolicyDetail> policy_info;

  public GamePolicyInfo(List<PolicyDetail> policy_info) {
    this.policy_info = immutableCopyOf(policy_info);
  }

  private GamePolicyInfo(Builder builder) {
    this(builder.policy_info);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GamePolicyInfo)) return false;
    return equals(policy_info, ((GamePolicyInfo) other).policy_info);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = policy_info != null ? policy_info.hashCode() : 1);
  }

  public static final class Builder extends Message.Builder<GamePolicyInfo> {

    public List<PolicyDetail> policy_info;

    public Builder() {
    }

    public Builder(GamePolicyInfo message) {
      super(message);
      if (message == null) return;
      this.policy_info = copyOf(message.policy_info);
    }

    public Builder policy_info(List<PolicyDetail> policy_info) {
      this.policy_info = checkForNulls(policy_info);
      return this;
    }

    @Override
    public GamePolicyInfo build() {
      return new GamePolicyInfo(this);
    }
  }
}