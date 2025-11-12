package zad1;

public class Main {
    public static void main(String[] args)
    {
        BookDTO ksiazka1 = new BookDTO("ksiazka1","Janek",15.50,2004);
        System.out.println(ksiazka1.author() + " " + ksiazka1.title() + " " + ksiazka1.price() + " " + ksiazka1.yearOfPublication());
    }

}