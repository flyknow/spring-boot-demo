package com.flyyon.service.impl;

import com.flyyon.service.SendService;
import org.springframework.stereotype.Service;

/**
 * @author: Zhuyf
 * @version: 2022/5/6
 **/
@Service
public class ALiYunSendServiceImpl implements SendService {
    /**
     * 阿里云短信实现类
     */
    @Override
    public void SendSms() {
        System.out.println("阿里云短信发送中......");
    }
}
