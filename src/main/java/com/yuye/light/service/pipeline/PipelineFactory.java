package com.yuye.light.service.pipeline;

import com.yuye.light.service.strtategy.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhouliang
 * @Date: 2021/1/17 17:31
 */
@Service
public class PipelineFactory implements ApplicationListener<ContextRefreshedEvent> {

    private Map<String, Pipeline<Cat>> catPipelineMap = new HashMap<>();

    private Map<String, Pipeline<Dog>> dogPipelineMap = new HashMap<>();

    public Pipeline<Cat> getCatPipeline(String eventType) {
        return catPipelineMap.get(eventType);
    }

    public Pipeline<Dog> getDogPipeline(String eventType) {
        return dogPipelineMap.get(eventType);
    }


    public void setCatPipeline(List<Pipeline<Cat>> pipelines) {
        if (pipelines != null && pipelines.size() > 0) {
            for (Pipeline<Cat> pipeline : pipelines){
                catPipelineMap.put(pipeline.attachedEvent(), pipeline);
            }
        }
    }

    public void setDogPipeline(List<Pipeline<Dog>> pipelines) {
        if (pipelines != null && pipelines.size() > 0) {
            for (Pipeline<Dog> pipeline : pipelines){
                dogPipelineMap.put(pipeline.attachedEvent(), pipeline);
            }
        }
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext context = event.getApplicationContext();
        Map<String, Pipeline> checkStrategies = context.getBeansOfType(Pipeline.class);
        if (checkStrategies!=null) {
            Collection<Pipeline> values = checkStrategies.values();

            for (Pipeline strategy : values) {
                if (strategy.attachedEvent().equals("a")){
                    catPipelineMap.put(strategy.attachedEvent(),strategy);
                } else if (strategy.attachedEvent().equals("z")){
                    dogPipelineMap.put(strategy.attachedEvent(), strategy);
                }
            }
            //this.serviceMap = strategies.stream().collect(Collectors.toMap(AnimalService::getCode, animalService -> animalService));
        }
    }
}
