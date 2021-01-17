package com.yuye.light.service.yuye;

import com.yuye.light.service.pipeline.Cat;
import com.yuye.light.service.pipeline.Pipeline;

/**
 * @Author: zhouliang
 * @Date: 2021/1/17 19:03
 */
public class CatRun {
    public String catDoRun(PipelineTemplate pipelineTemplate){
        boolean cat = pipelineTemplate.check("cat");
        if (cat){
            return "success";
        } else {
            return "fail";
        }
    }
}
