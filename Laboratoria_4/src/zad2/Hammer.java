package zad2;

public class Hammer extends Tool{
    public Hammer(){
        super("Młot");
    }

    public static void main(String[] args) {
        Hammer mlot = new Hammer();
        System.out.println(mlot.toolName);
    }
}

