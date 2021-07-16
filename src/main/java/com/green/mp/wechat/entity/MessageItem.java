package com.green.mp.wechat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: MessageItem
 * @Author GreenArrow
 * @Date: 2021/7/16 8:34
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageItem implements Serializable {
    private static final long serialVersionUID = 5409126840169141568L;
    private String Title;
    private String Description;
    private String PicUrl;
    private String Url;
}
