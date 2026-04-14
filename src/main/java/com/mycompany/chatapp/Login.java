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

    //a user is registred 
    public static String registerUser(String username, String password) {
        boolean isUsernameValid = checkUsername(username);
        boolean isPasswordValid = checkPasswordComplexity(password);

        if (isUsernameValid && isPasswordValid) {

            return "Successfully registred ";

        } else if (!isUsernameValid) {

            return "Username is not correctly formatted, please ensure that the username contains an underscore and has 5 characters.";

        } else {

            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter and a number.";
        }
    }

    public static boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public static boolean checkPasswordComplexity(String password) {

        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        return hasUppercase && hasDigit && hasSpecial;
    }

    //Validating the phone number 
    //this method is used to check if the cellphone number entered is valid
    public static boolean checkCellNumber(String phoneNumber) {

        String regex = "^\\+27\\d{9}$"; //this ensures that user enters the national code which is +27, followed by 9 more digits

        //this will return true if the phone number matches the specified characteristics of the format in whcih the cellphone nymber should be entered, else will return false
        return phoneNumber.matches(regex);
    }

//this is to check the login
    public static boolean loginUser(String registeredUsername, String registeredPassword,
            String enteredUsername, String enteredPassword) {

        return registeredUsername.equals(enteredUsername)
                && registeredPassword.equals(enteredPassword);
    }

    //this will be the login status messsage 
    public static String returnLoginStatus(String registeredUsername, String registeredPassword, String enteredUsername, String enteredPassword,
            String firstname, String lastname) {

        if (loginUser(registeredUsername, registeredPassword, enteredUsername, enteredPassword)) {

            return "welcome back , you have successfully logged in" + firstname + " " + lastname;// concatinates welcome back with the usersname and usersurname

        } else {

            return "Login failed , you have entered the incorrect username or password ";
        }
    }

}
