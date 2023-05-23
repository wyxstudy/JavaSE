package com.my.hello;

import java.util.Scanner;
//水仙花数
public class Flower {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 999; i++){
                int ge = i % 10;
                int shi = i / 10 % 10;
                int bai = i / 100;
                if(ge * ge *ge + shi * shi * shi + bai * bai * bai == i) {
                    System.out.print("\t" + i);
                    count++;//每打印一次 ++一次 循环执行完毕之后 就是一共的水仙花数
                }
        }
        System.out.println("一共有" + count + "个水仙花数\t");
    }
}
