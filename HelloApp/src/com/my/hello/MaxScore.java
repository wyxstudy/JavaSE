package com.my.hello;

public class MaxScore {
    public static void main(String[] args) {
        int[] score = {10, 20, 30 ,40};
        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if(max < score[i]){
                max = score[i];
            }
        }
        System.out.println(max);
    }
}
