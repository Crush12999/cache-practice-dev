package com.halo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 文章资讯表
 */
@TableName(value = "article")
@Data
@ToString
public class Article implements Serializable {

    /**
     * 主键
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章内容，长度不超过9999，需要在前后端判断
     */
    private String content;

    /**
     * 文章类型，1：图文（1张封面），2：纯文字
     */
    private Integer articleType;

    /**
     * 文章封面图，article_type=1 的时候展示
     */
    private String articleCover;

    /**
     * 用户累计点击阅读数（喜欢数）（点赞） - 放redis
     */
    private Integer readCounts;

    /**
     * 文章评论总数。评论防刷，距离上次评论需要间隔时间控制几秒
     */
    private Integer commentCounts;

    /**
     * 文章发布时间（也是预约发布的时间）
     */
    private LocalDateTime publishTime;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}