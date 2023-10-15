package com.halo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.halo.entity.Article;
import org.springframework.stereotype.Repository;

/**
 * 文章 mapper
 *
 * @author halo
 * @since 2023/10/15 21:26
 */
@Repository
public interface ArticleMapper extends BaseMapper<Article> {
}
