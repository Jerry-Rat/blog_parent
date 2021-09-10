package tk.jerryrat.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
    * 博客文章表
    */
@ApiModel(value="博客文章表")
@Data
public class TArticle implements Serializable {
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
    * 文章封面
    */
    @ApiModelProperty(value="文章封面")
    private String pic;

    /**
    * 文章名称
    */
    @ApiModelProperty(value="文章名称")
    private String title;

    /**
    * 文章标签
    */
    @ApiModelProperty(value="文章标签")
    private String tag;

    /**
    * 文章简介
    */
    @ApiModelProperty(value="文章简介")
    private String remark;

    /**
    * 文章阅读量
    */
    @ApiModelProperty(value="文章阅读量")
    private Integer readCount;

    /**
    * 文章评论数
    */
    @ApiModelProperty(value="文章评论数")
    private Integer conCount;

    /**
    * 文章点赞数
    */
    @ApiModelProperty(value="文章点赞数")
    private Integer starCount;

    /**
    * 审核是否通过：0待审核 1通过 2 不通过
    */
    @ApiModelProperty(value="审核是否通过：0待审核 1通过 2 不通过")
    private String state;

    /**
    * 发布人
    */
    @ApiModelProperty(value="发布人")
    private String userId;

    /**
    * 文章内容  转换html的内容
    */
    @ApiModelProperty(value="文章内容  转换html的内容")
    private String content;

    /**
    * markdown 未转换html的内容
    */
    @ApiModelProperty(value="markdown 未转换html的内容")
    private String markdownContent;

    /**
    * 0. mavon-editor 1.editor-wang
    */
    @ApiModelProperty(value="0. mavon-editor 1.editor-wang")
    private String markdownType;

    /**
    * 文章类型
    */
    @ApiModelProperty(value="文章类型")
    private String type;

    /**
    * 好文：0不是 1是
    */
    @ApiModelProperty(value="好文：0不是 1是")
    private String good;

    /**
    * 推荐：0不是 1是
    */
    @ApiModelProperty(value="推荐：0不是 1是")
    private String recommend;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
    * 修改时间
    */
    @ApiModelProperty(value="修改时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}