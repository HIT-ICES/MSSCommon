package com.hitices.common.device;

import lombok.Getter;
import lombok.Setter;

/**
 * @author septemberhx
 * @date 2021/9/6
 **/

@Getter
@Setter
public class DeviceInfo {

    private String id;
    private String name;
    private String description;

    public DeviceInfo() {
    }

    public DeviceInfo(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
