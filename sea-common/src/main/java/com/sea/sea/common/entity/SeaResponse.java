package com.sea.sea.common.entity;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by zhaoxianhai on 2019/9/23
 */

public class SeaResponse extends HashMap<String, Object> implements Serializable {

    public SeaResponse message(String message){
        this.put("message",message);
        return this;
    }
    public SeaResponse data(Object data){
        this.put("data",data);
        return this;
    }
    public SeaResponse put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public String getMessage() {
        return String.valueOf(get("message"));
    }

    public Object getData() {
        return get("data");
    }

}
