package com.hitices.common.sensor.data;

import com.hitices.common.sensor.SensorType;
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
public class HumidityData extends SensorData
{
    private double humidity;

    public HumidityData()
    {
        super(SensorType.HUMIDITY);
    }
}
