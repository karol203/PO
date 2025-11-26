package zad2;

public class Television extends ElectronicDevice{
    public Television(){
        super();
    }
    public Television(String manufacturer, String model, int productionYear){
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