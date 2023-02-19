/*
 * Name: Allister Bell Jr
 * Class: CITP190
 * Date: 1/25/23
 * Abstract: This App is a compound interest calculator for savings account. 
 *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.bella41.interestapp;
import java.util.Scanner;
import java.lang.Math; 


/**
 *
 * @author allisterbelljr
 */
public class InterestApp {

    public static void main(String[] args) {
        // Present intro message 
        System.out.println("Welcome to the Savings Account Interest Calculator");
        
        //Initiate Scanner
        Scanner sc = new Scanner(System.in);
        // Retrieve principle input from user
        System.out.println("Enter the principal amount:");
        double principle = sc.nextDouble();
        
        //Retrieve APR from user
        System.out.println("Enter the APR (as a decimal, not a percentage): ");
        double apr = sc.nextDouble();
        
        //Retrieve Term length in years 
        System.out.println("Enter the term in number of years: ");
        int term = sc.nextInt();
        
        //Perform calculation in steps to achieve Accrued savings from interest
        double monthlyRate = 1+ apr/1200;
        double annualRate = Math.pow(monthlyRate,12);
        double finalTermRate = Math.pow(annualRate,term);
        double accruedAmount = principle * finalTermRate; 
        
        //Display Accrued savings 
        System.out.println("The accrued amount for your savings account is: $" + accruedAmount); 
        
    }
}
        