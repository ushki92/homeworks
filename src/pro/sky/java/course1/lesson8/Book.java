package pro.sky.java.course1.lesson8;

public class Book {
    String author;
    String nameOfBook;
    int dateOfPublish;
    public Book(String nameOfBook, String author, int dateOfPublish) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.dateOfPublish = dateOfPublish;
    }

    public Book() {

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return nameOfBook;
    }

    public int getdateOfPublish() {
        return dateOfPublish;
    }

    public void setDateOfPublish(int dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }


}
