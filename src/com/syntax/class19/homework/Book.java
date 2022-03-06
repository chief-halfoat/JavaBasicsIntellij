package com.syntax.class19.homework;

//Write Book class that will have instance variables and 2 Constructors.
// While creating an object make sure:
//        Instance variables are being initialized
//        Both Constructors are being executed
public class Book {
    private String title;
    private int pageNum;

    public Book(){
        System.out.println("No argument");
    }
    public Book(String title, int pageNum){
        this();
        this.title=title;
        this.pageNum=pageNum;
    }

}
