// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\message.proto
package com.wesocial.apollo.protocol.protobuf.message;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

public final class RichMessage extends Message {
  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_TITLE = "";
  public static final String DEFAULT_TEXT = "";
  public static final String DEFAULT_URL = "";
  public static final String DEFAULT_IMAGE = "";
  public static final String DEFAULT_S_TEXT = "";
  public static final String DEFAULT_S_IMAGE = "";

  @ProtoField(tag = 1, type = STRING)
  public final String title;

  /**
   * 标题
   */
  @ProtoField(tag = 2, type = STRING)
  public final String text;

  /**
   * 正文内容
   */
  @ProtoField(tag = 3, type = STRING)
  public final String url;

  /**
   * 跳转url
   */
  @ProtoField(tag = 4, type = STRING)
  public final String image;

  /**
   * 图片url，如果不是标准http链接，需要加默认前缀http://dlied5.qq.com/lianpu/
   */
  @ProtoField(tag = 5, type = STRING)
  public final String s_text;

  /**
   * 来源文本
   */
  @ProtoField(tag = 6, type = STRING)
  public final String s_image;

  public RichMessage(String title, String text, String url, String image, String s_text, String s_image) {
    this.title = title;
    this.text = text;
    this.url = url;
    this.image = image;
    this.s_text = s_text;
    this.s_image = s_image;
  }

  private RichMessage(Builder builder) {
    this(builder.title, builder.text, builder.url, builder.image, builder.s_text, builder.s_image);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RichMessage)) return false;
    RichMessage o = (RichMessage) other;
    return equals(title, o.title)
        && equals(text, o.text)
        && equals(url, o.url)
        && equals(image, o.image)
        && equals(s_text, o.s_text)
        && equals(s_image, o.s_image);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = title != null ? title.hashCode() : 0;
      result = result * 37 + (text != null ? text.hashCode() : 0);
      result = result * 37 + (url != null ? url.hashCode() : 0);
      result = result * 37 + (image != null ? image.hashCode() : 0);
      result = result * 37 + (s_text != null ? s_text.hashCode() : 0);
      result = result * 37 + (s_image != null ? s_image.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<RichMessage> {

    public String title;
    public String text;
    public String url;
    public String image;
    public String s_text;
    public String s_image;

    public Builder() {
    }

    public Builder(RichMessage message) {
      super(message);
      if (message == null) return;
      this.title = message.title;
      this.text = message.text;
      this.url = message.url;
      this.image = message.image;
      this.s_text = message.s_text;
      this.s_image = message.s_image;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * 标题
     */
    public Builder text(String text) {
      this.text = text;
      return this;
    }

    /**
     * 正文内容
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * 跳转url
     */
    public Builder image(String image) {
      this.image = image;
      return this;
    }

    /**
     * 图片url，如果不是标准http链接，需要加默认前缀http://dlied5.qq.com/lianpu/
     */
    public Builder s_text(String s_text) {
      this.s_text = s_text;
      return this;
    }

    /**
     * 来源文本
     */
    public Builder s_image(String s_image) {
      this.s_image = s_image;
      return this;
    }

    @Override
    public RichMessage build() {
      return new RichMessage(this);
    }
  }
}