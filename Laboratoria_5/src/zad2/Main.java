package zad2;

import zad1.BookDTO;

public class Main {
    public static void main(String[] args)
    {
        Adress adres = new Adress("Warszawska","6","Olsztyn");
        Person osoba1= new Person("Janek","Franek",adres);
        System.out.println(osoba1);
    }

}