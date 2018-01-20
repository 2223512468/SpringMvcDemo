package com.jajahome.utils;

import net.sf.json.JSONObject;

public class JsonData {

    public static String createJsonString(String key, Object value) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(key, value);
        return jsonObject.toString();
    }
}
