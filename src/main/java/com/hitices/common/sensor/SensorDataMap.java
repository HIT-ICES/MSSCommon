package com.hitices.common.sensor;

import com.fasterxml.jackson.databind.ObjectMapper;
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

    public <T> T getData(Class<T> clz) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(this.valueMap, clz);
    }

    public void setData(SensorType type, Class<?> data) {
        ObjectMapper mapper = new ObjectMapper();
        this.valueMap = mapper.convertValue(data, Map.class);
        this.valueMap.put("type", type);
        this.type = type;
    }
}
