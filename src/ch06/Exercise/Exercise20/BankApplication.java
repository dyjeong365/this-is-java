package ch06.Exercise.Exercise20;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("-".repeat(50));
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-".repeat(50));
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            }
            if (selectNo == 2) {
                accountList();
            }
            if (selectNo == 3) {
                deposit();
            }
            if (selectNo == 4) {
                withdraw();
            }
            if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void createAccount() {
        System.out.println("-".repeat(10));
        System.out.println("계좌생성");
        System.out.println("-".repeat(10));
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("계좌주: ");
        String owner = scanner.next();
        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();
        Account account = new Account(ano, owner, balance);
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = account;
                break;
            }
        }
        System.out.print("결과: 계좌가 생성되었습니다.");
        System.out.println();
    }

    private static void accountList() {
        System.out.println("-".repeat(10));
        System.out.println("계좌목록");
        System.out.println("-".repeat(10));

        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (account != null) {
                System.out.println(account.getAno() + "\t\t" + account.getOwner() + "\t\t" + account.getBalance());
            }
        }

    }

    private static void deposit() {
        System.out.println("-".repeat(10));
        System.out.println("예금");
        System.out.println("-".repeat(10));
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int deposit = scanner.nextInt();

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() + deposit);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    private static void withdraw() {
        System.out.println("-".repeat(10));
        System.out.println("출금");
        System.out.println("-".repeat(10));
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("출금액: ");
        int withdraw = scanner.nextInt();

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        if (account.getBalance() < withdraw) {
            System.out.println("결과: 잔액이 부족합니다.");
            return;
        }
        account.setBalance(account.getBalance() - withdraw);
        System.out.println("결과: 출금이 성공되었습니다.");
    }

    private static Account findAccount(String ano) {
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                String dbAno = accountArray[i].getAno();
                if (dbAno.equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }
}
