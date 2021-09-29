package pro.sky.java.course1.lesson9;

import java.util.Objects;

public class Book {

    private final Author author;
    private final String nameOfBook;
    int dateOfPublish;
    public Book(String nameOfBook, Author author, int dateOfPublish) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.dateOfPublish = dateOfPublish;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getDateOfPublish() {
        return dateOfPublish;
    }

    public void setDateOfPublish(int dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return dateOfPublish == book.dateOfPublish && Objects.equals(author, book.author) && Objects.equals(nameOfBook, book.nameOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameOfBook, dateOfPublish);
    }

    @Override
    public String toString() {
        return "Book:" + nameOfBook +
                " by " + author ;
    }
}
