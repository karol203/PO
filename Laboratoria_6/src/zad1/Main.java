package zad1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(10,2,"Vektor1");
        Vector vector2 = new Vector(11,3,"Vektor2");
        Vector vector3 = new Vector(12,4,"Vektor3");
        Vector vector4 = new Vector(13,5,"Vektor4");
        Vector vector5 = new Vector(14,6,"Vektor5");
        ArrayList<ComputerGraphic> Grafika = new ArrayList<>();
        Grafika.add(vector1);
        Grafika.add(vector2);
        Grafika.add(vector3);
        Grafika.add(vector4);
        Grafika.add(vector5);
        int i = 1;
        for (ComputerGraphic computerGraphic : Grafika){
            System.out.println(i);
            computerGraphic.loadFile();
            computerGraphic.SaveFile();
            i++;
        }
    }
}
