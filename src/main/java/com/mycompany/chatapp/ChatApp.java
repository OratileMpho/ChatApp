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
    
}
    
    
  


   
        
    
    
    
        
 



