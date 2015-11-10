// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\lbs.proto
package com.wesocial.apollo.protocol.protobuf.lbs;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.STRING;

public final class GetLocationDetailRsp extends Message {
  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_RESERVED_BUF = ByteString.EMPTY;
  public static final String DEFAULT_NAME = "";
  public static final String DEFAULT_CODE = "";
  public static final String DEFAULT_NATION = "";
  public static final String DEFAULT_PROVINCE = "";
  public static final String DEFAULT_CITY = "";
  public static final String DEFAULT_DISTRICT = "";
  public static final String DEFAULT_TOWN = "";
  public static final String DEFAULT_VILLAGE = "";
  public static final String DEFAULT_STREET = "";
  public static final String DEFAULT_STREET_NO = "";

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString reserved_buf;

  /**
   * 服务端使用，客户端忽略
   */
  @ProtoField(tag = 2, type = STRING)
  public final String name;

  @ProtoField(tag = 3, type = STRING)
  public final String code;

  @ProtoField(tag = 4, type = STRING)
  public final String nation;

  @ProtoField(tag = 5, type = STRING)
  public final String province;

  @ProtoField(tag = 6, type = STRING)
  public final String city;

  @ProtoField(tag = 7, type = STRING)
  public final String district;

  /**
   * 区， 比如南山区
   */
  @ProtoField(tag = 8, type = STRING)
  public final String town;

  /**
   * 镇
   */
  @ProtoField(tag = 9, type = STRING)
  public final String village;

  /**
   * 村
   */
  @ProtoField(tag = 10, type = STRING)
  public final String street;

  /**
   * 街
   */
  @ProtoField(tag = 11, type = STRING)
  public final String street_no;

  public GetLocationDetailRsp(ByteString reserved_buf, String name, String code, String nation, String province, String city, String district, String town, String village, String street, String street_no) {
    this.reserved_buf = reserved_buf;
    this.name = name;
    this.code = code;
    this.nation = nation;
    this.province = province;
    this.city = city;
    this.district = district;
    this.town = town;
    this.village = village;
    this.street = street;
    this.street_no = street_no;
  }

  private GetLocationDetailRsp(Builder builder) {
    this(builder.reserved_buf, builder.name, builder.code, builder.nation, builder.province, builder.city, builder.district, builder.town, builder.village, builder.street, builder.street_no);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetLocationDetailRsp)) return false;
    GetLocationDetailRsp o = (GetLocationDetailRsp) other;
    return equals(reserved_buf, o.reserved_buf)
        && equals(name, o.name)
        && equals(code, o.code)
        && equals(nation, o.nation)
        && equals(province, o.province)
        && equals(city, o.city)
        && equals(district, o.district)
        && equals(town, o.town)
        && equals(village, o.village)
        && equals(street, o.street)
        && equals(street_no, o.street_no);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reserved_buf != null ? reserved_buf.hashCode() : 0;
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (code != null ? code.hashCode() : 0);
      result = result * 37 + (nation != null ? nation.hashCode() : 0);
      result = result * 37 + (province != null ? province.hashCode() : 0);
      result = result * 37 + (city != null ? city.hashCode() : 0);
      result = result * 37 + (district != null ? district.hashCode() : 0);
      result = result * 37 + (town != null ? town.hashCode() : 0);
      result = result * 37 + (village != null ? village.hashCode() : 0);
      result = result * 37 + (street != null ? street.hashCode() : 0);
      result = result * 37 + (street_no != null ? street_no.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetLocationDetailRsp> {

    public ByteString reserved_buf;
    public String name;
    public String code;
    public String nation;
    public String province;
    public String city;
    public String district;
    public String town;
    public String village;
    public String street;
    public String street_no;

    public Builder() {
    }

    public Builder(GetLocationDetailRsp message) {
      super(message);
      if (message == null) return;
      this.reserved_buf = message.reserved_buf;
      this.name = message.name;
      this.code = message.code;
      this.nation = message.nation;
      this.province = message.province;
      this.city = message.city;
      this.district = message.district;
      this.town = message.town;
      this.village = message.village;
      this.street = message.street;
      this.street_no = message.street_no;
    }

    public Builder reserved_buf(ByteString reserved_buf) {
      this.reserved_buf = reserved_buf;
      return this;
    }

    /**
     * 服务端使用，客户端忽略
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder code(String code) {
      this.code = code;
      return this;
    }

    public Builder nation(String nation) {
      this.nation = nation;
      return this;
    }

    public Builder province(String province) {
      this.province = province;
      return this;
    }

    public Builder city(String city) {
      this.city = city;
      return this;
    }

    public Builder district(String district) {
      this.district = district;
      return this;
    }

    /**
     * 区， 比如南山区
     */
    public Builder town(String town) {
      this.town = town;
      return this;
    }

    /**
     * 镇
     */
    public Builder village(String village) {
      this.village = village;
      return this;
    }

    /**
     * 村
     */
    public Builder street(String street) {
      this.street = street;
      return this;
    }

    /**
     * 街
     */
    public Builder street_no(String street_no) {
      this.street_no = street_no;
      return this;
    }

    @Override
    public GetLocationDetailRsp build() {
      return new GetLocationDetailRsp(this);
    }
  }
}
