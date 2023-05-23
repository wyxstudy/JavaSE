package com.my.hello;
//冒泡排序算法
public class MaoPao {
    public static void main(String[] args) {
        //定义一个数组 存储一组数据
        int[] arr = {6, 3, 1, 9};
        arr = null;//改成这样 相当于栈区arr变量没有了对应的数组地址 后面遍历数据的数据自然会报空指针报错
        System.out.println(arr);
        //定义循环的次数
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
