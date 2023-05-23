package com.my.hello;

import java.util.Scanner;

public class Process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的心跳:");
        int heartBeat = sc.nextInt();
        //流程控制语句，包括顺序结构，分支结构，循环结构
        if(heartBeat > 60 && heartBeat < 100){
            System.out.println("您的心跳正常");
        }else {
            System.out.println("您需要进一步的检查");
        }
        sc.close();//关闭对象
    }
}
