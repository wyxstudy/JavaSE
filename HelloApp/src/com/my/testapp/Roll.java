package com.my.testapp;

import java.util.Random;
import java.util.Scanner;

public class Roll {
    public static void main(String[] args) {
        int[] number = createNumber();
        int[] number1 = userNumber();
        System.out.println("本期中奖号码为:");
        printArry(number);
        /*
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
         */
        System.out.println("\n您输入的一组号码是:");
        printArry(number1);
        judge(number,number1);
        /*
        for (int j = 0; j < number1.length; j++) {
            System.out.print(number1[j] + " ");
        }
         */
        /*
        if(number == number1){
            System.out.println("\n恭喜您，中奖了");
        }else {
            System.out.println("\n很遗憾，未中奖");
        }
         */
    }
    //定义判断两组数据中奖情况的方法
    public static void judge(int[] number, int[] number1){
        //定义两个变量存储红球和蓝球猜中的个数 初始为0个
        int redHitNumber = 0;
        int blueHitNumber =0;
        for (int i = 0; i < number1.length - 1; i++) {
            for (int j = 0; j < number.length - 1; j++) {
                if(number1[i] == number[j]){
                    redHitNumber++;
                    //别忘了跳出循环
                    break;
                }
            }
        }
        blueHitNumber = number1[number1.length - 1] == number[number.length - 1] ? 1 : 0;
        /*
        if (number1[6] == number[6]){
            blueHitNumber++;
        }
         */
        System.out.println("\n中" + redHitNumber + "个红球，" + blueHitNumber + "个蓝球");
        //下面根据if elseif 判断中奖情况的具体金额 打印输出

    }
    //定义一个遍历数组的方法 这里可别写数组长度减一了 切记
    public static void printArry(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //写随机生成一组双色球数据的方法 该方法的重点是让前六个号码不发生重复 通过死循环 循环 标记位来写
    public static int[] createNumber(){
        int[] number = new int[7];
        Random r = new Random();
        for (int i = 0; i < number.length - 1; i++) {
            while (true){
                //定义变量data存放当前循环得到的第i个数的值 1-33 即0-32+1
                int data = r.nextInt(33) + 1;
                //判断当前的数和前面生成的数不重复 重复的话重新生成一个随机数 直到不重复才存入到数组当中
                //定义一个标记为 默认data没有重复
                boolean flag = true;
                //开始判断当前生成的数是不是和data发生重复 同样需要循环来判断
                //重新定义一个for循环 循环的次数是小于i的 如果当前生成的数和data发生重复 则flag变为false 否则没有发生重复 则可以“赋值”到数组当中
                for (int j = 0; j < i; j++){
                    if (number[j] == data){
                        flag = false;
                        //跳出当前循环
                        break;
                    }
                }
                if (flag){
                    number[i] = data;
                    break;
                }
            }
        }
        //最后一步生成最后一个1-16的随机号码 不存在重复的问题
        number[number.length - 1] = r.nextInt(16) + 1;
        /*一步写完 不需要再定义变量存储值
        int data1 = r.nextInt(16) + 1;
        number[number.length - 1] = data1;
        */
        return number;
    }
    public static int[] userNumber(){
        int[] number = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < number.length - 1; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球的号码:");
            int data = sc.nextInt();
            number[i] = data;
        }
        System.out.println("请输入一个蓝球号码:");
        number[number.length - 1] = sc.nextInt();
        return number;
    }
}
