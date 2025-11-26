package zad1;

public class Vector extends ComputerGraphic{
    public Vector(){
        super();
    }
    public Vector(int width,int height,String fileName){
        super(width, height, fileName);
    }
    @Override
    public void loadFile(){
        System.out.println("Wczytano Vector");
    }
    public void SaveFile(){
        System.out.println("zapisano Vector");
    }
}
