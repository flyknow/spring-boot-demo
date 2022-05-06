package com.flyyon.controller;


import com.flyyon.service.SendService;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

/**
 * @author: Zhuyf
 * @version: 2022/5/6
 **/

@Controller
public class SmsController {


    /**
     * String 实现类名 = 从数据库或缓存里读取到的实现类名。
     * 短信接口 接口 = Class.forName(实现类名).newInstance();//反射创建子类实例
     * 接口.发送短信();
     */

    @PostConstruct
    public void smsAlYunSms() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //固定写死,以阿里云为例 ”ALiYunSendServiceImpl“
        SendService aLiYunSendService = (SendService) Class.forName("com.flyyon.service.impl.ALiYunSendServiceImpl").newInstance();
        aLiYunSendService.SendSms();
    }

}
