package com.sprint.mission.discodeit.dto.channel;

import com.sprint.mission.discodeit.entity.ChannelType;

import java.time.Instant;

public record UpdateChannelDto(
        String channelName,
        String description,
        Instant updatedAt
) {
}
