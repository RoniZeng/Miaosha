package com.imooc.miaosha.redis;

/**
 * Created by Roni on 2019/12/2.
 */
public class UserKey extends BasePrefix{

    private UserKey(String prefix) {
        super(prefix);
    }

    public static UserKey getById = new UserKey("id");
    public static UserKey getByName = new UserKey("name");
}
