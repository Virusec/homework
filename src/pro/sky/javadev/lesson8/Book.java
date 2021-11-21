package pro.sky.javadev.lesson8;

public class Book {
    public final String title;
    private final Author author;
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
}
