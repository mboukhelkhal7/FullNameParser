package org.example;

import java.util.Scanner;

public class FullNameParser {
    static Scanner input = new Scanner(System.in);

    public String firstName;
    public String middleName;
    public String lastName;
    public String fullName;

    public void userName(){
        System.out.print("Please enter your name: ");
        fullName = input.nextLine().trim();

        String[] parts = fullName.split(" ");

        if (parts.length == 2) {
            firstName = parts[0];
            lastName = parts[1];
        } else if (parts.length == 3) {
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        } else {
            System.out.println("Invalid input. Please enter 2 or 3 words only.");
            return; // Stop if name is not in expected format
        }

        // Output
        System.out.println("First name: " + firstName);

        System.out.println("Last name: " + lastName);



    }

}
