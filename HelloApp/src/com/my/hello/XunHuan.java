package com.my.hello;

import java.util.Scanner;

public class XunHuan {
    public static void main(String[] args) {
        int password = 520;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入密码:");
            int res = sc.nextInt();
            if(res == password){
                System.out.println("密码正确");
                break;
            }else {
                System.out.println("密码错误");
            }
        }
    }
}
