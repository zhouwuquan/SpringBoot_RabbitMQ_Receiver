package com.imooc.mq.Receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.imooc.mq.entity.Order;
 
/**
 * 消息消费者(简单模式基于queue)
 * @author zhouwq
 *
 */
@Component
@RabbitListener(queues = "topic.message")
public class TopicExchangeReceiver1 {
	protected static Logger logger = LoggerFactory.getLogger(TopicExchangeReceiver1.class);
 
	@RabbitHandler
	public void process(Order order) {
		logger.info("topicMessageReceiver1 : " + order.getId()+","+order.getName()+","+order.getMsgId());
	}
}
