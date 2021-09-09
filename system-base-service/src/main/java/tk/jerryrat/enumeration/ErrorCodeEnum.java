package tk.jerryrat.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName: CommonErrorCode
 * @author: Bing
 * @Description: 异常枚举枚举类
 * @date: 2021/8/25 16:36
 */

@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {

    OK("00000", "一切 ok"),

    /**
     * 用户信息错误
     */
    ZCCW("A0100", "用户注册错误"),
    YSXYWTY("A0101", "用户未同意隐私协议"),
    YHMJYSB("A0110", "用户名校验失败"),
    YHMYCZ("A0111", "用户名已存在"),
    YHMBHMGC("A0112", "用户名包含敏感词"),
    YHMBHTSZF("A0113", "用户名包含特殊字符"),
    MMJYSB("A0120", "密码校验失败"),
    MMCDBG("A0121", "密码长度不够"),
    MMQDBG("A0122", "密码强度不够"),
    JBXXJYSB("A0150", "用户基本信息校验失败"),
    SJGSJYSB("A0151", "手机格式校验失败"),
    DZGSJYSB("A0152", "地址格式校验失败"),
    YXGSJYSB("A0153", "邮箱格式校验失败"),
    DLYC("A0200", "用户登录异常"),
    ZHBCZ("A0201", "用户账户不存在"),
    ZHBDJ("A0202", "用户账户被冻结"),
    ZHYZF("A0203", "用户账户已作废"),
    MMCW("A0210", "用户密码错误"),
    SRMMCSCX("A0211", "用户输入密码错误次数超限"),
    SFJYSB("A0220", "用户身份校验失败"),
    WHDDSFDLSQ("A0223", "用户未获得第三方登录授权"),
    YHDLYGQ("A0230", "用户登录已过期"),
    YZMCW("A0240", "用户验证码错误"),
    YZMCWCSCX("A0241", "用户验证码尝试次数超限"),

    /**
     * 权限错误
     */
    FWQXYC("A0300", "访问权限异常"),
    FWWSQ("A0301", "访问未授权"),
    ZZSQZ("A0302", "正在授权中"),
    YHSQSQBJJ("A0303", "用户授权申请被拒绝"),
    WQXSYAPI("A0312", "无权限使用 API"),
    YHFWBLJ("A0320", "用户访问被拦截"),
    WGFWSX("A0324", "网关访问受限"),
    QQCSCW("A0400", "用户请求参数错误"),
    QQBTCSWK("A0410", "请求必填参数为空"),
    QSSJCCS("A0413", "缺少时间戳参数"),
    FFSJCCS("A0414", "非法的时间戳参数"),
    CSGHBPP("A0421", "参数格式不匹配"),
    QQJSONJXSB("A0427", "请求 JSON 解析失败"),
    SRNRFF("A0430", "用户输入内容非法"),
    BHWJMGC("A0431", "包含违禁敏感词"),
    TPBHWJXX("A0432", "图片包含违禁信息"),
    QQFWYC("A0500", "用户请求服务异常"),
    QQCSCX("A0501", "请求次数超出限制"),
    SCWJYC("A0700", "用户上传文件异常"),
    SCWJLXBPP("A0701", "用户上传文件类型不匹配"),
    SCWJTD("A0702", "用户上传文件太大"),
    SCTPTD("A0703", "用户上传图片太大"),
    SCSPTD("A0704", "用户上传视频太大"),
    SCYSWJTD("A0705", "用户上传压缩文件太大"),

    /**
     * 数据库
     */
    SJKFWCS("C0250", "数据库服务超时"),
    SJKFWYC("C0300", "数据库服务出错"),
    BBCZ("C0311", "表不存在"),
    LBCZ("C0312", "列不存在"),
    DBGLCZXTMCDL("C0321", "多表关联中存在多个相同名称的列"),
    SJKSS("C0331", "数据库死锁"),
    ZJCT("C0341", "主键冲突"),

    /**
     * 通知服务
     */
    TZFWCC("C0500", "通知服务出错"),
    DXTXFWSB("C0501", "短信提醒服务失败"),
    YJTXFWSB("C0503", "邮件提醒服务失败");

    /**
     * 错误码
     */
    private String key;
    /**
     * 中文描述
     */
    private String value;
}
