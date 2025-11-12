package zad1;

import java.time.Year;

public record BookDTO(String title, String author, double price, int yearOfPublication) {
    public BookDTO{
        if(yearOfPublication<1998){
            yearOfPublication = Year.now().getValue();
        }
    }
}
