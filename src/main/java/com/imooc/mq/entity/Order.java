package com.imooc.mq.entity;

import java.io.Serializable;

public class Order implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1882871399387326739L;
	private int id;
	private String name;
	private String msgId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	
	
}
