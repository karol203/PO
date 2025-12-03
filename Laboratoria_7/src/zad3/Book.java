package zad3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Book implements Comparable<Book>{
    String title;
    int numberOfPages;
    LocalDate publicationYear;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", publicationYear=" + publicationYear +
                '}';
    }

    public Book(String title, int numberOfPages, LocalDate publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public static void main(String[] args) {
        ArrayList<Book> ksiazki = new ArrayList<>();
        ksiazki.add(new Book("Balladyna",200,LocalDate.of(2015,04,01)));
        ksiazki.add(new Book("Pan Tadeusz",350,LocalDate.of(2018,06,01)));
        ksiazki.add(new Book("W pustyni i w puszczy",170,LocalDate.of(2016,03,04)));
        System.out.println(ksiazki);
        Collections.sort(ksiazki);
        System.out.println(ksiazki);
    }

    @Override
    public int compareTo(Book o) {
        return Double.compare(this.numberOfPages,o.numberOfPages);
    }
}
