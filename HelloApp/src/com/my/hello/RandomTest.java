package com.my.hello;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random r =new Random();

        int res = r.nextInt(100)+1;//先减后加来满足数字的要求取件
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您猜测的数字：");
            int guess = sc.nextInt();
            if (guess < res) {
                System.out.println("数字小");
            } else if (guess > res) {
                System.out.println("数字大");
            } else if (guess == res) {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
