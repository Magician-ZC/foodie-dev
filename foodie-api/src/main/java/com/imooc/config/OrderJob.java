package com.imooc.config;

import com.imooc.service.OrderService;
import com.imooc.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class OrderJob {

    @Autowired
    private OrderService orderService;

    /**
     * 使用定时任务关闭超期未支付订单,会存在的弊端
     * 1.会有时间差
     * 2.不支持集群
     *     单机没毛病,使用集群后,就会有多个定时任务
     *     解决方案:只使用一台计算机节点,单独用来运行所有的定时任务
     * 3.会对数据库全表搜索,及其影响数据库性能
     *
     * 定时任务:仅仅只适用小型轻量级项目,传统项目
     *
     */

    @Scheduled(cron = "0 0 0/1 * * ?")
    private void autoCloseOrder(){
        orderService.closeOrder();
    }
}
