package zad2;

public class Smartphone extends ElectronicDevice{
    public Smartphone(){
        super();
    }
    public Smartphone(String manufacturer, String model, int productionYear){
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
