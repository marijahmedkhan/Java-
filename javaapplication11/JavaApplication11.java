/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author MARIJ AHMED
 */
 import java.util.Scanner;
public class JavaApplication11 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter your born year : ");
        int dob=sc.nextInt();
        int age=2023-dob;
        System.out.println("Person born in "+dob+" then age is "+age);
       
    }
    
}
