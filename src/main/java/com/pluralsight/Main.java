package com.pluralsight;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("What is the serial number?: ");
        String serialNumber = scanner.nextLine();

        System.out.println("Please enter your phone model: ");
        String phoneModel = scanner.nextLine();

        System.out.println("Please enter your carrier: ");
        String carrier = scanner.nextLine();

        System.out.println("Please enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Please enter the phone owners name: ");
        String owner = scanner.nextLine();

        // Cellphone object with given info
        Cellphone c1 = new Cellphone(serialNumber, phoneModel, carrier, phoneNumber, owner);

        //using the name we made, .displayInfo, will display ".displayInfo"
        // from the cellphone class, including the user input
        c1.displayInfo();
        }
    }

