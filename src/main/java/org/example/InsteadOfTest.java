package org.example;

public class InsteadOfTest {

    record Person(String name, int age){}

    public static void main(String[] args) {
        var p1 = new Person("minssogi", 29);

        if(p1 instanceof Person p2) {
            System.out.println("name : " + p2.name());
            System.out.println("age : " + p2.age());
        }
    }
}