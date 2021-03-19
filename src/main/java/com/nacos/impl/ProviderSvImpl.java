package com.nacos.impl;

import com.ai.mrsoftrock.rpc.testrpc.ITestSv;
import com.ai.mrsoftrock.rpc.testrpc.dto.Test;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author Mr.SoftRock
 * @Date 2021/3/1911:06
 **/
@Component
@DubboService(version = "1.0.0")
public class ProviderSvImpl implements ITestSv {


    @Override
    public Test query() throws RuntimeException {
        try {
            Test t = new Test();
            t.setUserid("1");
            t.setUsername("你好+hello mr.softrock");
            return t;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
