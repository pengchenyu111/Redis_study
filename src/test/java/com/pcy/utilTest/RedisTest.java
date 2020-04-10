package com.pcy.utilTest;

import com.pcy.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RedisTest {

    @Autowired
    RedisUtil redisUtil;

    @Test
    void getKeys(){
        String s = redisUtil.get("huangshan:scenics", 0);
        System.out.println(s);
    }
}
