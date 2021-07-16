package com.green.mp.wechat.entity;

/**
 * @Description: WeChatCommon
 * @Author GreenArrow
 * @Date: 2021/7/16 8:37
 * @Version 1.0
 */
public class WeChatCommon {
    /**
     * 开发者id
     */
    public static final String APPID = "APPID";
    /**
     * 开发者密码
     */
    public static final String APPSECRET = "APPSECRET";
    // Token
    public static final String TOKEN = "token";
    public static final String RESP_MESSAGE_TYPE_TEXT = "text";
    public static final Object REQ_MESSAGE_TYPE_TEXT = "text";
    public static final Object REQ_MESSAGE_TYPE_IMAGE = "image";
    public static final Object REQ_MESSAGE_TYPE_VOICE = "voice";
    public static final Object REQ_MESSAGE_TYPE_VIDEO = "video";
    public static final Object REQ_MESSAGE_TYPE_LOCATION = "location";
    public static final Object REQ_MESSAGE_TYPE_LINK = "link";
    public static final Object REQ_MESSAGE_TYPE_EVENT = "event";
    public static final Object EVENT_TYPE_SUBSCRIBE = "SUBSCRIBE";
    public static final Object EVENT_TYPE_UNSUBSCRIBE = "UNSUBSCRIBE";
    public static final Object EVENT_TYPE_SCAN = "SCAN";
    public static final Object EVENT_TYPE_LOCATION = "LOCATION";
    public static final Object EVENT_TYPE_CLICK = "CLICK";

    public static final String FromUserName = "FromUserName";
    public static final String ToUserName = "ToUserName";
    public static final String MsgType = "MsgType";
    public static final String Content = "Content";
    public static final String Event = "Event";
}
