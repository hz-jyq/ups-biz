package com.pgy.ups.biz.commom.exception;

public class BussinessException  extends   RuntimeException {


    private String code;


    private String message;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 0L;


    /**
     * 空构造器。
     */
    public BussinessException() {
        super();
    }

    /**
     * 构造器。
     *
     * @param severity 严重级别
     */
    public BussinessException(int severity) {
        super();

    }

    /**
     * 构造器。
     *
     * @param message 消息
     */
    public BussinessException(String message) {
        super(message);
    }

    /**
     * 构造器。
     *
     * @param message  消息
     * @param severity 严重级别
     */
    public BussinessException(String message, int severity) {
        super(message);

    }

    /**
     * 构造器。
     *
     * @param cause 原因
     */
    public BussinessException(Throwable cause) {
        super(cause);
    }

    /**
     * 构造器。
     *
     * @param cause    原因
     * @param severity 严重级别
     */
    public BussinessException(Throwable cause, int severity) {
        super(cause);

    }

    /**
     * 构造器。
     *
     * @param message 消息
     * @param cause   原因
     */
    public BussinessException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 构造器。
     *
     * @param message 消息
     * @param cause   原因
     */
    public BussinessException(String code, String message) {
        super(message);
        this.code = code;
    }
}