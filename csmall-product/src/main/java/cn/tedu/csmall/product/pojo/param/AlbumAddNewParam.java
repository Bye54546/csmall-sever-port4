package cn.tedu.csmall.product.pojo.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class AlbumAddNewParam implements Serializable {
    @ApiModelProperty(value = "相册名称", required = true,example = "美女图集")
    private String name;
    @ApiModelProperty(value = "相册简介", required = true,example = "美女图集")
    private String description;
    @ApiModelProperty(value = "排序序号，在1-255之间", required = true,example = "999")
    private Integer sort;
}