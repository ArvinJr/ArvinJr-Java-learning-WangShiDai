package com.wangshidai;

import java.util.Scanner;

/**
 * @author arvin
 * @date 2021/3/2
 */
public class Age {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("请输入年龄:");
        num = scanner.nextInt();

        if (num > 70){
            System.out.println("睡大马路");
        } else if (num > 50 && num <= 70){
            System.out.println("到处浪");
        } else if (num > 30 && num <= 50){
            System.out.println("结婚生子");
        } else if (num > 18 && num <=30){
            System.out.println("爱干嘛就干嘛");
        } else {
            System.out.println("听妈妈的话，好好学习");
        }
    }

}
