package zad1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
    String name;
    double salary;
    LocalDate employmentDate;

    public Employee(String name, double salary, LocalDate employmentDate) {
        this.name = name;
        this.salary = salary;
        this.employmentDate = employmentDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", employmentDate=" + employmentDate +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary,o.salary);
    }

    public static void main(String[] args) {
        ArrayList<Employee> pracownicy = new ArrayList<>();
        pracownicy.add(new Employee("Karol",15000,LocalDate.of(2024,04,01)));
        pracownicy.add(new Employee("Lukasz",7400,LocalDate.of(2023,01,02)));
        pracownicy.add(new Employee("Bolek",4500,LocalDate.of(2022,04,10)));
        System.out.println(pracownicy);
        Collections.sort(pracownicy);
        System.out.println(pracownicy);

    }
}
