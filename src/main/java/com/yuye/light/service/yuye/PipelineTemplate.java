package com.yuye.light.service.yuye;

/**
 * @Author: zhouliang
 * @Date: 2021/1/17 19:00
 */
@FunctionalInterface
public interface PipelineTemplate  {
    boolean check(String name);
}
