package com.youzi.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisSave {
    @Test
    public void save(){
        Jedis jedis = new Jedis("localhost");
//        SFP  CSB
//        SFP  CSB
//        SFP  CSB
//        SFP  CSBSFP  CSBSFP  CSB
//        SFP  CSB
//        SFP  CSBSFP  CSBSFP  CSB
//        SFP  CSB
//        SFP  CSB
//        SFP  CSB
//        SFP  CSBSFP  CSBSFP  CSB
//        SFP  CSBSFP  CSBSFP  CSB
//        SFP  CSB
//        SFP  CSB
//        SFP  CSB
//        SFP  CSBSFP  CSBSFP  CSB
//        SFP  CSBSFP  CSBSFP  CSB





        jedis.del("1","2","3","youzi");

    }
}
