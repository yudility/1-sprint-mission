package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class Message {
    final private UUID id;
    final private Long createdAt;
    private Long updatedAt;
    private String title;
    private String MessageBody;

    private String senderName;
    private String receiverName;
    private UUID senderId;
    private UUID receiverId;

    public Message(String title,String MessageBody){
        this.id= UUID.randomUUID();
        this.createdAt= System.currentTimeMillis();
        this.updatedAt=null;
        this.title=title;
        this.MessageBody=MessageBody;
        this.senderName="";
        this.receiverName ="";
        this.senderId=null;
        this.receiverId =null;

    };
    public static Message CreateDefaultMessage(String title,String MessageBody){
        return new Message(title,MessageBody);
    }

    public UUID getId() {
        return id;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }
    public String getMessageBody(){
        return MessageBody;
    }

    public void setUpdatedAt() {
        this.updatedAt= System.currentTimeMillis();
    }
    public void setMessageBody(String MessageBody){
        this.MessageBody= MessageBody;
    }

    public String getSenderName() {
        if(this.senderName!=null)
            return senderName;
        else
            return null;
    }
    public String getReceiverName() {
        if(this.senderName!=null)
            return senderName;
        else
            return null;
    }
    public UUID getSenderID() {
        return senderId;
    }
    public UUID getReceiverID() {
        return receiverId;
    }
    public void setReceiverID(UUID receiverId) {
        this.receiverId = receiverId;
    }
    public void setSenderID(UUID senderId) {
        this.senderId = senderId;
    }
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void SetSender(UUID senderId,String senderName){
        this.senderName=senderName;
        this.senderId=senderId;
    }
    public void SetReceiver(UUID receiverId,String receiverName){
        this.receiverName = receiverName;
        this.receiverId = receiverId;
    }
    @Override
    public String toString(){
        StringBuilder display = new StringBuilder();
        display.append("메세지 아이디: ").append(id)
                .append(" createdAt: ").append(createdAt)
                .append(" updatedAt: ").append(getUpdatedAt() == null ? "없음" : String.valueOf(getUpdatedAt()))
                .append("\nsenderName: ").append(senderName)
                .append(" senderID: ").append(senderId)
                .append("\nReceiverName: ").append(receiverName)
                .append(" ReceiverID: ").append(receiverId)
                .append("\n제목: ").append(title)
                .append(" Message: ").append(MessageBody);
        return display.toString();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
