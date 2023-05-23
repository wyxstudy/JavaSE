package com.my.hello;

public class ZhuFeng {
    public static void main(String[] args) {
        double high1 = 8848860;//定义山的高度
        double high2 = 0.1;//定义纸张的高度
        int count = 0;
        while (high2 < high1){
            high2 *= 2;
            count++;
        }
        System.out.println(count);
        System.out.println(high2);
    }
}
