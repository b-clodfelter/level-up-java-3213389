package com.linkedin;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 6 chars
 * 1 upper
 * 1 lower
 * 1 number
 */
public class PasswordChecker {

  public static boolean isPasswordComplex(String password) {
    return password.length() >= 6 
         && password.matches(".*\\d.*")
         && password.matches(".*[a-z].*")
         && password.matches(".*[A-Z].*");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a password: ");
    String userInput = scanner.nextLine();
    System.out.println("Is the password complex? " + isPasswordComplex(userInput));
    scanner.close();
  }
} 
