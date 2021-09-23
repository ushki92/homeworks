package pro.sky.java.course1.lesson9;

import java.util.Objects;

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

}
