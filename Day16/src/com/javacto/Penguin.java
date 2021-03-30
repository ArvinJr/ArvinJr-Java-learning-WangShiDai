package com.javacto;

/**
 * @author arvin
 * @date 2021/03/29
 */
public class Penguin extends Pet{

    @Override
    public void eat(){
        /*增加健康值*/
        super.setHealth(super.getHealth()+10);
        // 判断是否超出阈值
        if (super.getHealth() > 100) {
            super.setHealth(100);
            System.out.println("企鹅吃饱了，健康值增加到了100");
        }else {
            System.out.println("企鹅吃饱了，健康值增加 10");
        }

        /*增加好感度*/
        super.setLove(super.getLove()+10);
        // 判断是否超出阈值
        if (super.getLove() > 100) {
            super.setLove(100);
            System.out.println("企鹅吃饱了，亲密度增加到了100");
        }else {
            System.out.println("企鹅吃饱了，亲密度增加 10");
        }
    }

}
