package cum.class1;

import java.util.Scanner;

public class AddressBooks {
    int id;
    String name;
    String company;
    String email;
    String phone;

    public void inputDate(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name :");
            this.name = sc.nextLine();
            System.out.println("Enter company :");
            this.email = sc.nextLine();
            System.out.println("Enter email :");
            this.email = sc.nextLine();
            System.out.println("Enter phone :");
            this.phone = sc.nextLine();
    }
    AddressBooks() {

    }

    public AddressBooks(String name,String phone) {
        this.name = name;
        this.phone = phone;
    }

    public AddressBooks(int id, String name, String company, String email, String phone) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){
        return this.name+"       "+
                this.company+"        "+
                this.email+"        "+
                this.phone;
    }

    public void display(){
        System.out.println("Phone :" +phone);
    }
}
