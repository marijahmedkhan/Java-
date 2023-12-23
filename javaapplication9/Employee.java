/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author MARIJ AHMED
 */
public class Employee{
    String name;
    int year;
    String address;

Employee(String a, int b, String c){
    name=a;
    year=b;
    address=c;
}
public void Display(){
            System.out.print("Name: ");
            System.out.println(name);
            System.out.print("Year of joining: ");
            System.out.println(year);
            System.out.print("Address: ");
            System.out.println(address);
            System.out.println();
}   
}