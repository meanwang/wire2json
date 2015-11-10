// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\profile.proto
package com.wesocial.apollo.protocol.protobuf.profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;

/**
 * -------------------------------------------------------------
 * 2. 相关基础结构体
 * -------------------------------------------------------------
 * 用户基础信息
 */
public final class BaseUserInfo extends Message {
  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NICK = "";
  public static final Integer DEFAULT_SEX = 0;
  public static final String DEFAULT_BIRTHDAY = "";
  public static final Integer DEFAULT_COUNTRY = 0;
  public static final Integer DEFAULT_PROVINCE = 0;
  public static final Integer DEFAULT_CITY = 0;
  public static final Integer DEFAULT_JOB = 0;
  public static final Integer DEFAULT_HEIGHT = 0;
  public static final Integer DEFAULT_BLOOD_TYPE = 0;
  public static final Integer DEFAULT_AGE = 0;
  public static final Integer DEFAULT_CONSTELLATION = 0;
  public static final String DEFAULT_HEAD_URL = "";
  public static final ByteString DEFAULT_USER_NOTES = ByteString.EMPTY;

  @ProtoField(tag = 1, type = STRING)
  public final String nick;

  /**
   * 昵称
   */
  @ProtoField(tag = 2, type = INT32)
  public final Integer sex;

  /**
   * 性别 (1:男 2:女)
   */
  @ProtoField(tag = 3, type = STRING)
  public final String birthday;

  /**
   * 出生日期 (YYYY-MM-DD形式，1988-10-28)
   */
  @ProtoField(tag = 4, type = INT32)
  public final Integer country;

  /**
   * 国家码
   */
  @ProtoField(tag = 5, type = INT32)
  public final Integer province;

  /**
   * 省份码
   */
  @ProtoField(tag = 6, type = INT32)
  public final Integer city;

  /**
   * 城市码
   */
  @ProtoField(tag = 7, type = INT32)
  public final Integer job;

  /**
   * 职业码
   */
  @ProtoField(tag = 8, type = INT32)
  public final Integer height;

  /**
   * 身高,单位cm
   */
  @ProtoField(tag = 9, type = INT32)
  public final Integer blood_type;

  /**
   * 血型 (A:1,B:2,AB:3,O:4,其他:5)
   */
  @ProtoField(tag = 10, type = INT32)
  public final Integer age;

  /**
   * 年龄 (仅回应使用，根据出生日期计算）
   */
  @ProtoField(tag = 11, type = INT32)
  public final Integer constellation;

  /**
   * 星座 (仅回应使用，根据出生日期计算）
   */
  @ProtoField(tag = 12, type = STRING)
  public final String head_url;

  /**
   * 用户第一张头像 (仅回应使用）
   */
  @ProtoField(tag = 13, type = BYTES)
  public final ByteString user_notes;

  public BaseUserInfo(String nick, Integer sex, String birthday, Integer country, Integer province, Integer city, Integer job, Integer height, Integer blood_type, Integer age, Integer constellation, String head_url, ByteString user_notes) {
    this.nick = nick;
    this.sex = sex;
    this.birthday = birthday;
    this.country = country;
    this.province = province;
    this.city = city;
    this.job = job;
    this.height = height;
    this.blood_type = blood_type;
    this.age = age;
    this.constellation = constellation;
    this.head_url = head_url;
    this.user_notes = user_notes;
  }

  private BaseUserInfo(Builder builder) {
    this(builder.nick, builder.sex, builder.birthday, builder.country, builder.province, builder.city, builder.job, builder.height, builder.blood_type, builder.age, builder.constellation, builder.head_url, builder.user_notes);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof BaseUserInfo)) return false;
    BaseUserInfo o = (BaseUserInfo) other;
    return equals(nick, o.nick)
        && equals(sex, o.sex)
        && equals(birthday, o.birthday)
        && equals(country, o.country)
        && equals(province, o.province)
        && equals(city, o.city)
        && equals(job, o.job)
        && equals(height, o.height)
        && equals(blood_type, o.blood_type)
        && equals(age, o.age)
        && equals(constellation, o.constellation)
        && equals(head_url, o.head_url)
        && equals(user_notes, o.user_notes);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = nick != null ? nick.hashCode() : 0;
      result = result * 37 + (sex != null ? sex.hashCode() : 0);
      result = result * 37 + (birthday != null ? birthday.hashCode() : 0);
      result = result * 37 + (country != null ? country.hashCode() : 0);
      result = result * 37 + (province != null ? province.hashCode() : 0);
      result = result * 37 + (city != null ? city.hashCode() : 0);
      result = result * 37 + (job != null ? job.hashCode() : 0);
      result = result * 37 + (height != null ? height.hashCode() : 0);
      result = result * 37 + (blood_type != null ? blood_type.hashCode() : 0);
      result = result * 37 + (age != null ? age.hashCode() : 0);
      result = result * 37 + (constellation != null ? constellation.hashCode() : 0);
      result = result * 37 + (head_url != null ? head_url.hashCode() : 0);
      result = result * 37 + (user_notes != null ? user_notes.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<BaseUserInfo> {

    public String nick;
    public Integer sex;
    public String birthday;
    public Integer country;
    public Integer province;
    public Integer city;
    public Integer job;
    public Integer height;
    public Integer blood_type;
    public Integer age;
    public Integer constellation;
    public String head_url;
    public ByteString user_notes;

    public Builder() {
    }

    public Builder(BaseUserInfo message) {
      super(message);
      if (message == null) return;
      this.nick = message.nick;
      this.sex = message.sex;
      this.birthday = message.birthday;
      this.country = message.country;
      this.province = message.province;
      this.city = message.city;
      this.job = message.job;
      this.height = message.height;
      this.blood_type = message.blood_type;
      this.age = message.age;
      this.constellation = message.constellation;
      this.head_url = message.head_url;
      this.user_notes = message.user_notes;
    }

    public Builder nick(String nick) {
      this.nick = nick;
      return this;
    }

    /**
     * 昵称
     */
    public Builder sex(Integer sex) {
      this.sex = sex;
      return this;
    }

    /**
     * 性别 (1:男 2:女)
     */
    public Builder birthday(String birthday) {
      this.birthday = birthday;
      return this;
    }

    /**
     * 出生日期 (YYYY-MM-DD形式，1988-10-28)
     */
    public Builder country(Integer country) {
      this.country = country;
      return this;
    }

    /**
     * 国家码
     */
    public Builder province(Integer province) {
      this.province = province;
      return this;
    }

    /**
     * 省份码
     */
    public Builder city(Integer city) {
      this.city = city;
      return this;
    }

    /**
     * 城市码
     */
    public Builder job(Integer job) {
      this.job = job;
      return this;
    }

    /**
     * 职业码
     */
    public Builder height(Integer height) {
      this.height = height;
      return this;
    }

    /**
     * 身高,单位cm
     */
    public Builder blood_type(Integer blood_type) {
      this.blood_type = blood_type;
      return this;
    }

    /**
     * 血型 (A:1,B:2,AB:3,O:4,其他:5)
     */
    public Builder age(Integer age) {
      this.age = age;
      return this;
    }

    /**
     * 年龄 (仅回应使用，根据出生日期计算）
     */
    public Builder constellation(Integer constellation) {
      this.constellation = constellation;
      return this;
    }

    /**
     * 星座 (仅回应使用，根据出生日期计算）
     */
    public Builder head_url(String head_url) {
      this.head_url = head_url;
      return this;
    }

    /**
     * 用户第一张头像 (仅回应使用）
     */
    public Builder user_notes(ByteString user_notes) {
      this.user_notes = user_notes;
      return this;
    }

    @Override
    public BaseUserInfo build() {
      return new BaseUserInfo(this);
    }
  }
}
