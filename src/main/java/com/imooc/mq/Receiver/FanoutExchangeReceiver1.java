package com.imooc.mq.Receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.imooc.mq.entity.Order;

@Component
@RabbitListener(queues="fanout.A")
public class FanoutExchangeReceiver1 {
	
	@RabbitHandler
	public void rece(Order order) {
		System.out.println("receiver1:"+order.getId()+"=="+order.getMsgId()+"=="+order.getName());
	}
}
