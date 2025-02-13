package com.sprint.mission.discodeit.entity.status;

import com.sprint.mission.discodeit.dto.readStatus.UpdateReadStatusDto;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
public class ReadStatus {
    private String id;
    private Instant createdAt;
    private Instant updatedAt;
    private String channelId;
    private String userId;

    public ReadStatus(String channelId, String userId) {
        this.id = UUID.randomUUID().toString();
        this.createdAt = Instant.now();
        this.updatedAt = createdAt;
        this.channelId = channelId;
        this.userId = userId;
    }

    public boolean isUpdated(UpdateReadStatusDto updateReadStatusDto) {

         // 이 외의 필드가 수정될 수 있을지 고민
         if(updateReadStatusDto.updatedAt().isBefore(this.updatedAt)) {
             this.updatedAt = updateReadStatusDto.updatedAt();
             return true;
         }
         return false;
    }
}

