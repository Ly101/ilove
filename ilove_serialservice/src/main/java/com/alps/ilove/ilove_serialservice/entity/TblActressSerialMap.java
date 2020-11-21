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
@ApiModel(value="TblActressSerialMap对象", description="")
public class TblActressSerialMap implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer serialId;

    private Integer actressId;

    @ApiModelProperty(value = "版本")
    private Long version;

    @ApiModelProperty(value = "是否active")
    private Boolean active;

    @ApiModelProperty(value = "创建日期")
    private LocalDateTime gmtCreate;

    @ApiModelProperty(value = "上次修改日期")
    private LocalDateTime gmtModified;


}
