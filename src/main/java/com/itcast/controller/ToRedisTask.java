package com.itcast.controller;

import com.itcast.dao.SeckillGoodsDao;
import com.itcast.entity.SeckillGoods;
import com.itcast.service.SeckillGoodsService;
import com.itcast.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class ToRedisTask {
    @Autowired
    private SeckillGoodsDao seckillGoodsDao;
    @Autowired
    private RedisTemplate redisTemplate;
    @Scheduled(cron = "1/30 * * * * ?")
    public void load(){
//        String PreUrl = "SeckillGoods_";
//        1.获取存入时间列表
//        2.根据当前时间查询列表数据
//        3.限制查询条件
        List<Date> dateMenus = DateUtil.getDateMenus();
        for (Date date : dateMenus) {
            String PreUrl = "SeckillGoods_"+DateUtil.data2str(date,"yyyyMMddHH");
                    System.out.println(PreUrl);
            List<SeckillGoods> list = seckillGoodsDao.findList(new Date(), new Date());
            for (SeckillGoods seckillGoods : list) {
                redisTemplate.boundHashOps(PreUrl).put(seckillGoods.getGoodsId(),seckillGoods);
            }
        }
    }
}
