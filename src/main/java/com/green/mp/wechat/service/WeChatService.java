package com.green.mp.wechat.service;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: WeChatService
 * @Author GreenArrow
 * @Date: 2021/7/16 8:28
 * @Version 1.0
 */
public interface WeChatService {

    /**
     * 处理微信请求
     * @param request
     * @return
     */
    String processRequest(HttpServletRequest request);
}
