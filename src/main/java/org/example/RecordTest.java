package org.example;

public class RecordTest {
    record TwoValueBundle(String first, boolean second){ }

    public static void main(String[] args )
    {
        var p1 = (TwoValueBundle) complexLogic("test", true);
        System.out.println(p1.first());
        System.out.println(p1.second());
    }

    public static Record complexLogic(String first, Boolean second) {
        try {
            Thread.sleep(300);
            first = first + " complexLogic finished.";
            second = second && false;
        } catch (InterruptedException e) {

        }
        return new TwoValueBundle(first, second);
    }
}
