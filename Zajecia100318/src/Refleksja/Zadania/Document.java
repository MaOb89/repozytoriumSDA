package Refleksja.Zadania;

import java.util.Date;

public class Document {
    private String [] authors = new String[10];
    private Date date;
    private int counter = 0;

    public Document(Date date){
        this.date=date;
    }

    public String []getAuthors() {
        return authors;
    }

    public Date getDate() {
        return date;
    }

    public void AddAuthor(String author) {
        if (counter<10) {
            authors[counter] = author;
            counter++;
        }
    }
}
