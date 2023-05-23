package com.my.testapp;
//标准Java bean 私有变量 无参构造器（默认就有） setter和getter方法
// 注意：有残构造器可有可无 视具体情况而定 但是写了有参构造器 就必须写出来无参构造器
public class Student {
    private int id;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Student() {
    }
}
