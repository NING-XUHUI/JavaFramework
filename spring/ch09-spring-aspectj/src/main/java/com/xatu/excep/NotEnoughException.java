package com.xatu.excep;

/**
 * 自定义运行时异常
 * @author ningxuhui
 */
public class NotEnoughException extends RuntimeException {

    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}
