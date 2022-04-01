package com.bridgelabz;
/*
 *As a User needs to  check the regex pattern for the firstName
 *As a User needs to check the regex pattern for the lastName
 */

/**
 * If we want to represent a group of strings according to a particular pattern then we should go for regular
 * expressions
 */
import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
    Scanner sc = new Scanner(System.in);

    /**
     * creating method firstNameCheck to check firstName is valid or not
     */
    public void firstNameCheck() {
        System.out.print("Enter First Name of User: ");
        String fName = sc.next();
        /*
         * As a User need to enter a valid firstName -firstName starts with Cap and has
         * minimum 3 characters
         */

        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", fName);
        if (check)
            System.out.println("Valid");
        else
            System.out.println("Please Enter a Valid firstName with Only \"One Starting Capital\" letter");
    }

    public void lastNameCheck() {
        /*
         * It will take the input from the User
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Name of User: ");
        String lName = sc.next();
        /*
         * As a User needs to check the regex pattern for the lastName
         */
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", lName);
        if (check)
            System.out.println("Valid");
        else
            System.out.println("Please Enter a Valid Last Name with Only \"One Starting Capital\" letter");
    }

    public static void main(String[] args) {

        /*
         * It will take input from the User
         */
        UserRegistration user = new UserRegistration();

        System.out.println("Welcome to User Registration Program");

        user.firstNameCheck();
        user.lastNameCheck();
    }
}