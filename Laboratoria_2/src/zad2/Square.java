package zad2;

public class Square {
    public int side;

    public Square(int side){
        this.side = side;
    }
    public Square(){
        this(1);
    }
    public int Polepowierzchni(){
        return side*side;
    }

    public static void main(String[] args) {
        Square kwadrat = new Square(5);
        System.out.println(kwadrat.side);
        System.out.println(kwadrat.Polepowierzchni());
    }
}
