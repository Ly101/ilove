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
@ApiModel(value="TblActress对象", description="")
public class TblActress implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键，女优id")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "中文名")
    private String chineseName;

    @ApiModelProperty(value = "外文名")
    private String foreignName;

    @ApiModelProperty(value = "照片")
    private String picture;

    @ApiModelProperty(value = "女优的类型")
    private String type;

    @ApiModelProperty(value = "漂亮程度")
    private String beautyLevel;

    @ApiModelProperty(value = "罩杯")
    private String cup;

    @ApiModelProperty(value = "出生日期")
    private LocalDate birth;

    @ApiModelProperty(value = "出道日期")
    private LocalDate debutDate;

    @ApiModelProperty(value = "演技")
    private String actingSkill;

    @ApiModelProperty(value = "叫声类型")
    private String yellType;

    @ApiModelProperty(value = "版本")
    private Long version;

    @ApiModelProperty(value = "是否active")
    private Boolean active;

    @ApiModelProperty(value = "创建日期")
    private LocalDateTime gmtCreate;

    @ApiModelProperty(value = "上次修改日期")
    private LocalDateTime gmtModified;


}
