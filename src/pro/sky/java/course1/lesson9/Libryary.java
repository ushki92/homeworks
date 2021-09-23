package pro.sky.java.course1.lesson9;

import java.util.Arrays;

public class Libryary {

    private Book[] books;

    public Libryary(int size) {
        this.books = new Book[size];
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
    }

    public void AddNewBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    @Override
    public String toString() {
        System.out.println("Libryary:");
        for (Book book : books) {
            if (book != null) {
                System.out.print(book.toString());
                System.out.println();
            } else {
                break;
            }
        }
        return "";
    }
}




