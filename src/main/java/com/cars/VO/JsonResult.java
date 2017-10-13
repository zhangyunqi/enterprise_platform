package com.cars.VO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 这是统一返回结果的类
 *
 * @author zyq
 * @version 1.0
 */
public class JsonResult implements Serializable {
    /**
     * 返回的状态码,通过状态码来判断是哪类错误
     * <p>详情查看常量类{@link ResultStatusConstant}</p>
     */
    private String status;

    /**
     * 返回的结果
     */
    private Object result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
