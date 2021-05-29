package com.tencent.tapd.webhook.po;

import com.tencent.tapd.webhook.enums.EventFrom;
import com.tencent.tapd.webhook.enums.ObjectType;
import lombok.Data;

/**
 * <p>Module: 应用模块
 * <p>Description: 代码描述
 * <p>Author: <a href='mailto:2075904@qq.com'>Zhengyu.Hu</a>
 * <p>Date: 2021/5/29 4:21 下午
 * <p>Copyright (c) 2021年 Chengdu Minto Technology Co.,LTD.
 */
@Data
public class RawEvent {
    private Long workspaceId;
    private String user;
    private ObjectType objectType;
    private Long id;
    private Long timestamp;
    private String eventKey;
    private EventFrom from;
}
