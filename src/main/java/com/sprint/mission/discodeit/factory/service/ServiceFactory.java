package com.sprint.mission.discodeit.factory.service;

import com.sprint.mission.discodeit.service.ChannelService;
import com.sprint.mission.discodeit.service.MessageService;
import com.sprint.mission.discodeit.service.UserService;

public interface ServiceFactory {
    UserService getUserService();
    ChannelService getChannelService();
    MessageService getMessageService();
}
