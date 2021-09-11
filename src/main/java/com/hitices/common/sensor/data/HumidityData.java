package com.hitices.common.sensor.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author septemberhx
 * @date 2021/9/10
 **/

@Getter
@Setter
@ToString
public class HumidityData {

    private double humidity;

    public static HumidityData fromMap(Map<String, Object> objectMap) {
        HumidityData data = new HumidityData();
        if (objectMap.containsKey("humidity")) {
            Object value = objectMap.get("humidity");
            if (value instanceof Number) {
                data.setHumidity(((Number) value).doubleValue());
            } else {
                throw new RuntimeException("Failed to parse temperature");
            }
        }
        return data;
    }

    public Map<String, Object> toMap(Map<String, Object> result) {
        result.put("humidity", this.getHumidity());
        return result;
    }
}
