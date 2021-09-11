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
public class Environment {
    private TemperatureData tp;
    private HumidityData hd;

    public Map<String, Object> toMap(Map<String, Object> result) {
        this.tp.toMap(result);
        this.hd.toMap(result);
        return result;
    }
}
