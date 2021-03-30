package com.thiefProofDoor;

/**
 * @author arvin
 * @date 2021/03/30
 */
public class Test {

    public static void main(String[] args) {
        ThiefProofDoor door = new ThiefProofDoor();
        Lock lock = new ThiefProofDoor();

        door.close();
        lock.lockUp();
        lock.openLock();
        door.open();

    }

}
