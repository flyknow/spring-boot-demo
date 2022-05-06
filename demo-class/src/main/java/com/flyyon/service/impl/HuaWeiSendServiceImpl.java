package com.flyyon.service.impl;

import com.flyyon.service.SendService;
import org.springframework.stereotype.Service;

/**
 * @author: Zhuyf
 * @version: 2022/5/6
 **/
@Service
public class HuaWeiSendServiceImpl implements SendService {
    /**
     * 华为短信实现类
     */
    @Override
    public void SendSms() {
        System.out.println("华为短信发送中......");
    }
}
