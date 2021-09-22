package pro.sky.java.course1.lesson8;

public class Lesson8 {

    public static void main(String[] args) {
        Author jonahrowling = new Author("Johan", null, null, "Rowling");
        Book bookOne = new Book("Harry Potter and Philosopher's Stone", jonahrowling.getAuthorFullName(), 1997);
        Author johntolkien = new Author("John", "Ronald", "Reuel", "Tolkien");
        Book bookTwo = new Book("The Hobbit, or There and Back Again", johntolkien.getAuthorFullName(), 1937);
        Libryary librayary = new Libryary(10);
        librayary.AddNewBook(bookOne);
        librayary.AddNewBook(bookTwo);
        librayary.PrintAllBooks();
        librayary.findBook(bookOne.getName());
        librayary.changeDateOfPublishThroughName(bookOne.getName(), 199);
        librayary.PrintAllBooks();

    }

}

