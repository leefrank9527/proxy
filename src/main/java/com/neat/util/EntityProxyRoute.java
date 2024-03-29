package com.neat.util;

import com.neat.proxy.UrlEntity;

import java.net.Proxy;

public class EntityProxyRoute {
    private String host;
    private int port;
    private Proxy proxy;
    private ReachableType reachableType;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Proxy getProxy() {
        return proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public ReachableType getReachableType() {
        return reachableType;
    }

    public void setReachableType(ReachableType reachableType) {
        this.reachableType = reachableType;
    }


    public String getKey() {
        return String.format("%s:%d", host, port);
    }

    public static String getKeyOfUrlEntity(UrlEntity urlEntity) {
        return String.format("%s:%d", urlEntity.getHostName(), urlEntity.getHostPort());
    }

    public String getUnl() {
        return String.format("%s %d %s", host, port, reachableType.name());
    }
}
