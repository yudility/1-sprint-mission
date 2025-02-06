package com.sprint.mission.discodeit.entity;

import com.sprint.mission.discodeit.dto.channel.UpdateChannelDto;
import lombok.Getter;

import java.io.Serializable;
import java.time.Instant;
import java.util.*;

@Getter
public class Channel implements Serializable {
    private static final long serialVersionUID = 1L;
    //객체 식별 id
    private final String id;
    //채널명
    private String channelName;
    //생성 날짜 - 유닉스 타임스탬프
    private final Instant createdAt;
    //수정 시간
    private Instant updatedAt;

    //채널 종류 - 음성, 텍스트 todo - 필드명 변경
    private final ChannelCategory channelCategory;

    //채널 공개 여부
    private ChannelType channelType;

    private String description;

    //채널에 속한 유저 목록
    private final HashMap<String, User> userList;

    //추가로 구현해볼만한 것
    //채널 그룹
    //채널 주제
    //접근 권한

    public Channel(String channelName, ChannelType channelType, ChannelCategory channelCategory,String description) {
        //id, createdAt, updateAt은 생성자에서 초기화
        this.id = UUID.randomUUID().toString();
        this.createdAt = Instant.now();
        this.updatedAt = createdAt;
        this.channelName = channelName;
        this.channelCategory = channelCategory;
        this.channelType = channelType;
        this.description = description;
        this.userList = new HashMap<>();
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    //채널 생성된 이후, 생성 시간을 변경할 수 없으므로 update 미구현

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    //채널 생성된 이후, 채널 종류를 변경할 수 없으므로 update 미구현
    //TODO - 고민
    //상속시켜서 음성채널, 보이스채널로 따로 구현해야?

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toShortString() {
        return "[Channel] id: " + id + " / channelName: " + channelName + " / channelType: " + channelType + " / total users: " + userList.size();
    }

    public String toFullString() {
        return toShortString() + " / channelSort: " + channelCategory + " / description: " + description + " / createdAt: " + createdAt + " / updatedAt: " + updatedAt;
    }

    public void displayFullInfo() {
        System.out.println(toFullString());
    }

    public void displayShortInfo() {
        System.out.println(toShortString());
    }

    public boolean isUpdated(UpdateChannelDto updateChannelDto) {
        //변경 여부 체크
        boolean isUpdated = false;

        String newChannelName = updateChannelDto.channelName();
        if (newChannelName != null && !newChannelName.isEmpty() && !newChannelName.equals(channelName)) {
            channelName = newChannelName;
            isUpdated = true;
        }

        ChannelType newChannelType = updateChannelDto.channelType();
        if (newChannelType != null && channelType != newChannelType) {
            channelType = newChannelType;
            isUpdated = true;
        }

        String newDescription = updateChannelDto.description();
        if (newDescription != null && !newDescription.isEmpty() && !newDescription.equals(description)) {
            description = newDescription;
            isUpdated = true;
        }

        return isUpdated;
    }

}
