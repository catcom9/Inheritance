package ie.atu.week9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();

        System.out.println("Please enter your address");
        String address = input.nextLine();

        System.out.println("Please enter your phone");
        String phone = input.nextLine();

        System.out.println("Please enter your customer number");
        int custNum = input.nextInt();

        System.out.println("Do you want to be on the mailing list");
        boolean list = input.hasNextBoolean();

        Customer newCust = new Customer(name, address, phone, custNum, list);
        System.out.println("You entered " + newCust.toString());
        */

        PreferredCustomer preferredCustomer = new PreferredCustomer();
        preferredCustomer.setName("John");
        preferredCustomer.setAddress("GMIT");
        preferredCustomer.setPhone("087123324");
        preferredCustomer.setCustNumber(1004);
        preferredCustomer.setMailingList(true);
        preferredCustomer.addLoyaltyPoints(700);
        System.out.println(preferredCustomer);

        preferredCustomer.addLoyaltyPoints(800);
        System.out.println(preferredCustomer);






    }
}