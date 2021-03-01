package com.wangshidai;

/**
 * @author arvin
 * @date 2021/3/1
 */
public class Pay {
    public static void main(String[] args) {
        int shirtPrice = 245;
        int shoesPrice = 570;
        int racketPrice = 320;
        int shirtNo = 2;
        int shoesNo = 1;
        int racketNo = 1;
        double discount = 0.8;

        // 算出折后金额
        double finalPrice = (shirtPrice*shirtNo + shoesPrice*shoesNo + racketPrice*racketNo)*discount;
        // 算出找零
        double change = 1500 - finalPrice;

        System.out.println("********消费单********");
        System.out.println("购买商品\t单价\t\t个数\t\t金额");
        System.out.println("T恤\t\t￥" + shirtPrice + "\t" + shirtNo + "\t\t￥" + shirtPrice*shirtNo);
        System.out.println("网球鞋\t￥" + shoesPrice + "\t" + shoesNo + "\t\t￥" + shoesPrice*shoesNo);
        System.out.println("网球拍\t￥" + racketPrice + "\t" + racketNo + "\t\t￥" + racketPrice*racketNo + "\n");

        System.out.println("折扣:\t\t8折");
        System.out.println("消费总金额\t￥" + finalPrice);
        System.out.println("实际交费\t\t￥1500");
        System.out.println("找钱\t\t\t￥" + change);

        // 计算积分
        int point = (int) finalPrice / 100 * 3;
        System.out.println("本次购物所获的积分是:\t" + point);
    }
}
