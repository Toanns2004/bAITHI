package cum.class1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AddressBooksManagement addressBooksManagement = new AddressBooksManagement();
        try {
            do {
                Scanner input = new Scanner(System.in);
                System.out.println("1. Add new contact");
                System.out.println("2. Find a contact by name");
                System.out.println("3. Display contacts");
                System.out.println("4. Exit");
                System.out.print("Choose: ");
                int a = input.nextInt();

                switch (a){
                    case 1:{
                        AddressBooks addressBooks = new AddressBooks();
                        addressBooks.inputDate();
                        addressBooksManagement.addNewAddressBooks(addressBooks);
                    }
                    break;
                    case 2:{
                        Scanner in = new Scanner(System.in);
                        System.out.println("Enter name: ");
                        String n = in.nextLine();
                        addressBooksManagement.getAddressBooksByName(n);
                    }
                    break;
                    case 3:{
                        System.out.println("Name       Company      Email                Phone");
                        addressBooksManagement.getAddressBooks();
                    }
                    break;
                    case 4:{
                        return;
                    }
                }

            }while (true);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
