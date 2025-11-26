package demo;

public class Screwdriver extends WorkTool{
    public Screwdriver(){
        super();
    }
    public Screwdriver(String name, int productionYear){
        super(name,productionYear);
    }
    @Override
    public void use(){
        System.out.println("Uzyto srubokreta");
    }
}
