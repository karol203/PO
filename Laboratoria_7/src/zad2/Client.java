package zad2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Client implements Comparable<Client> {
    String name;
    int clientNumber;
    LocalDate lastLogin;

    public Client(String name, int clientNumber, LocalDate lastLogin) {
        this.name = name;
        this.clientNumber = clientNumber;
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientNumber=" + clientNumber +
                ", lastLogin=" + lastLogin +
                '}';
    }

    @Override
    public int compareTo(Client o) {
        return this.lastLogin.compareTo(o.lastLogin);
    }

    public static void main(String[] args) {
        ArrayList<Client> klienci = new ArrayList<>();
        klienci.add(new Client("Karol",1, LocalDate.of(2023,01,10)));
        klienci.add(new Client("Lukasz",2, LocalDate.of(2023,01,10)));
        klienci.add(new Client("Bolek",3, LocalDate.of(2022,04,11)));
        System.out.println(klienci);
        Collections.sort(klienci);
        System.out.println(klienci);
    }
}
