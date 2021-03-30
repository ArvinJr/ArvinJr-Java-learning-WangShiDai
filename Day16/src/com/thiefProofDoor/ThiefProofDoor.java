package com.thiefProofDoor;

/**
 * @author arvin
 * @date 2021/03/30
 */
public class ThiefProofDoor extends Door implements Lock{


    @Override
    public void open() {
        System.out.println("门打开了");
    }

    @Override
    public void close() {
        System.out.println("门关上了");
    }

    @Override
    public void lockUp() {
        System.out.println("门锁上了");
    }

    @Override
    public void openLock() {
        System.out.println("锁打开了");
    }
}
