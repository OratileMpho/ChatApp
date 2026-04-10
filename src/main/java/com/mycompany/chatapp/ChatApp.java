/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class ChatApp {

    public void NameandSurname(String[] args){
    
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Please enter your name : ");
       String firstname = scanner.nextLine();
       
       System.out.println("Please enter your last name : ");
       String Lastname = scanner.nextLine();
    
    
    }
          // validating username   
    public void validateUsername(String[] args) {
 
        String Username = "";
        boolean isValid = Username.contains("_") && Username.length() <= 5;
        if (isValid) {
            System.out.println("Username successfully created");

        } else {

            System.out.println("Username is not correctly formatted, please ensure that your username conatains an underscore and your characters are 5 or less");
        }

    }
    // creating a scanner that will allow user to enter password and this will aslo validate the password

    public static void Password() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String Password = scanner.nextLine();

        boolean containsCapital = false;
        boolean hasANumber = false;
        boolean SpecialCha = false;

        for (char c : Password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                containsCapital = true;
            }
            if (Character.isDigit(c)) {
                hasANumber = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                SpecialCha = true;
            }
        }

        boolean isValid = Password.length() >= 8 && containsCapital && hasANumber && SpecialCha;

        if (isValid) {
            System.out.println("Password was successfully captured");
        } else {
            System.out.println("Password does not meet requirements");
        }

        scanner.close();
    }

    //allowing the user to enter their cellphone number and also validating it 
    public void CellPhone(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String Cellphone = " ";

        while (true) {

            System.out.println("Please enter your cellphone number , make sure it includes the national code : "); // this willl ensure that the user enters their cellphone number that has the correct or relevent national code

            Cellphone = scanner.nextLine().trim();

            if (Cellphone.matches("\\+\\d{1,3}\\d{9}")) {// this a simple regex for the number to include the +27 code which identifies the nationality and also to make sure it has 9 digits

                System.out.println("Cell phone number entered is valid");

            } else {

                System.out.println("Cellphone number is not recongnised, please ensure that the entered cellphone number has 9 digits with its correct valid national code");
            }
        }
    }

}
    
    
  


   
        
    
    
    
        
 



