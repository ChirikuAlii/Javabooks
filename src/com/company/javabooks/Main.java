package com.company.javabooks;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Git World");

        Books books = new Books("learn java","Chiriku" ,2);

        books.read();
        books.writing();

        String strName = books.get_name();
        String strAuthor = books.get_author();
        String strPages = String.valueOf(books.get_Pages());

        System.out.println(strName + ", " + strAuthor + ", " + strPages );

    }
}
