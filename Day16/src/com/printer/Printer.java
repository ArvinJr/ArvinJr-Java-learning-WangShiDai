package com.printer;

/**
 * @author arvin
 * @date 2021/03/30
 */
public class Printer implements Ink,Paper{

    public void print(int paperType, int inkType){
        if (inkType == 1){
            if (paperType == 1){
                System.out.println("使用" + colorful() + "在" + a4() + "上打印。");
            } else {
                System.out.println("使用" + colorful() + "在" + b5() + "上打印。");
            }
        } else {
            if (paperType == 1){
                System.out.println("使用" + black() + "在" + a4() + "上打印。");
            } else {
                System.out.println("使用" + black() + "在" + b5() + "上打印。");
            }
        }
    }

    @Override
    public String colorful() {
        return "彩色墨盒";
    }

    @Override
    public String black() {
        return "黑白墨盒";
    }

    @Override
    public String a4() {
        return "A4纸张";
    }

    @Override
    public String b5() {
        return "B5纸张";
    }

}
