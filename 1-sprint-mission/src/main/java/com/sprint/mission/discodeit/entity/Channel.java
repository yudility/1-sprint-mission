package com.sprint.mission.discodeit.entity;

import java.util.ArrayList;
import java.util.UUID;

public class Channel {
    final private UUID id;
    final private Long createdAt;
    private Long updatedAt;
    private String channelName;
    private final ArrayList<User> userlist=new ArrayList<>();
    private final ArrayList<Message> messageslist=new ArrayList<>();

    public Channel(String channelName){
        this.id= UUID.randomUUID();
        this.createdAt= System.currentTimeMillis();
        this.updatedAt=null;
        this.channelName=channelName;
    };
    public static Channel CreateDefaultChannel(String channelName){
        return new Channel(channelName);
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
    public String getChannelName(){
        return channelName;
    }

    public void setUpdatedAt() {
        this.updatedAt= System.currentTimeMillis();
    }
    public void setChannelName(String ChannelName){
        this.channelName= ChannelName;
    }

    public void addUser(ArrayList<User> list){
        userlist.addAll(list);
    }
    public void addUser(User list){
        userlist.add(list);
    }
    public void addMessage(Message m){
        messageslist.add(m);
    }

    public String toString(){
        StringBuilder display = new StringBuilder();
        display.append("ChannelName: ").append(channelName)
                .append(" ID: ").append(id)
                .append("\ncreatedAt: ").append(createdAt)
                .append(" updatedAt: ").append(getUpdatedAt() == null ? "없음" : String.valueOf(getUpdatedAt()));
        return display.toString();
    }
}
