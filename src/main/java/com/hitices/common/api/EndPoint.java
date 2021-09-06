package com.hitices.common.api;

import lombok.Getter;
import lombok.Setter;

/**
 * @author septemberhx
 * @date 2021/9/6
 **/

@Getter
@Setter
public class EndPoint {
    private String ip;
    private Integer port;

    public EndPoint() {
    }

    public EndPoint(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
    }
}
