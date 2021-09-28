package com.hitices.common.api;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EndPoint endPoint = (EndPoint) o;
        return Objects.equals(ip, endPoint.ip) && Objects.equals(port, endPoint.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, port);
    }
}
