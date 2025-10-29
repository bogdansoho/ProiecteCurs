package org.example.booksale;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Cartea Junglei", 59.99, "Soho Bogdan", 1990);

        System.out.println("Cartea <" + Book.getName() + "> este la pretul de " + Book.getPrice() + " si este scrisa de " + Book.getAuthor() + " in anul " + Book.getYear());

    }
}
