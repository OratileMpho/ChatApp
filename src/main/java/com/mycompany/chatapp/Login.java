/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author lab_services_student
 */
public class Login {

    // Registers a user
    public static String registerUser(String username, String password) {
        boolean isUsernameValid = checkUsername(username);
        boolean isPasswordValid = checkPasswordComplexity(password);

        if (isUsernameValid && isPasswordValid) {
            return "Registration is a success";

        } else if (!isUsernameValid) {
            return "Username is not correctly formatted, please ensure that the username contains an underscore and has 5 characters.";

        } else {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter and a number.";
        }
    }

   
}
