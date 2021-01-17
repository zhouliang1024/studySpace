package com.yuye.light.service.strtategy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author: zhouliang
 * @Date: 2021/1/17 14:17
 */
@Service
public class AnimalStrategy implements ApplicationListener<ContextRefreshedEvent> {

    private Map<Integer,AnimalService> serviceMap=new HashMap<>();

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext context = event.getApplicationContext();
        Map<String, AnimalService> checkStrategies = context.getBeansOfType(AnimalService.class);
        if (checkStrategies!=null) {
            Collection<AnimalService> strategies = checkStrategies.values();

            for (AnimalService strategy : strategies) {
                serviceMap.put(strategy.getCode(),strategy);
            }
            //this.serviceMap = strategies.stream().collect(Collectors.toMap(AnimalService::getCode, animalService -> animalService));
        }
    }

    public AnimalService getAnimal(Integer code){
        return serviceMap.get(code);
    }
}
