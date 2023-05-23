package com.my.hello;

import java.util.Random;
import java.util.Scanner;
public class MaxScoreGuess {
    public static void main(String[] args) {
        int[] number = new int[5];
        Random r = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = r.nextInt(20)+1;
        }
        Scanner sc =new Scanner(System.in);
        Out:
        while (true){
            System.out.println("请输入您猜测的数据:");
            int guessNumber = sc.nextInt();
            for (int i = 0; i < number.length; i++) {
                if(guessNumber == number[i]){
                    System.out.println("猜对了! 索引是" + i);
                    break Out;
                }
            }
            System.out.println("没猜中");
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
