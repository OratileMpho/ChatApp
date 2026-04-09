/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner; // import a scanner class



Scanner input= new Scanner(System.in); // Creating object of a type scanner
public class Login {
    
    Login Userlogin = new Login(); // creating object uderlogin of type login
    
    String username;
    
    
    
    
    
    
    public boolean checkUsername(String username){
    
        if(username.contains("-")&& username.length() <=5){
        
        return true;
        }else{
        return false;
        }
    
  
    }
    
    Login login= new Login(); // creating object of login class
   
    @Test
    public void testCheckusername(){
    
     assertEquals(true,login.checkUserName("ora_"));
    }
    
    
    
    @Test
    public void testCheckuserNameWithoutUnderscore(){
    
    assertEquals(false,login.testCheckusername("username"));
    
    }
}
