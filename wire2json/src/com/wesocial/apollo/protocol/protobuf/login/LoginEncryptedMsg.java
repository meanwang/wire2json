// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\login.proto
package com.wesocial.apollo.protocol.protobuf.login;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Datatype.UINT32;

public final class LoginEncryptedMsg extends Message {
  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_LOGIN_ID = "";
  public static final String DEFAULT_MD5_PASSWD = "";
  public static final Integer DEFAULT_TIMESTAMP = 0;
  public static final ByteString DEFAULT_ACCESS_TOKEN = ByteString.EMPTY;

  @ProtoField(tag = 1, type = STRING)
  public final String login_id;

  /**
   * login_id
   */
  @ProtoField(tag = 2, type = STRING)
  public final String md5_passwd;

  /**
   * passwd
   */
  @ProtoField(tag = 3, type = UINT32)
  public final Integer timestamp;

  /**
   * 时戳(client本地时戳)
   */
  @ProtoField(tag = 4, type = BYTES)
  public final ByteString access_token;

  public LoginEncryptedMsg(String login_id, String md5_passwd, Integer timestamp, ByteString access_token) {
    this.login_id = login_id;
    this.md5_passwd = md5_passwd;
    this.timestamp = timestamp;
    this.access_token = access_token;
  }

  private LoginEncryptedMsg(Builder builder) {
    this(builder.login_id, builder.md5_passwd, builder.timestamp, builder.access_token);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof LoginEncryptedMsg)) return false;
    LoginEncryptedMsg o = (LoginEncryptedMsg) other;
    return equals(login_id, o.login_id)
        && equals(md5_passwd, o.md5_passwd)
        && equals(timestamp, o.timestamp)
        && equals(access_token, o.access_token);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = login_id != null ? login_id.hashCode() : 0;
      result = result * 37 + (md5_passwd != null ? md5_passwd.hashCode() : 0);
      result = result * 37 + (timestamp != null ? timestamp.hashCode() : 0);
      result = result * 37 + (access_token != null ? access_token.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<LoginEncryptedMsg> {

    public String login_id;
    public String md5_passwd;
    public Integer timestamp;
    public ByteString access_token;

    public Builder() {
    }

    public Builder(LoginEncryptedMsg message) {
      super(message);
      if (message == null) return;
      this.login_id = message.login_id;
      this.md5_passwd = message.md5_passwd;
      this.timestamp = message.timestamp;
      this.access_token = message.access_token;
    }

    public Builder login_id(String login_id) {
      this.login_id = login_id;
      return this;
    }

    /**
     * login_id
     */
    public Builder md5_passwd(String md5_passwd) {
      this.md5_passwd = md5_passwd;
      return this;
    }

    /**
     * passwd
     */
    public Builder timestamp(Integer timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    /**
     * 时戳(client本地时戳)
     */
    public Builder access_token(ByteString access_token) {
      this.access_token = access_token;
      return this;
    }

    @Override
    public LoginEncryptedMsg build() {
      return new LoginEncryptedMsg(this);
    }
  }
}
