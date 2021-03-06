package com.wangshidai;

import java.util.Scanner;

/**
 * @author arvin
 * @date 2021/3/2
 */
public class HomeWork07 {

    public static void main(String[] args) {
        int num = 9;
        String sex;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (num < 10) {
                System.out.println("进入决赛");
                System.out.print("请输入性别:");
                sex = scanner.next();
                    if (sex.equals("男")) {
                        System.out.println("进入男子组");
                        break;
                    } else if (sex.equals("女")) {
                        System.out.println("进入女子组");
                        break;
                    } else {
                        System.out.print("输入错误内容，请重新输入性别");
                    }
            } else {
                System.out.println("分数过低！");
            }
        }
    }

}
