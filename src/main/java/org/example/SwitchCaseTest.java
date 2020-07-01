package org.example;

public class SwitchCaseTest {
    public static void main(String[] args) {

        int month = 12;

        switch (month) {
            case 1, 2, 3 -> System.out.println("1분기 입니다.");
            case 4, 5, 6 -> System.out.println("2분기 입니다.");
            case 7, 8, 9 -> System.out.println("3분기 입니다.");
            case 10, 11, 12 -> System.out.println("4분기 입니다.");
        }
    }
}
