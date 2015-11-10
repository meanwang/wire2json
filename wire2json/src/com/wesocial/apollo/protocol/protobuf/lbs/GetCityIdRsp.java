// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\lbs.proto
package com.wesocial.apollo.protocol.protobuf.lbs;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.UINT32;

public final class GetCityIdRsp extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final Integer DEFAULT_CITY_ID = 0;
  public static final Integer DEFAULT_PROVINCE_ID = 0;

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = UINT32)
  public final Integer city_id;

  /**
   * city id
   */
  @ProtoField(tag = 3, type = UINT32)
  public final Integer province_id;

  public GetCityIdRsp(ByteString reserved_buf, Integer city_id, Integer province_id) {
    this.reserved_buf = reserved_buf;
    this.city_id = city_id;
    this.province_id = province_id;
  }

  private GetCityIdRsp(Builder builder) {
    this(builder.reserved_buf, builder.city_id, builder.province_id);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetCityIdRsp)) return false;
    GetCityIdRsp o = (GetCityIdRsp) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(city_id, o.city_id)
        && equals(province_id, o.province_id);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (city_id != null ? city_id.hashCode() : 0);
      result = result * 37 + (province_id != null ? province_id.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetCityIdRsp> {

    public ByteString reserved_buf;
    public Integer city_id;
    public Integer province_id;

    public Builder() {
    }

    public Builder(GetCityIdRsp message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.city_id = message.city_id;
      this.province_id = message.province_id;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder city_id(Integer city_id) {
      this.city_id = city_id;
      return this;
    }

    /**
     * city id
     */
    public Builder province_id(Integer province_id) {
      this.province_id = province_id;
      return this;
    }

    @Override
    public GetCityIdRsp build() {
      return new GetCityIdRsp(this);
    }
  }
}
