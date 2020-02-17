package com.itcast.controller;

import com.itcast.dao.SeckillGoodsDao;
import com.itcast.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class ToRedisTask {
    @Autowired
    private SeckillGoodsDao seckillGoodsDao;
    @Scheduled(cron = "1/5 * * * * ?")
    public void load(){
        System.out.println(new Date());
//        1.获取存入时间列表
//        2.根据当前时间查询列表数据
//        3.限制查询条件
        List<Date> dateMenus = DateUtil.getDateMenus();
        for (Date date : dateMenus) {
//            seckillGoodsDao
        }
    }
}
