package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {

        Library book1 = new Library("Władca Pierścieni", "John R. R. Tolkien", 2012, 3, 20);
        Library book2 = new Library("Hamlet", "William Szekspir", 1603, 5, 15);
        Library book3 = new Library("Przygody Hucka Fina", "Mark Twain", 1884, 11, 9);
        Library book4 = new Library("Wielki Gatsby", "F.C. Fitzgerald", 2002, 1, 10);
        Library book5 = new Library("Billy Lynn’s Long Halftime Walk", "Ben Fountain", 2015, 12, 6);
        Library book6 = new Library("Hamlet", "William Szekspir", 1603, 5, 15);

        HashSet<Library> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);
        System.out.println(bookSet);
        System.out.println("Books which were  published before 2010r.");

        for (Library theBook : bookSet) {
            if (theBook.getPublishDate().getYear() <= 2010) {
                System.out.println(theBook);
            }
        }
        //Sprawdzenie ilości książek w zbiorze (czy liczy zdublowane)
        System.out.println("Numer of books in whole library: " + bookSet.size());
    }
}