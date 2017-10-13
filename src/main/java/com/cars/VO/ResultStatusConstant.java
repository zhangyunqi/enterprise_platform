package com.cars.VO;

/**
 * 返回结果{@link JsonResult#status}的状态码常量
 * <p>状态码由四位构成 例如: <strong>1000</strong></p>
 *
 * @author zyq
 * @version 1.0
 */
public class ResultStatusConstant {
    /**
     * 成功
     * <p>无业务成功时返回此状态
     */
    public static final String OK = "1000";
    /**
     * 错误
     * <p>出现异常时返回此状态
     */
    public static final String ERROR = "1001";
    /**
     * 成功
     * <p>业务执行成功时返回此状态</p>
     */
    public static final String SUCCESS = "1002";
    /**
     * 失败
     * <p>业务执行错误时返回此状态
     */
    public static final String FAIL = "1003";

}
