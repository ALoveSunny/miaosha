package com.itcast.dao;

import com.itcast.entity.SeckillGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Date;
import java.util.List;

public interface SeckillGoodsDao extends JpaRepository<SeckillGoods,Long> {
   @Query(value = "select * from tb_seckill_goods WHERE status=1 AND stock_count>0 AND start_time<? AND end_time>?",nativeQuery = true)
   List<SeckillGoods> findList(Date starttime,Date endtime);
}
