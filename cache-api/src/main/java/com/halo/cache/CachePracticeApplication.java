package com.halo.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 多级缓存实战练习
 *
 * @author halo
 * @since 2023/10/15 19:22
 */
@MapperScan("com.halo.mapper")
@SpringBootApplication
public class CachePracticeApplication {
    public static void main(String[] args) {
        // 关闭 pagehelper banner 显示
        System.setProperty("pagehelper.banner", "false");
        SpringApplication.run(CachePracticeApplication.class, args);
    }
}
