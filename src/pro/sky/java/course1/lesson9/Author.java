package pro.sky.java.course1.lesson9;

import java.util.Objects;

public class Author {


    private final String authorName;
    private  String authorNameTwo;
    private  String authorNameThree;
    private  String authorSurname;
    private  String authorFullName;

        public Author(String authorName,String authorNameTwo ,String authorNameThree , String authorSurname) {
        this.authorName = authorName;
        this.authorNameTwo = authorNameTwo;
        this.authorNameThree = authorNameThree;
        this.authorSurname = authorSurname;
        this.authorFullName = authorName + " " + authorNameTwo + " " + authorNameThree + " " + authorSurname + " ";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorNameTwo, author.authorNameTwo) && Objects.equals(authorNameThree, author.authorNameThree) && Objects.equals(authorSurname, author.authorSurname) && Objects.equals(authorFullName, author.authorFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorNameTwo, authorNameThree, authorSurname, authorFullName);
    }

    @Override
    public String toString() {
        return "Author:" + authorFullName.replace("null ", "") ;
    }

    public String getAuthorNameTwo() {
        return authorNameTwo;
    }

    public void setAuthorNameTwo(String authorNameTwo) {
        this.authorNameTwo = authorNameTwo;
    }

    public String getAuthorNameThree() {
        return authorNameThree;
    }

    public void setAuthorNameThree(String authorNameThree) {
        this.authorNameThree = authorNameThree;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }
}
