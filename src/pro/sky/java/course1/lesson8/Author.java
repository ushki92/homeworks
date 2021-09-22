package pro.sky.java.course1.lesson8;

public class Author {
    private String authorName;
    private String authorNameTwo;
    private String authorNameThree;
    private String authorSurname;
    private String authorFullName;


    public Author(String authorName,String authorNameTwo ,String authorNameThree , String authorSurname) {
        this.authorName = authorName;
        this.authorNameTwo = authorNameTwo;
        this.authorNameThree = authorNameThree;
        this.authorSurname = authorSurname;
        this.authorFullName = authorName + " " + authorNameTwo + " " + authorNameThree + " " + authorSurname + " ";
    }

    public String getAuthorFullName() {
        authorFullName = authorFullName.replace("null ", "");

        return authorFullName;
    }

    public String getAuthorName() {

        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;

    }
}
