package com.imooc.miaosha.redis;

/**
 * Created by Roni on 2019/12/2.
 */
public interface KeyPrefix {
    public int expireSeconds();
    public String getPrefix();
}
