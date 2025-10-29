package org.example.booksale;

public class Book {
    public static String name;
    public static int year;
    public static String Author;
    public static double price;

    public Book() {

    }

    public Book(String name, double price , String Author, int year) {
        this.name = name;
        this.year = year;
        this.Author = Author;
        this.price = price;
    }

    public static String getName() {
        return name;
    }

    public static int getYear() {
        return year;
    }

    public static String getAuthor() {
        return Author;
    }

    public static double getPrice() {
        return price;
    }

}
