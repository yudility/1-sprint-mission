package com.sprint.mission.discodeit.dto.message;

import java.time.Instant;

public record UpdateMessageDto(
        String messageId,
        String newContent,
        Instant updatedAt
){
}
