package com.yuye.light.service.yuye;

import org.springframework.stereotype.Service;

/**
 * @Author: zhouliang
 * @Date: 2021/1/17 19:52
 */
@Service
public class PipelineImpl  implements PipelineTemplate{
    @Override
    public boolean check(String name) {
        return false;
    }
}
