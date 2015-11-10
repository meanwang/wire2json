// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\lbs.proto
package com.wesocial.apollo.protocol.protobuf.lbs;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.FLOAT;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.UINT64;

/**
 * -------------------------------------------------------------
 * 客户端和服务端交互协议
 * -------------------------------------------------------------
 */
public final class LBSInfo extends Message {
  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_INNER_ID = 0L;
  public static final Float DEFAULT_DISTANCE = 0F;
  public static final Long DEFAULT_TIMESTAMP = 0L;
  public static final Float DEFAULT_LATITUDE = 0F;
  public static final Float DEFAULT_LONGITUDE = 0F;
  public static final Integer DEFAULT_SEX = 0;
  public static final Long DEFAULT_GAME_BIT_FLAG = 0L;

  @ProtoField(tag = 1, type = UINT64)
  public final Long inner_id;

  /**
   * 好友的inner_id
   */
  @ProtoField(tag = 2, type = FLOAT)
  public final Float distance;

  /**
   * 好友距离用户的距离 (单位: m)
   */
  @ProtoField(tag = 3, type = INT64)
  public final Long timestamp;

  /**
   * 计算距离的时间点(单位: ms)
   */
  @ProtoField(tag = 7, type = FLOAT)
  public final Float latitude;

  /**
   * 纬度
   */
  @ProtoField(tag = 8, type = FLOAT)
  public final Float longitude;

  /**
   * 经度
   */
  @ProtoField(tag = 10, type = INT32)
  public final Integer sex;

  /**
   * 1 - male 2 - female
   */
  @ProtoField(tag = 11, type = UINT64)
  public final Long game_bit_flag;

  public LBSInfo(Long inner_id, Float distance, Long timestamp, Float latitude, Float longitude, Integer sex, Long game_bit_flag) {
    this.inner_id = inner_id;
    this.distance = distance;
    this.timestamp = timestamp;
    this.latitude = latitude;
    this.longitude = longitude;
    this.sex = sex;
    this.game_bit_flag = game_bit_flag;
  }

  private LBSInfo(Builder builder) {
    this(builder.inner_id, builder.distance, builder.timestamp, builder.latitude, builder.longitude, builder.sex, builder.game_bit_flag);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof LBSInfo)) return false;
    LBSInfo o = (LBSInfo) other;
    return equals(inner_id, o.inner_id)
        && equals(distance, o.distance)
        && equals(timestamp, o.timestamp)
        && equals(latitude, o.latitude)
        && equals(longitude, o.longitude)
        && equals(sex, o.sex)
        && equals(game_bit_flag, o.game_bit_flag);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = inner_id != null ? inner_id.hashCode() : 0;
      result = result * 37 + (distance != null ? distance.hashCode() : 0);
      result = result * 37 + (timestamp != null ? timestamp.hashCode() : 0);
      result = result * 37 + (latitude != null ? latitude.hashCode() : 0);
      result = result * 37 + (longitude != null ? longitude.hashCode() : 0);
      result = result * 37 + (sex != null ? sex.hashCode() : 0);
      result = result * 37 + (game_bit_flag != null ? game_bit_flag.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<LBSInfo> {

    public Long inner_id;
    public Float distance;
    public Long timestamp;
    public Float latitude;
    public Float longitude;
    public Integer sex;
    public Long game_bit_flag;

    public Builder() {
    }

    public Builder(LBSInfo message) {
      super(message);
      if (message == null) return;
      this.inner_id = message.inner_id;
      this.distance = message.distance;
      this.timestamp = message.timestamp;
      this.latitude = message.latitude;
      this.longitude = message.longitude;
      this.sex = message.sex;
      this.game_bit_flag = message.game_bit_flag;
    }

    public Builder inner_id(Long inner_id) {
      this.inner_id = inner_id;
      return this;
    }

    /**
     * 好友的inner_id
     */
    public Builder distance(Float distance) {
      this.distance = distance;
      return this;
    }

    /**
     * 好友距离用户的距离 (单位: m)
     */
    public Builder timestamp(Long timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    /**
     * 计算距离的时间点(单位: ms)
     */
    public Builder latitude(Float latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     * 纬度
     */
    public Builder longitude(Float longitude) {
      this.longitude = longitude;
      return this;
    }

    /**
     * 经度
     */
    public Builder sex(Integer sex) {
      this.sex = sex;
      return this;
    }

    /**
     * 1 - male 2 - female
     */
    public Builder game_bit_flag(Long game_bit_flag) {
      this.game_bit_flag = game_bit_flag;
      return this;
    }

    @Override
    public LBSInfo build() {
      return new LBSInfo(this);
    }
  }
}