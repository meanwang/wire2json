// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\pay.proto
package com.wesocial.apollo.protocol.protobuf.pay;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.UINT32;

public final class GetBalanceReq extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Integer DEFAULT_FETCH_FIELDS = 0;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = UINT32)
  public final Integer fetch_fields;

  public GetBalanceReq(ByteString reserved_buf, Integer fetch_fields) {
    this.reserved_buf = reserved_buf;
    this.fetch_fields = fetch_fields;
  }

  private GetBalanceReq(Builder builder) {
    this(builder.reserved_buf, builder.fetch_fields);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetBalanceReq)) return false;
    GetBalanceReq o = (GetBalanceReq) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(fetch_fields, o.fetch_fields);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (fetch_fields != null ? fetch_fields.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetBalanceReq> {

    public ByteString reserved_buf;
    public Integer fetch_fields;

    public Builder() {
    }

    public Builder(GetBalanceReq message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.fetch_fields = message.fetch_fields;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder fetch_fields(Integer fetch_fields) {
      this.fetch_fields = fetch_fields;
      return this;
    }

    @Override
    public GetBalanceReq build() {
      return new GetBalanceReq(this);
    }
  }
}