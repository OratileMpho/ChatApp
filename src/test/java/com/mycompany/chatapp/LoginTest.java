/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class LoginTest {

    // ----------- checkUsername Tests -----------

    @Test
    void testValidUsername() {
        assertTrue(Login.checkUsername("ab_cd"));
    }

    @Test
    void testInvalidUsername_NoUnderscore() {
        assertFalse(Login.checkUsername("abcd"));
    }

    @Test
    void testInvalidUsername_TooLong() {
        assertFalse(Login.checkUsername("abc_def"));
    }

    // ----------- checkPasswordComplexity Tests -----------

    @Test
    void testValidPassword() {
        assertTrue(Login.checkPasswordComplexity("Password1!"));
    }

    @Test
    void testInvalidPassword_TooShort() {
        assertFalse(Login.checkPasswordComplexity("Pass1!"));
    }

    @Test
    void testInvalidPassword_NoUppercase() {
        assertFalse(Login.checkPasswordComplexity("password1!"));
    }

    @Test
    void testInvalidPassword_NoDigit() {
        assertFalse(Login.checkPasswordComplexity("Password!"));
    }

    @Test
    void testInvalidPassword_NoSpecialChar() {
        assertFalse(Login.checkPasswordComplexity("Password1"));
    }

    // ----------- checkCellNumber Tests -----------

    @Test
    void testValidCellNumber() {
        assertTrue(Login.checkCellNumber("+27123456789"));
    }

    @Test
    void testInvalidCellNumber_WrongFormat() {
        assertFalse(Login.checkCellNumber("0123456789"));
    }

    @Test
    void testInvalidCellNumber_TooShort() {
        assertFalse(Login.checkCellNumber("+2712345678"));
    }

    // ----------- registerUser Tests -----------

    @Test
    void testRegisterUser_Success() {
        String result = Login.registerUser("ab_cd", "Password1!");
        assertEquals("Successfully registred ", result);
    }

    @Test
    void testRegisterUser_InvalidUsername() {
        String result = Login.registerUser("abcd", "Password1!");
        assertEquals(
            "Username is not correctly formatted, please ensure that the username contains an underscore and has 5 characters.",
            result
        );
    }

    @Test
    void testRegisterUser_InvalidPassword() {
        String result = Login.registerUser("ab_cd", "pass");
        assertEquals(
            "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter and a number.",
            result
        );
    }

    // ----------- loginUser Tests -----------

    @Test
    void testLoginUser_Success() {
        assertTrue(Login.loginUser("ab_cd", "Password1!", "ab_cd", "Password1!"));
    }

    @Test
    void testLoginUser_Failure() {
        assertFalse(Login.loginUser("ab_cd", "Password1!", "ab_cd", "wrongPass"));
    }

    // ----------- returnLoginStatus Tests -----------

    @Test
    void testReturnLoginStatus_Success() {
        String result = Login.returnLoginStatus(
                "ab_cd", "Password1!",
                "ab_cd", "Password1!",
                "John", "Doe"
        );

        assertTrue(result.contains("welcome back"));
    }

    @Test
    void testReturnLoginStatus_Failure() {
        String result = Login.returnLoginStatus(
                "ab_cd", "Password1!",
                "ab_cd", "wrongPass",
                "John", "Doe"
        );

        assertEquals(
            "Login failed , you have entered the incorrect username or password ",
            result
        );
    }
}
