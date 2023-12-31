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
public class Environment extends SensorData
{
    private TemperatureData tp;
    private HumidityData hd;
    private WindData wd;
    private WaterVelocityData wvd;

    public Environment()
    {
        super(SensorType.ENVIRONMENT);
    }
}
