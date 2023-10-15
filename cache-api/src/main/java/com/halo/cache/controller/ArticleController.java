package com.halo.cache.controller;

import com.halo.service.IArticleService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章资讯 controller
 *
 * @author halo
 * @since 2023/10/15 21:50
 */
@RequestMapping("/article")
@RestController
public class ArticleController {

    @Resource
    private IArticleService articleService;
}
