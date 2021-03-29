package com.nacos.impl;

import com.ai.mrsoftrock.rpc.nacosTest.INacosSv;
import com.ai.mrsoftrock.rpc.nacosTest.dto.NaocsTest;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author Mr.SoftRock
 * @Date 2021/3/1911:06
 **/
@Component
@DubboService(version = "1.0.0")
public class ProviderSvImpl implements INacosSv {


    @Override
    public NaocsTest query() throws RuntimeException {
        try {
            NaocsTest t = new NaocsTest();
            t.setUserId("1");
            t.setUserName("你好+hello mr.softrock+这把测试就成功完美了+加入了服务器的nacos");
            return t;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
