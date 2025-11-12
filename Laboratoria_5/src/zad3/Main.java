package zad3;

import zad2.Adress;
import zad2.Person;

public class Main {
    public static void main(String[] args)
    {
        PointC punkt1 = new PointC(1,1);
        PointR punkt2 = punkt1.toRecord();
        System.out.println(punkt2);
        PointR punkt3 = punkt2.toClass().toRecord();
        System.out.println(punkt3);
    }

}

