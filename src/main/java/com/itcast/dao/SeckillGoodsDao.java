package com.itcast.dao;

import com.itcast.entity.SeckillGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SeckillGoodsDao extends JpaRepository<SeckillGoods,Long> {
//   @Query("select id from tb_seckill_goods WHERE status='1' AND stock_count>0")
//   List<SeckillGoods> findList();
}
