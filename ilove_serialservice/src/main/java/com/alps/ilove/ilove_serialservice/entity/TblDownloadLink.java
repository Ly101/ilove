package com.alps.ilove.ilove_serialservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="TblDownloadLink对象", description="")
public class TblDownloadLink implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "番号主键")
    private Integer serialId;

    @ApiModelProperty(value = "下载链接")
    private String link;

    @ApiModelProperty(value = "版本")
    private Long version;

    @ApiModelProperty(value = "是否active")
    private Boolean active;

    @ApiModelProperty(value = "创建日期")
    private LocalDateTime gmtCreate;

    @ApiModelProperty(value = "上次修改日期")
    private LocalDateTime gmtModified;


}
