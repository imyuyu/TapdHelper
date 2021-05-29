package com.tencent.tapd.api.annotation;

import java.lang.annotation.*;

/**
 * <p>Module: 应用模块
 * <p>Description: 代码描述
 * <p>Author: <a href='mailto:2075904@qq.com'>Zhengyu.Hu</a>
 * <p>Date: 2021/5/29 5:22 下午
 * <p>Copyright (c) 2021年 Chengdu Minto Technology Co.,LTD.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Api {
    String value();
}
