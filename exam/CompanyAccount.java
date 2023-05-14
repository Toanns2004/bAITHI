package com.exam;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyAccount {
    List<Account> list;
    public CompanyAccount(){
        list = new ArrayList<Account>();
        Account a = new Account();
        list.add( a );

    }
    public void  addAccount(){
        Account s = null;
        s = new Account();
        try {
            s.input();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        list.add( s );
    }
    Account findById() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter code : ");
        String sc = input.nextLine();

        for (Account i : list) {
            if(sc.equals(findById().customerCode)){
                System.out.println(i.toString());
                return i;
            }else {
                System.out.println("Not found");
            }
        }
        return null;
    }
    public void payment(){
        Account find = this.findById();
        if (find != null){
            find.payment();
        }else {
            System.out.println("Not found");
        }
    }

    public void withdraw (){
        Account find = this.findById();
        if (find != null){
            find.withdrawMoney();
        }else {
            System.out.println("Not found");
        }

    }
    public void display(){
        Account find = this.findById();
        if (find != null){
            for (Account i : list){
                System.out.println(i.toString());
            }
        }else {
            System.out.println("Not found");
        }
    }
}
