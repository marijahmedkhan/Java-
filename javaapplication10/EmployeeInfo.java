/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author MARIJ AHMED
 */

public class EmployeeInfo {
    int amount;
    int hours;
    public void getinfo(int a,int h){
        amount=a;
        hours=h;
        System.out.println("Number of hours: "+h);
        System.out.println("Salary: "+a);
    }
    public void Addwork(){
        if(hours>6){
            amount+=5;
            System.out.println("Total salary is: "+amount);
        }
        else{
            System.out.println("No increment in salary.");
        }
    }
}
