package com.hitices.common.sensor;

import com.hitices.common.api.EndPoint;
import com.hitices.common.device.DeviceInfo;
import lombok.Getter;
import lombok.Setter;

/**
 * @author septemberhx
 * @date 2021/9/6
 **/

@Getter
@Setter
public class SensorInfo extends DeviceInfo {

    private EndPoint endPoint;
    private SensorType type;

    public SensorInfo() {
    }

    public SensorInfo(String id, String name, String description, EndPoint endPoint, SensorType type) {
        super(id, name, description);
        this.endPoint = endPoint;
        this.type = type;
    }
}
