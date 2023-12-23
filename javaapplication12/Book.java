/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author MARIJ AHMED
 */
public class Book {
    String title;
    String author;
    int isbn;
    int pages;
    
    Book(String t,String a,int i,int p){
        title=t;
        author=a;
        isbn=i;
        pages=p;
    }
    Book(){
        System.out.println("Default values");
    }
    public void Displayinfo(){
        System.out.println("The title of book is "+title);
        System.out.println("The author of book is "+author);
        System.out.println("The ISBN number of book is "+isbn);
        System.out.println("The total number of pages in book is "+pages);
    }
}
