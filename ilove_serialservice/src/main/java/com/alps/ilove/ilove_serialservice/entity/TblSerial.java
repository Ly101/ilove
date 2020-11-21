package com.alps.ilove.ilove_serialservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Ly
 * @since 2020-11-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TblSerial对象", description="")
public class TblSerial implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "番号")
    private String serialNumber;

    @ApiModelProperty(value = "封面")
    private String picture;

    @ApiModelProperty(value = "剧名")
    private String title;

    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "所属av系列")
    private Integer seriesId;

    @ApiModelProperty(value = "是否有马赛克")
    private Boolean isMosoiced;

    @ApiModelProperty(value = "上传者")
    private Integer uploader;

    @ApiModelProperty(value = "发布日期")
    private LocalDate publishDate;

    @ApiModelProperty(value = "发布公司")
    private String publishCompany;

    private Long version;

    private Boolean active;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;


}
