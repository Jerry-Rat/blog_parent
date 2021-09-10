package tk.jerryrat.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
    * api接口日志
    */
@ApiModel(value="api接口日志")
@Data
public class ApiLog implements Serializable {
    @ApiModelProperty(value="主键")
    private Long id;

    /**
    * 用户id
    */
    @ApiModelProperty(value="用户id")
    private Integer memberId;

    /**
    * 提交类型
    */
    @ApiModelProperty(value="提交类型")
    private String method;

    /**
    * 模块
    */
    @ApiModelProperty(value="模块")
    private String module;

    /**
    * 控制器
    */
    @ApiModelProperty(value="控制器")
    private String controller;

    /**
    * 方法
    */
    @ApiModelProperty(value="方法")
    private String action;

    /**
    * 提交url
    */
    @ApiModelProperty(value="提交url")
    private String url;

    /**
    * get数据
    */
    @ApiModelProperty(value="get数据")
    private String getData;

    /**
    * post数据
    */
    @ApiModelProperty(value="post数据")
    private String postData;

    /**
    * ip地址
    */
    @ApiModelProperty(value="ip地址")
    private String ip;

    /**
    * 报错code
    */
    @ApiModelProperty(value="报错code")
    private Integer errorCode;

    /**
    * 报错信息
    */
    @ApiModelProperty(value="报错信息")
    private String errorMsg;

    /**
    * 报错日志
    */
    @ApiModelProperty(value="报错日志")
    private String errorData;

    /**
    * 对外id
    */
    @ApiModelProperty(value="对外id")
    private String reqId;

    /**
    * 状态(-1:已删除,0:禁用,1:正常)
    */
    @ApiModelProperty(value="状态(-1:已删除,0:禁用,1:正常)")
    private Byte status;

    private static final long serialVersionUID = 1L;
}