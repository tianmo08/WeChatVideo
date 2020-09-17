package com.tianno.wxvideo.controller;

import com.tianno.wxvideo.config.WeChatConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianmo
 * @version 1.0
 * @date 2020/9/13 12:11
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "hello video";
    }

    @Autowired
    private WeChatConfig weChatConfig;

    @RequestMapping("/test_config")
    public String test_config(){

        return weChatConfig.getAppId()+"   "+weChatConfig.getAppsecret();
    }
}
