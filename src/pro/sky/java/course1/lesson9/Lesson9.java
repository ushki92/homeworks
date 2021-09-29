package pro.sky.java.course1.lesson9;

public class Lesson9 {

    public static void main(String[] args) {
        System.out.println("Authors;");
        Author jonahrowling = new Author("Johan", null, null, "Rowling");
        Author jonahrowling2 = new Author("Johan", null, null, "Rowling");
        Author johntolkien = new Author("John", "Ronald", "Reuel", "Tolkien");
        System.out.println("Author copies equal: " +jonahrowling.equals(jonahrowling2));
        System.out.println("Author copies equal by hashCode: " + (jonahrowling.hashCode() == jonahrowling2.hashCode()));
        System.out.println("Authors equal: " + johntolkien.equals(jonahrowling));
        System.out.println("Authors equal by hashCode: " + (jonahrowling.hashCode() == johntolkien.hashCode()));
        System.out.println(johntolkien);
        System.out.println(jonahrowling);

        System.out.println("==============================");

        System.out.println("Books:");
        Book bookOne = new Book("Harry Potter and Philosopher's Stone", jonahrowling, 1997);
        Book bookOne2 = new Book("Harry Potter and Philosopher's Stone", jonahrowling, 1997);
        Book bookTwo = new Book("The Hobbit, or There and Back Again", johntolkien, 1937);
        System.out.println("Book copies equal: " + bookOne.equals(bookOne2));
        System.out.println("Book copies equal by hashCode: " + (bookOne.hashCode() == bookOne2.hashCode()));
        System.out.println("Books equal: " + bookOne.equals(bookTwo));
        System.out.println("Books equal by hashCode: " + (bookOne.hashCode() == bookTwo.hashCode()));
        System.out.println(bookOne);
        System.out.println(bookTwo);

        System.out.println("==============================");

        Libryary librayary = new Libryary(2);
        librayary.addNewBook(bookOne);
        librayary.addNewBook(bookTwo);
        System.out.println(librayary);
    }

}

