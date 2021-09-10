package tk.jerryrat.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
    * 关注表
    */
@ApiModel(value="关注表")
@Data
public class TAttention implements Serializable {
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
    * 用户id
    */
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
    * 被关注的用户id
    */
    @ApiModelProperty(value="被关注的用户id")
    private Integer attentionUserId;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}