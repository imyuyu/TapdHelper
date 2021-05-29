package com.tencent.tapd.webhook.po;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>Module: 应用模块
 * <p>Description: 代码描述
 * <p>Author: <a href='mailto:2075904@qq.com'>Zhengyu.Hu</a>
 * <p>Date: 2021/5/29 4:25 下午
 * <p>Copyright (c) 2021年 Chengdu Minto Technology Co.,LTD.
 */
@Data
public class RawData {
    private LocalDateTime completed;
    private Long id;
    private String status;
}
