// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\profile.proto
package com.wesocial.apollo.protocol.protobuf.profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Datatype.UINT32;
import static com.squareup.wire.Message.Datatype.UINT64;
import static com.squareup.wire.Message.Label.REPEATED;

public final class AllUserInfo extends Message {
  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_INNER_ID = 0L;
  public static final List<HeadUrlInfo> DEFAULT_HEAD_URLINFO = Collections.emptyList();
  public static final Integer DEFAULT_VIP_LEVEL = 0;
  public static final Integer DEFAULT_USER_RIGHT = 0;
  public static final Integer DEFAULT_FLOWER_NUM = 0;
  public static final Integer DEFAULT_COIN_NUM = 0;
  public static final Integer DEFAULT_COMMON_TAG = 0;
  public static final Integer DEFAULT_FRIEND_TYPE = 0;
  public static final Integer DEFAULT_LAST_WEIXIN_SHARE_TIME = 0;
  public static final Integer DEFAULT_LAST_QQ_SHARE_TIME = 0;
  public static final Integer DEFAULT_LAST_FRIEND_SHARE_TIME = 0;
  public static final Integer DEFAULT_LAST_REVIEW_TIME = 0;
  public static final List<String> DEFAULT_COMMON_TAG_NAMES = Collections.emptyList();
  public static final Integer DEFAULT_LAST_TAKE_LOTTERY_TIME = 0;
  public static final Integer DEFAULT_LAST_SHARED_TAKE_LOTTERY_TIME = 0;
  public static final Integer DEFAULT_INCR_DAILY_GOLD_NUM = 0;
  public static final Integer DEFAULT_INCR_DAILY_COIN_NUM = 0;
  public static final Integer DEFAULT_INCR_WEEK_GOLD_NUM = 0;
  public static final Integer DEFAULT_INCR_WEEK_COIN_NUM = 0;
  public static final Integer DEFAULT_GAME_COIN_NUM = 0;
  public static final Integer DEFAULT_DIAMOND_NUM = 0;

  @ProtoField(tag = 1, type = UINT64)
  public final Long inner_id;

  /**
   * 用户唯一的inner_id
   */
  @ProtoField(tag = 2)
  public final BaseUserInfo base_user_info;

  /**
   * 用户基础信息
   */
  @ProtoField(tag = 3)
  public final ExtraUserInfo extra_user_info;

  /**
   * 用户额外信息
   */
  @ProtoField(tag = 4, label = REPEATED, messageType = HeadUrlInfo.class)
  public final List<HeadUrlInfo> head_urlinfo;

  /**
   * 用户头像信息
   */
  @ProtoField(tag = 5)
  public final UserVersion user_version;

  /**
   * 用户版本信息
   */
  @ProtoField(tag = 6, type = INT32)
  public final Integer vip_level;

  /**
   * 用户VIP等级（仅回应使用）
   */
  @ProtoField(tag = 7, type = INT32)
  public final Integer user_right;

  /**
   * 用户权限（仅回应使用，在查看自己信息时返回）
   */
  @ProtoField(tag = 8, type = INT32)
  public final Integer flower_num;

  /**
   * 用户拥有的花数目（仅回应使用，在查看自己信息时返回）
   */
  @ProtoField(tag = 9, type = INT32)
  public final Integer coin_num;

  /**
   * 用户拥有的积分数目（仅回应使用，在查看自己信息时返回）
   */
  @ProtoField(tag = 10, type = INT32)
  public final Integer common_tag;

  /**
   * 是否有相同标签 1:有 2:没有（仅回应使用，在查看他人信息时返回）
   */
  @ProtoField(tag = 11, type = INT32)
  public final Integer friend_type;

  /**
   * 用户好友关系 参考FriendType定义 1.关注 2.粉丝 3.相互关注 （仅回应使用，在查看他人信息时返回）
   */
  @ProtoField(tag = 12, type = UINT32)
  public final Integer last_weixin_share_time;

  /**
   * 上一次分享微信奖励时间（仅回应使用）
   */
  @ProtoField(tag = 13, type = UINT32)
  public final Integer last_qq_share_time;

  /**
   * 上一次分享QQ奖励时间 （仅回应使用）
   */
  @ProtoField(tag = 14, type = UINT32)
  public final Integer last_friend_share_time;

  /**
   * 上一次分享朋友圈奖励时间 （仅回应使用）
   */
  @ProtoField(tag = 15, type = UINT32)
  public final Integer last_review_time;

  /**
   * 上一次评价奖励时间 （仅回应使用）
   */
  @ProtoField(tag = 16, type = STRING, label = REPEATED)
  public final List<String> common_tag_names;

  /**
   * 用户的共同标签（仅回应使用，在批量获取他人信息时返回）
   */
  @ProtoField(tag = 17, type = UINT32)
  public final Integer last_take_lottery_time;

  /**
   * 上一次抽奖时间
   */
  @ProtoField(tag = 18, type = UINT32)
  public final Integer last_shared_take_lottery_time;

  /**
   * 上一次分享抽奖时间
   */
  @ProtoField(tag = 19, type = UINT32)
  public final Integer incr_daily_gold_num;

  /**
   * 当天消耗的金币数
   */
  @ProtoField(tag = 20, type = UINT32)
  public final Integer incr_daily_coin_num;

  /**
   * 当天收到的积分
   */
  @ProtoField(tag = 21, type = UINT32)
  public final Integer incr_week_gold_num;

  /**
   * 7天内消耗的金币数
   */
  @ProtoField(tag = 22, type = UINT32)
  public final Integer incr_week_coin_num;

  /**
   * 7天内收到的积分
   */
  @ProtoField(tag = 23, type = INT32)
  public final Integer game_coin_num;

  /**
   * 游戏币
   */
  @ProtoField(tag = 24, type = INT32)
  public final Integer diamond_num;

  public AllUserInfo(Long inner_id, BaseUserInfo base_user_info, ExtraUserInfo extra_user_info, List<HeadUrlInfo> head_urlinfo, UserVersion user_version, Integer vip_level, Integer user_right, Integer flower_num, Integer coin_num, Integer common_tag, Integer friend_type, Integer last_weixin_share_time, Integer last_qq_share_time, Integer last_friend_share_time, Integer last_review_time, List<String> common_tag_names, Integer last_take_lottery_time, Integer last_shared_take_lottery_time, Integer incr_daily_gold_num, Integer incr_daily_coin_num, Integer incr_week_gold_num, Integer incr_week_coin_num, Integer game_coin_num, Integer diamond_num) {
    this.inner_id = inner_id;
    this.base_user_info = base_user_info;
    this.extra_user_info = extra_user_info;
    this.head_urlinfo = immutableCopyOf(head_urlinfo);
    this.user_version = user_version;
    this.vip_level = vip_level;
    this.user_right = user_right;
    this.flower_num = flower_num;
    this.coin_num = coin_num;
    this.common_tag = common_tag;
    this.friend_type = friend_type;
    this.last_weixin_share_time = last_weixin_share_time;
    this.last_qq_share_time = last_qq_share_time;
    this.last_friend_share_time = last_friend_share_time;
    this.last_review_time = last_review_time;
    this.common_tag_names = immutableCopyOf(common_tag_names);
    this.last_take_lottery_time = last_take_lottery_time;
    this.last_shared_take_lottery_time = last_shared_take_lottery_time;
    this.incr_daily_gold_num = incr_daily_gold_num;
    this.incr_daily_coin_num = incr_daily_coin_num;
    this.incr_week_gold_num = incr_week_gold_num;
    this.incr_week_coin_num = incr_week_coin_num;
    this.game_coin_num = game_coin_num;
    this.diamond_num = diamond_num;
  }

  private AllUserInfo(Builder builder) {
    this(builder.inner_id, builder.base_user_info, builder.extra_user_info, builder.head_urlinfo, builder.user_version, builder.vip_level, builder.user_right, builder.flower_num, builder.coin_num, builder.common_tag, builder.friend_type, builder.last_weixin_share_time, builder.last_qq_share_time, builder.last_friend_share_time, builder.last_review_time, builder.common_tag_names, builder.last_take_lottery_time, builder.last_shared_take_lottery_time, builder.incr_daily_gold_num, builder.incr_daily_coin_num, builder.incr_week_gold_num, builder.incr_week_coin_num, builder.game_coin_num, builder.diamond_num);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AllUserInfo)) return false;
    AllUserInfo o = (AllUserInfo) other;
    return equals(inner_id, o.inner_id)
        && equals(base_user_info, o.base_user_info)
        && equals(extra_user_info, o.extra_user_info)
        && equals(head_urlinfo, o.head_urlinfo)
        && equals(user_version, o.user_version)
        && equals(vip_level, o.vip_level)
        && equals(user_right, o.user_right)
        && equals(flower_num, o.flower_num)
        && equals(coin_num, o.coin_num)
        && equals(common_tag, o.common_tag)
        && equals(friend_type, o.friend_type)
        && equals(last_weixin_share_time, o.last_weixin_share_time)
        && equals(last_qq_share_time, o.last_qq_share_time)
        && equals(last_friend_share_time, o.last_friend_share_time)
        && equals(last_review_time, o.last_review_time)
        && equals(common_tag_names, o.common_tag_names)
        && equals(last_take_lottery_time, o.last_take_lottery_time)
        && equals(last_shared_take_lottery_time, o.last_shared_take_lottery_time)
        && equals(incr_daily_gold_num, o.incr_daily_gold_num)
        && equals(incr_daily_coin_num, o.incr_daily_coin_num)
        && equals(incr_week_gold_num, o.incr_week_gold_num)
        && equals(incr_week_coin_num, o.incr_week_coin_num)
        && equals(game_coin_num, o.game_coin_num)
        && equals(diamond_num, o.diamond_num);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = inner_id != null ? inner_id.hashCode() : 0;
      result = result * 37 + (base_user_info != null ? base_user_info.hashCode() : 0);
      result = result * 37 + (extra_user_info != null ? extra_user_info.hashCode() : 0);
      result = result * 37 + (head_urlinfo != null ? head_urlinfo.hashCode() : 1);
      result = result * 37 + (user_version != null ? user_version.hashCode() : 0);
      result = result * 37 + (vip_level != null ? vip_level.hashCode() : 0);
      result = result * 37 + (user_right != null ? user_right.hashCode() : 0);
      result = result * 37 + (flower_num != null ? flower_num.hashCode() : 0);
      result = result * 37 + (coin_num != null ? coin_num.hashCode() : 0);
      result = result * 37 + (common_tag != null ? common_tag.hashCode() : 0);
      result = result * 37 + (friend_type != null ? friend_type.hashCode() : 0);
      result = result * 37 + (last_weixin_share_time != null ? last_weixin_share_time.hashCode() : 0);
      result = result * 37 + (last_qq_share_time != null ? last_qq_share_time.hashCode() : 0);
      result = result * 37 + (last_friend_share_time != null ? last_friend_share_time.hashCode() : 0);
      result = result * 37 + (last_review_time != null ? last_review_time.hashCode() : 0);
      result = result * 37 + (common_tag_names != null ? common_tag_names.hashCode() : 1);
      result = result * 37 + (last_take_lottery_time != null ? last_take_lottery_time.hashCode() : 0);
      result = result * 37 + (last_shared_take_lottery_time != null ? last_shared_take_lottery_time.hashCode() : 0);
      result = result * 37 + (incr_daily_gold_num != null ? incr_daily_gold_num.hashCode() : 0);
      result = result * 37 + (incr_daily_coin_num != null ? incr_daily_coin_num.hashCode() : 0);
      result = result * 37 + (incr_week_gold_num != null ? incr_week_gold_num.hashCode() : 0);
      result = result * 37 + (incr_week_coin_num != null ? incr_week_coin_num.hashCode() : 0);
      result = result * 37 + (game_coin_num != null ? game_coin_num.hashCode() : 0);
      result = result * 37 + (diamond_num != null ? diamond_num.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<AllUserInfo> {

    public Long inner_id;
    public BaseUserInfo base_user_info;
    public ExtraUserInfo extra_user_info;
    public List<HeadUrlInfo> head_urlinfo;
    public UserVersion user_version;
    public Integer vip_level;
    public Integer user_right;
    public Integer flower_num;
    public Integer coin_num;
    public Integer common_tag;
    public Integer friend_type;
    public Integer last_weixin_share_time;
    public Integer last_qq_share_time;
    public Integer last_friend_share_time;
    public Integer last_review_time;
    public List<String> common_tag_names;
    public Integer last_take_lottery_time;
    public Integer last_shared_take_lottery_time;
    public Integer incr_daily_gold_num;
    public Integer incr_daily_coin_num;
    public Integer incr_week_gold_num;
    public Integer incr_week_coin_num;
    public Integer game_coin_num;
    public Integer diamond_num;

    public Builder() {
    }

    public Builder(AllUserInfo message) {
      super(message);
      if (message == null) return;
      this.inner_id = message.inner_id;
      this.base_user_info = message.base_user_info;
      this.extra_user_info = message.extra_user_info;
      this.head_urlinfo = copyOf(message.head_urlinfo);
      this.user_version = message.user_version;
      this.vip_level = message.vip_level;
      this.user_right = message.user_right;
      this.flower_num = message.flower_num;
      this.coin_num = message.coin_num;
      this.common_tag = message.common_tag;
      this.friend_type = message.friend_type;
      this.last_weixin_share_time = message.last_weixin_share_time;
      this.last_qq_share_time = message.last_qq_share_time;
      this.last_friend_share_time = message.last_friend_share_time;
      this.last_review_time = message.last_review_time;
      this.common_tag_names = copyOf(message.common_tag_names);
      this.last_take_lottery_time = message.last_take_lottery_time;
      this.last_shared_take_lottery_time = message.last_shared_take_lottery_time;
      this.incr_daily_gold_num = message.incr_daily_gold_num;
      this.incr_daily_coin_num = message.incr_daily_coin_num;
      this.incr_week_gold_num = message.incr_week_gold_num;
      this.incr_week_coin_num = message.incr_week_coin_num;
      this.game_coin_num = message.game_coin_num;
      this.diamond_num = message.diamond_num;
    }

    public Builder inner_id(Long inner_id) {
      this.inner_id = inner_id;
      return this;
    }

    /**
     * 用户唯一的inner_id
     */
    public Builder base_user_info(BaseUserInfo base_user_info) {
      this.base_user_info = base_user_info;
      return this;
    }

    /**
     * 用户基础信息
     */
    public Builder extra_user_info(ExtraUserInfo extra_user_info) {
      this.extra_user_info = extra_user_info;
      return this;
    }

    /**
     * 用户额外信息
     */
    public Builder head_urlinfo(List<HeadUrlInfo> head_urlinfo) {
      this.head_urlinfo = checkForNulls(head_urlinfo);
      return this;
    }

    /**
     * 用户头像信息
     */
    public Builder user_version(UserVersion user_version) {
      this.user_version = user_version;
      return this;
    }

    /**
     * 用户版本信息
     */
    public Builder vip_level(Integer vip_level) {
      this.vip_level = vip_level;
      return this;
    }

    /**
     * 用户VIP等级（仅回应使用）
     */
    public Builder user_right(Integer user_right) {
      this.user_right = user_right;
      return this;
    }

    /**
     * 用户权限（仅回应使用，在查看自己信息时返回）
     */
    public Builder flower_num(Integer flower_num) {
      this.flower_num = flower_num;
      return this;
    }

    /**
     * 用户拥有的花数目（仅回应使用，在查看自己信息时返回）
     */
    public Builder coin_num(Integer coin_num) {
      this.coin_num = coin_num;
      return this;
    }

    /**
     * 用户拥有的积分数目（仅回应使用，在查看自己信息时返回）
     */
    public Builder common_tag(Integer common_tag) {
      this.common_tag = common_tag;
      return this;
    }

    /**
     * 是否有相同标签 1:有 2:没有（仅回应使用，在查看他人信息时返回）
     */
    public Builder friend_type(Integer friend_type) {
      this.friend_type = friend_type;
      return this;
    }

    /**
     * 用户好友关系 参考FriendType定义 1.关注 2.粉丝 3.相互关注 （仅回应使用，在查看他人信息时返回）
     */
    public Builder last_weixin_share_time(Integer last_weixin_share_time) {
      this.last_weixin_share_time = last_weixin_share_time;
      return this;
    }

    /**
     * 上一次分享微信奖励时间（仅回应使用）
     */
    public Builder last_qq_share_time(Integer last_qq_share_time) {
      this.last_qq_share_time = last_qq_share_time;
      return this;
    }

    /**
     * 上一次分享QQ奖励时间 （仅回应使用）
     */
    public Builder last_friend_share_time(Integer last_friend_share_time) {
      this.last_friend_share_time = last_friend_share_time;
      return this;
    }

    /**
     * 上一次分享朋友圈奖励时间 （仅回应使用）
     */
    public Builder last_review_time(Integer last_review_time) {
      this.last_review_time = last_review_time;
      return this;
    }

    /**
     * 上一次评价奖励时间 （仅回应使用）
     */
    public Builder common_tag_names(List<String> common_tag_names) {
      this.common_tag_names = checkForNulls(common_tag_names);
      return this;
    }

    /**
     * 用户的共同标签（仅回应使用，在批量获取他人信息时返回）
     */
    public Builder last_take_lottery_time(Integer last_take_lottery_time) {
      this.last_take_lottery_time = last_take_lottery_time;
      return this;
    }

    /**
     * 上一次抽奖时间
     */
    public Builder last_shared_take_lottery_time(Integer last_shared_take_lottery_time) {
      this.last_shared_take_lottery_time = last_shared_take_lottery_time;
      return this;
    }

    /**
     * 上一次分享抽奖时间
     */
    public Builder incr_daily_gold_num(Integer incr_daily_gold_num) {
      this.incr_daily_gold_num = incr_daily_gold_num;
      return this;
    }

    /**
     * 当天消耗的金币数
     */
    public Builder incr_daily_coin_num(Integer incr_daily_coin_num) {
      this.incr_daily_coin_num = incr_daily_coin_num;
      return this;
    }

    /**
     * 当天收到的积分
     */
    public Builder incr_week_gold_num(Integer incr_week_gold_num) {
      this.incr_week_gold_num = incr_week_gold_num;
      return this;
    }

    /**
     * 7天内消耗的金币数
     */
    public Builder incr_week_coin_num(Integer incr_week_coin_num) {
      this.incr_week_coin_num = incr_week_coin_num;
      return this;
    }

    /**
     * 7天内收到的积分
     */
    public Builder game_coin_num(Integer game_coin_num) {
      this.game_coin_num = game_coin_num;
      return this;
    }

    /**
     * 游戏币
     */
    public Builder diamond_num(Integer diamond_num) {
      this.diamond_num = diamond_num;
      return this;
    }

    @Override
    public AllUserInfo build() {
      return new AllUserInfo(this);
    }
  }
}