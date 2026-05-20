/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.chatapp;


/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
import java.util.Random;
public class ChatApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // user is enforced to enter their personal details which their name and surname
        
        
       
        System.out.println("Enter your First Name:");
        String firstname = input.nextLine();

        System.out.println("Enter  your Last Name:");
        String lastname = input.nextLine();

        // Username
        String username;
        while (true) {
            System.out.println("Enter your username:");// user is supposed to enter their username that contains 5 characters including an underscore
            username = input.nextLine();
// this statemnet will help in ensuring that the required format of the username is followed.
            if (Login.checkUsername(username)) {
                System.out.println("Username successfully captured.");
                break;
            } else {
                System.out.println("Invalid username format, please ensure that your username has 5 characters or less including an underscore : ");
            }
        }

        // Password
        // password entered by user should contain a special character, a number and a capital letter. this method will also not not accept any password without the specified characteristics
        String password;
        while (true) {
            System.out.println("Enter your password:");
            password = input.nextLine();
// this if statements validates and ensures that all the requirements of the password are met.
            if (Login.checkPasswordComplexity(password)) {
                System.out.println("Password successfully captured.");
                break;
            }else
                    {
                System.out.println("Invalid password format. Please ensure that your password contain a special character, a numuber and a capital letter :");
            }
        }

        // Cell number
        // this method will enforce the user to enter their cell phone number that wil include a natinal code and has to contain 9 digits
        String phoneNumber;
        while (true) {
            System.out.println("Enter your cell number (+27XXXXXXXXX):");
            phoneNumber = input.nextLine();

            if (Login.checkCellNumber(phoneNumber)) {
                System.out.println("Cell phone successfully added.");
               
                
             
                break;
            }else{
                System.out.println("Invalid phone number format.");
            }
        }

        // Registration message
        System.out.println(Login.registerUser(username, password));

        System.out.println("\n--- LOGIN SECTION ---");

        // Login loop
        while (true) {
            System.out.println("Enter username:");
            String enteredUsername = input.nextLine();

            System.out.println("Enter password:");
            String enteredPassword = input.nextLine();

            if (Login.loginUser(username, password, enteredUsername, enteredPassword)) {
                System.out.println("Login successful!");
                System.out.println("Welcome back, " + firstname + " " + lastname + "!");
                break;
            }else{
                System.out.println("Login failed. Try again.\n");
            }
        }

        
      // Part 2 poe where it deals with messages 
      
        //Login
        // for authantication purposes 
        boolean loggedIn = true;

        if (!loggedIn) {
            System.out.println("You must login first.");
            return;
        }

        System.out.println("Welcome to QuickChat");

        // Ask user how many messages they want to send
        System.out.print("How many messages would you like to send? ");
        int totalMessages = input.nextInt();
        input.nextLine();

        //ARRAYS ONLY
        String[] messageIDs = new String[totalMessages];
        String[] recipients = new String[totalMessages];
        String[] messages = new String[totalMessages];

        int sentMessages = 0;
        int option = 0;

        while (option != 3) {

            System.out.println("\nMENU");
            System.out.println("1. Send Messages");
            System.out.println("2. Show recently sent messages");
            System.out.println("3. Quit");

            System.out.print("Choose option: ");
            option = input.nextInt();
            input.nextLine();

           
            }
        }

        
    }


        
    


       
       
       
       
       
        
      
        
        
    
