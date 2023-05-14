package com.exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CompanyAccount companyAccount = new CompanyAccount();
        do{
            System.out.println("1. Add new account");
            System.out.println("2. Payment");
            System.out.println("3. Withdraw money");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Choose : ");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();
            switch (choose){
                case 1:{
                    companyAccount.addAccount();
                }
                break;
                case 2:{
                    companyAccount.payment();
                }
                break;
                case 3:{
                    companyAccount.withdraw();
                }
                break;
                case 4:{
                    companyAccount.display();
                }
                break;
                case 5:{
                    return ;
                }
            }
        }while (true);
    }
}
