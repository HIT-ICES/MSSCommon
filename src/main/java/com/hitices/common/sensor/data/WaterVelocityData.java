package com.hitices.common.sensor.data;

import com.hitices.common.sensor.SensorType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author septemberhx
 * @date 2021/9/10
 **/

@Getter
@Setter
@ToString
public class WaterVelocityData extends SensorData
{
    private double WaterVelocityData;

    public WaterVelocityData()
    {
        super(SensorType.WATER_VELOCITY);
    }
}
