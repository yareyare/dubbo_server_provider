package com.juxinli.tool;

/**
 * Created by James on 16/8/12.
 */
public enum Code {
    // 10000 成功
    SUCCESS(10200, "成功"),
    FAILT(10400, "失败"),

    
    PARAM_NULL(10419, "必填参数为空"), 
    DB_ERROR(10401, "数据库操作失败"),
    DB_NOT_FIND(10402, "没有更新任何记录"),
    PARAM_ILLEGAL_NULL(10403, "参数不在可选值范围内"),
    PARAM_TOO_LARGER(10404, "参数内容太长"),
    SERVER_PROCESS_ERROR(10405, "服务器操作失败，请稍后再试!"),
    
    MOBILE_FORMAT_ERROR(10406, "手机号格式错误"),
    IDCARD_FORMAT_ERROR(10407,"身份证格式错误"),
    PHONE_MATCH_CODE_ERROR(10408,"手机号码归属地获取失败"),
    PHONE_RULE_ERROR(10409,"判断手机号是否在信用卡公司限制范围内失败"),
    USER_EXIST_ERROR(10410,"用户已经推送过"),
    PARAM_CODED(10411,"有打码字段"),
    DB_NO_DATA(10412, "没有找到任何记录"),
    NO_ORG(10413, "未知的机构"),
    PHONE_EXISTES(10414, "手机号码已存在"),
    PARAM_MATCH_ERROR(10414, "参数格式验证失败"),
    USER_NOT_EXIST(10415, "用户名或者密码错误"),
    FILE_NOT_FILE(10416, "文件不存在"),
    USER_NOT_FIND(10417, "用户不存在"),
    ADD_TO_ORG_ERR(10420, "用户"),
    OBJECT_NULL(10421, "对象为空"), 
    NO_SESSION(10422, "未登录"),
    LOGIN_OUT_FAIL(10423, "登出失败"),


    // 20000 参数方法返回值错误
    PARAMTER_INCORRECT(200100, "参数不正确"),
    GENERATER_RETURN_ERROR(200101, "处理返回值错误"),

    SERVICE_NOT_FIND(402, "没有这个服务"),

    // 30000 不支持的方法协议,服务不可用
    METHOD_NOT_SUPPORT(300100, "不支持的请求方法"), protocol_notsupport(300200, "不支持的协议"), node_unavailable(300300, "没有可用的服务节点"),

    // 40000 异常
    ERROR(400100, "执行错误"),

    // 50000 流程控制错误
    OVER_LIMIT(500100, "接口调用次数超过限制"),

    // 60000
    SAVE_DYNASTY_ERROR(600001,"朝代保存失败"),
    SAVE_TYPE_ERROR(600002,"诗歌类型保存失败"),
    SAVE_POEM_ERROR(600003,"诗歌保存失败"),
    SAVE_TYPE_REF_ERROR(600002,"诗歌类型关联保存失败"),
    SAVE_POEM_DETAIL_ERROR(600004,"诗歌详情保存失败"),
    SAVE_POET_ERROR(600005,"诗人保存失败"),
    SAVE_POET_DETAIL_ERROR(600004,"诗人详情保存失败"),

    // 90000 业务错误
    // 90100 用户联系人业务错误
    CONTACTS_ISEXIST(90100, "该联系人已经存在"),

    ;

    public String note;
    public Integer code;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    private Code(Integer code, String note) {
        this.note = note;
        this.code = code;
    }
}
