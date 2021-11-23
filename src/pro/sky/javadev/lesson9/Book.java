package pro.sky.javadev.lesson9;

import java.util.Objects;

public class Book {
    public final String title;
    public final Author author;
    public int publishYear;

    public Book(Author author, String title, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getAuthorName() {
        return author.getFirstName() + " " + author.getLastName();
    }

    public String getTitle() {
        return title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Book{" + "author=" + author + ", title='" + title + '\'' + ",publishYear='" + publishYear + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, publishYear);
    }
}
