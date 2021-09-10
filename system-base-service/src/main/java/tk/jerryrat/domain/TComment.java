package tk.jerryrat.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
    * 评论表
    */
@ApiModel(value="评论表")
@Data
public class TComment implements Serializable {
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
    * 文章或者源码或者说说id
    */
    @ApiModelProperty(value="文章或者源码或者说说id")
    private Integer infoId;

    /**
    * 评论id
    */
    @ApiModelProperty(value="评论id")
    private Integer commentUserId;

    /**
    * 被评论用户id
    */
    @ApiModelProperty(value="被评论用户id")
    private Integer targetUserId;

    /**
    * 评论内容
    */
    @ApiModelProperty(value="评论内容")
    private String content;

    /**
    * 评论时间
    */
    @ApiModelProperty(value="评论时间")
    private Date createTime;

    /**
    * 1.blog 2.code 3.shuoshuo
    */
    @ApiModelProperty(value="1.blog 2.code 3.shuoshuo")
    private String type;

    private static final long serialVersionUID = 1L;
}