package com.youzi.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisSave {
    @Test
    public void save(){
        Jedis jedis = new Jedis("localhost");
//        System.out.println(jedis.get("2"));
//        jedis.set("1","youzi");
//        Set<String> set = jedis.keys("*");
//        Iterator<String> it = set.iterator();
//        while(it.hasNext()){
//            String key = it.next();
//            System.out.println(jedis.get(key));
//        }
//        jedis.lpush("test","12","13","14","15");
//        long x = jedis.scard("test");
//        List<String> list = jedis.lrange("test",0,4);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        jedis.del("1","2","3","youzi");

    }
}
