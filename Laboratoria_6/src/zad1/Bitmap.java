package zad1;

public class Bitmap extends ComputerGraphic{
    public Bitmap(){
        super();
    }
    public Bitmap(int width,int height,String fileName){
        super(width, height, fileName);
    }
    @Override
    public void loadFile(){
        System.out.println("Wczytano Bitmape");
    }
    public void SaveFile(){
        System.out.println("zapisano Bitmape");
    }
}
