package zad4;

import java.util.Arrays;

public record Student(String imie, String nazwisko, double[] oceny) {
    public double averageGrades(){
        return Arrays.stream(oceny).sum()/oceny.length;
    }
}
