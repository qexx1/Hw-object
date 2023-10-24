package Библиотека;

import java.util.Objects;

public class Book {
    private final Author author;
    private final String title;
    private int publishingYear;


    public Book(Author author, String title, int publishingYear) {
        this.author = author;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublisher(int publisher) {
        this.publishingYear = publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o == null|| this.getClass() !=o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author,title,publishingYear);
    }

    @Override
    public String toString() {
        return title + " " + publishingYear + " " + author;
    }
}
