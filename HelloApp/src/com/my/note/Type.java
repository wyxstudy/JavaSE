package com.my.note;

public class Type {
    public static void main(String[] args) {
        int a = 169;
        int ge = a % 16;
        int shi = a / 10 % 10;
        int bai = a / 100;
        int c = 18;
        String score = c > 60 ? "合格" : "不合格";
        System.out.println("个位数是："+ge+"十位数是："+shi+"百位数是："+bai);
        System.out.println(score);
    }
}
