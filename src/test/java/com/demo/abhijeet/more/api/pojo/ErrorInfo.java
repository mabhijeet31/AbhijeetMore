package com.demo.abhijeet.more.api.pojo;

public class ErrorInfo {

	public String messages;

	public ErrorInfo() {
		super();
	}

	public String getMessages() {
		return messages;
	}

	/**
	 * @param messages
	 *            the messages to set
	 */
	public void setMessages(String messages) {
		this.messages = messages;
	}

	/**
	 * @param messages
	 */
	public ErrorInfo(String messages) {
		super();
		this.messages = messages;
	}

}
