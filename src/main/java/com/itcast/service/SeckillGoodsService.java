package com.itcast.service;

import com.itcast.dao.SeckillGoodsDao;
import com.itcast.entity.SeckillGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SeckillGoodsService {
    @Autowired
    private SeckillGoodsDao seckillGoodsDao;
    public List<SeckillGoods> findAll(){
        return seckillGoodsDao.findAll();
    }
    public SeckillGoods findById(Long id){
        return seckillGoodsDao.findById(id).get();
    }
    public List<SeckillGoods> findList(Date starttime,Date endtime){
        return seckillGoodsDao.findList(starttime,endtime);
    }

}
