package com.hxm.exception;

/**
 * @author XAIOHU
 * @date 2019/10/30 --13:35
 **/
public class MyUserNotExistException extends  RuntimeException {
    public MyUserNotExistException() {
        super("用户不存在");
    }
}
