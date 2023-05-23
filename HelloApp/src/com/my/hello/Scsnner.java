package com.my.hello;

import java.util.Scanner;

public class Scsnner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//得到一个扫描器对象
        System.out.println("请输入您的用户名");
        String username = sc.next();//输入字符串
        System.out.println("请输入标识号");
        int number = sc.nextInt();//输入整形数据
        Scanner sc1 = new Scanner(System.in);
        System.out.println("用户名是"+username+"标识号是"+number);
        int aa = 80;
        System.out.println(aa>16);//返回true
        boolean res = aa > 18;
        System.out.println(res);//另一种写法，也是返回true
    }
}
