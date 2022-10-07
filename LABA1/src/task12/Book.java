package task12;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    public String title ;
    public String author;
    public int price;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int price, int isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public Book clone(){
        return new Book(this.title, this.author, this.price, this.isbn);
    }

    @Override
    public boolean equals(Object o) {
        if (this.title.equals(((Book)o).title) || this.author.equals(((Book)o).author) || this.price != ((Book)o).price)
            return  false;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.title != null ? this.title.hashCode() : 0);
        hash += (this.author.hashCode() ^ (this.author.hashCode() >>> 2));
        hash += this.price % 29;
        return hash;
    }

    @Override
    public String toString() {
        return new String("Title: " + this.title + " Author: " + this.author + " Price :" + this.price);
    }

    @Override
    public int compareTo(Book o) {
        if (o == null)
            throw new NullPointerException();

        if (this.isbn > o.isbn)
            return 1;
        if (this.isbn < o.isbn)
            return -1;

        return 0;
    }
}
