package zad2;

public class Laptop extends ElectronicDevice{
    public Laptop(){
        super();
    }
    public Laptop(String manufacturer, String model, int productionYear){
        super(manufacturer,model,productionYear);
    }
    @Override
    public void turnon(){
        System.out.println("Włączony");
    }
    public void turnof(){
        System.out.println("Wyłączony");
    }
}