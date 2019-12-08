package com.imooc.miaosha.util;

import java.util.UUID;

/**
 * Created by Roni on 2019/12/3.
 */
public class UUIDUtil {
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
