package com.tencent.tapd.api.service;

import com.tencent.tapd.api.annotation.Api;
import com.tencent.tapd.api.annotation.ApiService;

/**
 * <p>Module: 应用模块
 * <p>Description: 代码描述
 * <p>Author: <a href='mailto:2075904@qq.com'>Zhengyu.Hu</a>
 * <p>Date: 2021/5/29 4:40 下午
 * <p>Copyright (c) 2021年 Chengdu Minto Technology Co.,LTD.
 */
@ApiService
public interface StoryService {

    @Api("https://api.tapd.cn/stories")
    void fetchStory();

}
