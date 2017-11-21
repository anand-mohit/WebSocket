package com.stackroute.websocket.model;


public class ChatMessage {
//    private MessageType type;
    private String content;
    private String sender;

 
//
//    public MessageType getType() {
//        return type;
//    }
//
//    public void setType(MessageType type) {
//        this.type = type;
//    }

    public ChatMessage(String content, String sender) {
		super();
		this.content = content;
		this.sender = sender;
	}

	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
