// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\profile.proto
package com.wesocial.apollo.protocol.protobuf.profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;

public final class ModifyProfileTagV2Rsp extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  public ModifyProfileTagV2Rsp(ByteString reserved_buf) {
    this.reserved_buf = reserved_buf;
  }

  private ModifyProfileTagV2Rsp(Builder builder) {
    this(builder.reserved_buf);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ModifyProfileTagV2Rsp)) return false;
    return equals(reserved_buf, ((ModifyProfileTagV2Rsp) other).reserved_buf);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = reserved_buf != null ? reserved_buf.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<ModifyProfileTagV2Rsp> {

    public ByteString reserved_buf;

    public Builder() {
    }

    public Builder(ModifyProfileTagV2Rsp message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    @Override
    public ModifyProfileTagV2Rsp build() {
      return new ModifyProfileTagV2Rsp(this);
    }
  }
}