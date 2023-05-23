package com.my.testapp;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(18);
        int age = stu.getAge();
        System.out.println("年龄为：" + age);
    }
}
