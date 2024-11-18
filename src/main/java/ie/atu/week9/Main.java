package ie.atu.week9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();

        System.out.println("Please enter your address");
        String address = input.nextLine();

        System.out.println("Please enter your phone");
        String phone = input.nextLine();

        System.out.println("Please enter your customer number");
        String custNum = input.nextLine();

        System.out.println("Do you want to be on the mailing list");
        boolean list = input.hasNextBoolean();

        Customer newCust = new Customer(name, address, phone, custNum, list);
        System.out.println("You entered " + newCust.toString());


    }
}