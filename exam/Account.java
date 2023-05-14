package com.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    String customerCode;
    String customerName;
    int accNumber;
    long amount;

    int money;


//    public Account(String customerCode, String customerName, int accNumber, long amount) {
//        this.customerCode = customerCode;
//        this.customerName = customerName;
//        this.accNumber = accNumber;
//        this.amount = amount;
//    }

    public Account() {
        customerCode = "";
        customerName = "";
        accNumber = 0;
        amount = 0;
    }


    public void input() throws Exception {
        Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d{5}");
        try {
            System.out.println("Enter customer Code : ");
            String code = input.nextLine();
            if (code.length() != 6) {
                throw new Exception("Code must be charaters");
            }
            this.customerCode = code;

            System.out.println("Enter account number: ");
            String Number = input.nextLine();

            if (!Number.startsWith("100")) {
                throw new Exception("Account number must be start with 100");
            }

            Matcher matcher = pattern.matcher(Number);
            if (!matcher.matches()) {
                throw new Exception("Account number must be 5 digits");
            }

            System.out.println("Name : ");
            this.customerName = input.nextLine();


        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public double payment(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money : ");
        money = input.nextInt();
            if (money >= 0) {
                amount = amount + money;
            } else {
                System.out.println("Recharge failed");

        }
        return amount;
    }
    public double withdrawMoney(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money : ");
        money = input.nextInt();
            if (money < amount && money > 0) {
                amount = amount - money;
            } else {
                System.out.println("Withdrawal failed");
            }
        return amount;
    }
    @Override
    public String toString() {
        return "Account{" +
                "customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", accNumber=" + accNumber +
                ", amount=" + amount +
                '}';
    }
}