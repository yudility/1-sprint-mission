package com.sprint.misson.discordeit.factory.service;

import com.sprint.misson.discordeit.service.ChannelService;
import com.sprint.misson.discordeit.service.MessageService;
import com.sprint.misson.discordeit.service.UserService;

public interface ServiceFactory {
    UserService getUserService();
    ChannelService getChannelService();
    MessageService getMessageService();
}
