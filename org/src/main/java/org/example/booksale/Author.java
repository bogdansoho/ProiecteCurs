package org.example.booksale;

public class Author {
    public String name;
    public String email;

    public Author() {

    }

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
