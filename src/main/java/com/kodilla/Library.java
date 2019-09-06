package com.kodilla;

import java.time.LocalDate;

public class Library {
    String title;
    String autor;
    LocalDate publishDate;

    public Library(String title, String autor, int yearOfPub, int monthOfPub, int dayOfPub) {
        this.title = title;
        this.autor = autor;
        this.publishDate = LocalDate.of(yearOfPub, monthOfPub, dayOfPub);
    }
    public String getTitle() {
        return title;
    }
    public String getAutor() {
        return autor;
    }
    public LocalDate getPublishDate() {
        return publishDate;
    }
    public String toString() {
        return title + " - " + autor + ", published: " + publishDate;
    }
    public int hashCode() {
        return publishDate.getYear() * 100 + publishDate.getMonthValue();
    }
    public boolean equals(Object o) {
        Library e = (Library) o;
        return (title.equals(e.getTitle())) &&
                (autor.equals(e.getAutor())) &&
                (publishDate.getYear() == e.getPublishDate().getYear()) &&
                (publishDate.getMonthValue() == e.getPublishDate().getMonthValue()) &&
                (publishDate.getDayOfMonth() == e.getPublishDate().getDayOfMonth());
    }
}
