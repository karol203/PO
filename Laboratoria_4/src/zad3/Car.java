package zad3;

public class Car extends Vehicle{
    public Car(){
        super("passat","WPN");
    }
    @Override
    public void drive(){
        //System.out.println("The car is moving");
        super.drive();
        System.out.println("the "+ rej + " " + model + " is moving");
    }

    public static void main(String[] args) {
        Car passat = new Car();
        passat.drive();
    }
}
