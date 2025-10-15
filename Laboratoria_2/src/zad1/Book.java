package zad1;

public class Book {
    public String title;
    public String author;
    public int publicationYear;

    public Book(){

    }
    public Book(String title,String author,int publicationYear){
        this.title = title;
        this.author =  author;
        this.publicationYear = publicationYear;
    }

    public static void main(String[] args) {
        Book ksiazka1 = new Book();
        ksiazka1.title = "W pustyni i w puszczy";
        ksiazka1.author = "Henryk Sienkiewicz";
        ksiazka1.publicationYear = 1911;
        System.out.println(ksiazka1.title + " "+ ksiazka1.author +" "+ ksiazka1.publicationYear);
        Book ksiazka2 = new Book("Pan Tadeusz", "Adam Mickiewicz",2015);
        System.out.println(ksiazka2.title + " "+ ksiazka2.author +" "+ ksiazka2.publicationYear);
    }
}
