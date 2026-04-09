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

    public static void main(String[] args) {
       
        
       Scanner input = new Scanner (System.in);// creating an oject called scanner 
       LoginProfile userlogin = new LoginProfile(); // creating an object userLoginof a type login
       
       String Username;
       System.out.println("Please enter your username"); // the user is asked to enter their username
       Username = input.nextLine();
       
        if(userlogin.checkUsername(Username)==false){
            System.out.println("Username was not coreectly formatted, make sure your username has 5 characters including _");
        
        
        }
        else{
        System.out.println("Username successfully captured");
        
        }
        System.out.println("Hello World!");
    }

    private static class LoginProfile {

        public LoginProfile() {
        }

        private boolean checkUsername(String Username) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
    
        
 

}

