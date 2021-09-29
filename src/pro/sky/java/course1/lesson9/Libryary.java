package pro.sky.java.course1.lesson9;


public class Libryary {
    private final Book[] books;

    public Libryary(int size) {
        this.books = new Book[size];
    }

    public void addNewBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Libryary" + System.lineSeparator() + books[0] + System.lineSeparator() + books[1];
    }
}




