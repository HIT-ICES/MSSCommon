package com.hitices.common.sensor;

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
public class SensorDataMap {

    private SensorType type;
    private Map<String, Object> valueMap;

    public SensorDataMap() {
    }

    public SensorDataMap(SensorType type, Map<String, Object> valueMap) {
        this.type = type;
        this.valueMap = valueMap;
    }
}
