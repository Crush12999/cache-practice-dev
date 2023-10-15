package com.halo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

/**
 * 文章类型
 */
@TableName(value = "article_type")
@Data
@ToString
public class ArticleType implements Serializable {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 类型名称
     */
    private String typeName;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}