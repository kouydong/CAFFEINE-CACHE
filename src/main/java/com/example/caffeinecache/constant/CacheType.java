package com.example.caffeinecache.constant;

public enum CacheType {

    USERS("users"),
    VIEWS("views");

    private String name;
    private int expireAfterWrite;
    private int maximumSize;

    CacheType(String name) {
        this.name = name;
        this.expireAfterWrite = ConstConfig.DEFAULT_TTL_SEC;
        this.maximumSize = ConstConfig.DEFAULT_MAX_SIZE;
    }

    static class ConstConfig {
        static final int DEFAULT_TTL_SEC = 3000;
        static final int DEFAULT_MAX_SIZE = 10000;
    }
}
