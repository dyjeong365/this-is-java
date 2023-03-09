package ch04.Exercise;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        boolean run = true;

        int balance = 0;

        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("-".repeat(30));
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-".repeat(30));
            System.out.print("선택> ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("예금액> ");
                    balance += sc.nextInt();
                    System.out.println();
                    continue;
                case 2:
                    System.out.print("출금액> ");
                    balance -= sc.nextInt();
                    System.out.println();
                    continue;
                case 3:
                    System.out.print("잔고> ");
                    System.out.println(balance);
                    System.out.println();
                    continue;
                case 4:
//                    System.out.println();
                    run = false;
                    break;
            }
            System.out.println("프로그램 종료");
        }
    }
}
