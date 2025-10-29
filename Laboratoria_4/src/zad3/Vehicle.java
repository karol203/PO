package zad3;

public class Vehicle {
    String model;
    String rej;
    public void drive(){
        System.out.println("The vehicle is moving.");
    }
    public Vehicle(String model,String rej){
        this.model=model;
        this.rej=rej;
    }
}
