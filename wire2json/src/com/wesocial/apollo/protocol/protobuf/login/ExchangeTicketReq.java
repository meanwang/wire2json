// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\login.proto
package com.wesocial.apollo.protocol.protobuf.login;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;

/**
 * CMD = EXCHANGE_TICKET
 */
public final class ExchangeTicketReq extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final ByteString DEFAULT_SECRET_KEY = ByteString.EMPTY;
  public static final ByteString DEFAULT_LOGIN_MSG = ByteString.EMPTY;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = BYTES)
  public final ByteString secret_key;

  /**
   * (用rsa公钥加密aes的key)
   */
  @ProtoField(tag = 3, type = BYTES)
  public final ByteString login_msg;

  public ExchangeTicketReq(ByteString reserved_buf, ByteString secret_key, ByteString login_msg) {
    this.reserved_buf = reserved_buf;
    this.secret_key = secret_key;
    this.login_msg = login_msg;
  }

  private ExchangeTicketReq(Builder builder) {
    this(builder.reserved_buf, builder.secret_key, builder.login_msg);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ExchangeTicketReq)) return false;
    ExchangeTicketReq o = (ExchangeTicketReq) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(secret_key, o.secret_key)
        && equals(login_msg, o.login_msg);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (secret_key != null ? secret_key.hashCode() : 0);
      result = result * 37 + (login_msg != null ? login_msg.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ExchangeTicketReq> {

    public ByteString reserved_buf;
    public ByteString secret_key;
    public ByteString login_msg;

    public Builder() {
    }

    public Builder(ExchangeTicketReq message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.secret_key = message.secret_key;
      this.login_msg = message.login_msg;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder secret_key(ByteString secret_key) {
      this.secret_key = secret_key;
      return this;
    }

    /**
     * (用rsa公钥加密aes的key)
     */
    public Builder login_msg(ByteString login_msg) {
      this.login_msg = login_msg;
      return this;
    }

    @Override
    public ExchangeTicketReq build() {
      return new ExchangeTicketReq(this);
    }
  }
}