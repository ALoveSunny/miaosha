package com.itcast.dao;

import com.itcast.entity.SeckillOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeckillOrderDao extends JpaRepository<SeckillOrder,Long> {
}
