package com.wtsd.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xianghao on 2017/5/27.
 */
@Service("")
public class Service2TestImpl implements Service2Test {

    @Override
    public String test(String string) {
        return "service2 : "+ string;
    }
}
