package com.tencent.tapd.webhook.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author imyuyu
 */
@Service
public class MessageSendServiceImpl implements MessageSendService, BeanPostProcessor {

    private final List<MessageChannel> MESSAGE_CHANNELS = new ArrayList<>();

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof MessageChannel){
            MESSAGE_CHANNELS.add((MessageChannel) bean);
        }
        return bean;
    }
}
