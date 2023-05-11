package cn.tedu.csmall.product.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
//此注解的作用是将此类的所有属性都封装成get/set方法，此外还提供了equals、canEqual、hashCode、toString方法
//此注解需要在实用类的父类添加无参构造方法
@TableName("pms_album")
public class Album implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Integer sort;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

}
