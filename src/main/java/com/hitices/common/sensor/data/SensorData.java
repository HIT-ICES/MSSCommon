package com.hitices.common.sensor.data;

import com.hitices.common.sensor.SensorType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author ferdinandsu
 * @date 2021/12/16
 **/

@Getter
@Setter
@ToString
public class SensorData
{
    private SensorType type;
    private Date timestamp;

    public SensorData(SensorType type){
        this.type = type;
    }
}
