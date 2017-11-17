package com.kilogate.framework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 视图（Action 返回值）
 *
 * @author fengquanwei
 * @create 2017/11/17 20:45
 **/
public class View {
    private String path; // 视图路径
    private Map<String, Object> model; // 模型数据

    public View(String path) {
        this.path = path;
        model = new HashMap<>();
    }

    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }

    public String getPath() {
        return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}
