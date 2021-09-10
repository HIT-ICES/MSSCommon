package com.hitices.common.sensor.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

/**
 * @author septemberhx
 * @date 2021/9/10
 **/

@Getter
@Setter
@ToString
public class TemperatureData {
    private double temperature;

    public static TemperatureData fromMap(Map<String, Object> objectMap) {
        TemperatureData data = new TemperatureData();
        if (objectMap.containsKey("temperature")) {
            Object value = objectMap.get("temperature");
            if (value instanceof Number) {
                data.setTemperature(((Number) value).doubleValue());
            } else {
                throw new RuntimeException("Failed to parse temperature");
            }
        }
        return data;
    }
}
