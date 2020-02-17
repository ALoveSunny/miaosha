package com.itcast.controller;
import com.itcast.entity.SeckillGoods;
import com.itcast.service.SeckillGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/goods")
public class seckillGoodsController {
    @Autowired
    private SeckillGoodsService seckillGoodsService;
    @RequestMapping("/list")
    public List<SeckillGoods> findAll(){
        return seckillGoodsService.findAll();
    }
    @RequestMapping("/{id}")
    public SeckillGoods findById(@PathVariable("id") Long id){
        return seckillGoodsService.findById(id);
    }
    @RequestMapping("/findList")
    public List<SeckillGoods> findList(){
        return seckillGoodsService.findList();
    }

}
