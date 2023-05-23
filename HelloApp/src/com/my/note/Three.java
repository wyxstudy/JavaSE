package com.my.note;

public class Three {
    public static void main(String[] args) {
        int a = 100;
        int b = 166;
        int c = 199;
        int res1 = a > b ? a : b;
        int res2 = res1 > c ? res1 : c;
        System.out.println("最大值是："+res2);
    }
}
