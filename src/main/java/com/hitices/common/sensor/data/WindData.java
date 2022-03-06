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
public class WindData extends SensorData
{
    private double windLevel;
    private double windDirection;

    public WindData()
    {
        super(SensorType.WIND);
    }
}
