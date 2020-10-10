package com.yuye.basicdata;

/**
 * @Author yuye
 * @Date 2020/10/9 8:15 下午
 */
public class PassByValueExample {
    public static void main(String[] args) {
        Dog dog = new Dog("A");
        System.out.println(dog.getObjectAddress()); // Dog@4554617c
        func(dog);
        System.out.println(dog.getObjectAddress()); // Dog@4554617c
        System.out.println(dog.getName());          // A
    }
    //此时方法里和方法外的两个指针指向了不同的对象，
    // 在一个指针改变其所指向对象的内容对另一个指针所指向的对象没有影响
    private static void func(Dog dog) {
        System.out.println(dog.getObjectAddress()); // Dog@4554617c
        dog = new Dog("B");
        System.out.println(dog.getObjectAddress()); // Dog@74a14482
        System.out.println(dog.getName());          // B
    }
}
