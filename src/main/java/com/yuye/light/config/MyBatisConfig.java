package com.yuye.light.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhouliang
 * @Date: 2020/9/17 0:04
 */
@Configuration
@MapperScan("com.yuye.light.mbg.mapper")
public class MyBatisConfig {
}
