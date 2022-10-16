package com.macro.mall.tiny.common.api;

/**
 * 枚举了一些常用API操作码
 * 主要是要展示错误，所以继承IErrorCode.
 * 但他这里是枚举去继承接口哦。【依赖抽象而不依赖具体的类】。这个就是设计原则。
 * 原来枚举类也可以继承接口。
 *
 * Created by macro on 2019/4/19.
 */
public enum ResultCode implements IErrorCode {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
