package com.tencent.tapd.webhook.po;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author imyuyu
 */
@Data
public class RawMessage {
    private Long auto_task_id;
    private Long auto_task_action_id;
    private Long workspace_id;
    private Map<String, RawEvent> events;
    private Map<String, RawEvent> actions;
    private Object condition;
}
