package com.yuye.basicdata;

/**
 * @Author yuye
 * @Date 2020/10/9 8:06 下午
 */
public class Dog extends Animal {
    String name;

    Dog(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getObjectAddress() {
        return super.toString();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
