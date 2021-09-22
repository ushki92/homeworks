package pro.sky.java.course1.lesson8;

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
                System.out.println();
                return;
            }
        }
    }

    public void PrintAllBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.print(books[i].getAuthor() + ":");
                System.out.print(books[i].getName() + ":");
                System.out.print(books[i].getdateOfPublish());
                System.out.println();
            } else {
                return;
            }

        }
    }

    public void findBook(String bookName) {
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals(bookName)) {
                System.out.print(books[i].getName() + " by ");
                System.out.print(books[i].getAuthor() + " was published in ");
                System.out.print(books[i].getdateOfPublish());
                System.out.println();
                return;
            }
        }
        System.out.println("Book is not found.");
    }

    public void changeDateOfPublishThroughName(String bookName, int newDateOfPublish) {
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals(bookName)) {
                book.setDateOfPublish(newDateOfPublish);
                return;
            }
        }
        System.out.println("Book is not found.");
    }

}




