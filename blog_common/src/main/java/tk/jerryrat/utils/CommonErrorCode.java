package tk.jerryrat.utils;

/**
 * @ClassName: CommonErrorCode
 * @author: Bing
 * @Description
 * @date: 2021/8/25 16:36
 * 错误码
 */
public class CommonErrorCode {

    public static final String OK = "00000"; //一切 ok

    /**
     * 用户信息错误
     */
    public static final String ZCCW = "A0100"; //用户注册错误
    public static final String YSXYWTY = "A0101"; //用户未同意隐私协议
    public static final String YHMJYSB = "A0110"; //用户名校验失败
    public static final String YHMYCZ = "A0111"; //用户名已存在
    public static final String YHMBHMGC = "A0112"; //用户名包含敏感词
    public static final String YHMBHTSZF = "A0113"; //用户名包含特殊字符
    public static final String MMJYSB = "A0120"; //密码校验失败
    public static final String MMCDBG = "A0121"; //密码长度不够
    public static final String MMQDBG = "A0122"; //密码强度不够
    public static final String JBXXJYSB = "A0150"; //用户基本信息校验失败
    public static final String SJGSJYSB = "A0151"; //手机格式校验失败
    public static final String DZGSJYSB = "A0152"; //地址格式校验失败
    public static final String YXGSJYSB = "A0153"; //邮箱格式校验失败
    public static final String DLYC = "A0200"; //用户登录异常
    public static final String ZHBCZ = "A0201"; //用户账户不存在
    public static final String ZHBDJ = "A0202"; //用户账户被冻结
    public static final String ZHYZF = "A0203"; //用户账户已作废
    public static final String MMCW = "A0210"; //用户密码错误
    public static final String SRMMCSCX = "A0211"; //用户输入密码错误次数超限
    public static final String SFJYSB = "A0220"; //用户身份校验失败
    public static final String WHDDSFDLSQ = "A0223"; //用户未获得第三方登录授权
    public static final String YHDLYGQ = "A0230"; //用户登录已过期
    public static final String YZMCW = "A0240"; //用户验证码错误
    public static final String YZMCWCSCX = "A0241"; //用户验证码尝试次数超限

    /**
     * 权限错误
     */
    public static final String FWQXYC = "A0300"; //访问权限异常
    public static final String FWWSQ = "A0301"; //访问未授权
    public static final String ZZSQZ = "A0302"; //正在授权中
    public static final String YHSQSQBJJ = "A0303"; //用户授权申请被拒绝
    public static final String WQXSYAPI = "A0312"; //无权限使用 API
    public static final String YHFWBLJ = "A0320"; //用户访问被拦截
    public static final String WGFWSX = "A0324"; //网关访问受限
    public static final String QQCSCW = "A0400"; //用户请求参数错误
    //public static final String OK = "A0401"; //包含非法恶意跳转链接
    public static final String QQBTCSWK = "A0410"; //请求必填参数为空
    public static final String QSSJCCS = "A0413"; //缺少时间戳参数
    public static final String FFSJCCS = "A0414"; //非法的时间戳参数
    //public static final String OK = "A0420"; //请求参数值超出允许的范围
    public static final String CSGHBPP = "A0421"; //参数格式不匹配
    //public static final String OK = "A0426"; //请求批量处理总个数超出限制
    public static final String QQJSONJXSB = "A0427"; //请求 JSON 解析失败
    public static final String SRNRFF = "A0430"; //用户输入内容非法
    public static final String BHWJMGC = "A0431"; //包含违禁敏感词
    public static final String TPBHWJXX = "A0432"; //图片包含违禁信息
    //public static final String WJQFBQ = "A0433"; //文件侵犯版权
    public static final String QQFWYC = "A0500"; //用户请求服务异常
    public static final String QQCSCX = "A0501"; //请求次数超出限制
    //public static final String OK = "A0502"; //请求并发数超出限制
    //public static final String OK = "A0503"; //用户操作请等待
    //public static final String OK = "A0506"; //用户重复请求
    //public static final String OK = "A0600"; //用户资源异常
    public static final String SCWJYC = "A0700"; //用户上传文件异常
    public static final String SCWJLXBPP = "A0701"; //用户上传文件类型不匹配
    public static final String SCWJTD = "A0702"; //用户上传文件太大
    public static final String SCTPTD = "A0703"; //用户上传图片太大
    public static final String SCSPTD = "A0704"; //用户上传视频太大
    public static final String SCYSWJTD = "A0705"; //用户上传压缩文件太大
    public static final String SXTWSQ = "A0902"; //用户摄像头未授权
    public static final String GPSWSQ = "A0906"; //用户位置信息未授权
    public static final String MKFYC = "A1002"; //用户麦克风异常
    public static final String YSQYC = "A1004"; //用户扬声器异常
    //public static final String OK = "B0001"; //系统执行出错
    //public static final String OK = "B0100"; //系统执行超时
    //public static final String OK = "B0200"; //系统容灾功能被触发
    //public static final String OK = "B0210"; //系统限流
    //public static final String OK = "B0220"; //系统功能降级
    //public static final String OK = "B0314"; //系统连接池耗尽
    //public static final String OK = "B0315"; //系统线程池耗尽
    //public static final String OK = "C0001"; //调用第三方服务出错
    //public static final String OK = "C0100"; //中间件服务出错
    //public static final String OK = "C0113"; //接口不存在
    //public static final String OK = "C0130"; //缓存服务出错

    /**
     * 数据库
     */
    public static final String SJKFWCS = "C0250"; //数据库服务超时
    public static final String SJKFWYC = "C0300"; //数据库服务出错
    public static final String BBCZ = "C0311"; //表不存在
    public static final String LBCZ = "C0312"; //列不存在
    public static final String DBGLCZXTMCDL = "C0321"; //多表关联中存在多个相同名称的列
    public static final String SJKSS = "C0331"; //数据库死锁
    public static final String ZJCT = "C0341"; //主键冲突

    /**
     * 通知服务
     */
    public static final String TZFWCC = "C0500"; //通知服务出错
    public static final String DXTXFWSB = "C0501"; //短信提醒服务失败
    public static final String YJTXFWSB = "C0503"; //邮件提醒服务失败
}
