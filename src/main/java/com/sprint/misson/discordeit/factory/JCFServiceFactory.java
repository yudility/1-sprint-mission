package com.sprint.misson.discordeit.factory;

import com.sprint.misson.discordeit.service.ChannelService;
import com.sprint.misson.discordeit.service.MessageService;
import com.sprint.misson.discordeit.service.UserService;
import com.sprint.misson.discordeit.service.jcf.JCFChannelService;
import com.sprint.misson.discordeit.service.jcf.JCFMessageService;
import com.sprint.misson.discordeit.service.jcf.JCFUserService;

public class JCFServiceFactory implements ServiceFactory {

    private static JCFServiceFactory instance;

    private UserService userService;
    private ChannelService channelService;
    private MessageService messageService;

    private JCFServiceFactory() {
        this.userService = createUserService();
        this.channelService = createChannelService();
        this.messageService = createMessageService();
    }

    public static JCFServiceFactory getInstance() {
        if (instance == null) {
            instance = new JCFServiceFactory();
        }
        return instance;
    }

    @Override
    public UserService createUserService() {
        if (userService == null) {
            userService = new JCFUserService();
        }
        return userService;
    }

    @Override
    public ChannelService createChannelService() {
        if (channelService == null) {
            channelService = new JCFChannelService(userService);
        }
        return channelService;
    }

    @Override
    public MessageService createMessageService() {
        if (messageService == null) {
            messageService = new JCFMessageService(channelService, userService);
        }
        return messageService;
    }
}
