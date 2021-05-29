package com.tencent.tapd.webhook.enums;

/**
 * <p>Module: 应用模块
 * <p>Description: 代码描述
 * <p>Author: <a href='mailto:2075904@qq.com'>Zhengyu.Hu</a>
 * <p>Date: 2021/5/29 4:28 下午
 * <p>Copyright (c) 2021年 Chengdu Minto Technology Co.,LTD.
 */
public enum EventType {
    /**
     * 需求状态改变事件
     */
    StoryStatusChange("story::status_change")
    ;

    String key;

    EventType(String key) {
        this.key = key;
    }
}
