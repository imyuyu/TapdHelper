package com.tencent.tapd.webhook.controller;

import com.tencent.tapd.api.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

/**
 * @author imyuyu
 */
@RestController
public class WebHookController {

    @Autowired
    private StoryService storyService;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @PostConstruct
    public void init(){
        storyService.fetchStory();
    }

    public void send(){

    }

}
