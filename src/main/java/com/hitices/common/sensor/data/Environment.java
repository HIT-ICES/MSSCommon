package com.hitices.common.sensor.data;

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
public class Environment {
    private TemperatureData tp;
    private HumidityData hd;
}
