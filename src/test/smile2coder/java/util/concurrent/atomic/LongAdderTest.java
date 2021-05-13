package test.smile2coder.java.util.concurrent.atomic;

import java.util.concurrent.atomic.LongAdder;

public class LongAdderTest {
    public static void main(String[] args) {
        LongAdder longAdder = new LongAdder();
        longAdder.add(1);
        longAdder.add(2);
        longAdder.add(3);

        System.out.println("longAdder.sum() = " + longAdder.sum());
    }
}
