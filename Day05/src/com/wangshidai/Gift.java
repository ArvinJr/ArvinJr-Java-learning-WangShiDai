package com.wangshidai;

import java.util.Scanner;

/**
 * @author arvin
 * @date 2021/3/2
 */
public class Gift {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int str;
        int luckyNum = (int) (Math.random()*10);

        System.out.println("我行我素购物管理系统> 幸运抽奖\n");
        System.out.print("请输入4位会员号:");
        str = scanner.nextInt();

        if (str%100/10 == luckyNum){
            System.out.println(str + "号客户是幸运客户，获精美MP3一个");
        } else {
            System.out.println(str + "号客户，谢谢你的支持！");
        }
    }

}
