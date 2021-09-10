package tk.jerryrat.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
    * 音乐表
    */
@ApiModel(value="音乐表")
@Data
public class TMusic implements Serializable {
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
    * 音乐名称
    */
    @ApiModelProperty(value="音乐名称")
    private String name;

    /**
    * 作者
    */
    @ApiModelProperty(value="作者")
    private String artist;

    /**
    * 歌曲来源
    */
    @ApiModelProperty(value="歌曲来源")
    private String url;

    /**
    * 歌曲封面
    */
    @ApiModelProperty(value="歌曲封面")
    private String cover;

    /**
    * 歌词
    */
    @ApiModelProperty(value="歌词")
    private String lrc;

    private static final long serialVersionUID = 1L;
}