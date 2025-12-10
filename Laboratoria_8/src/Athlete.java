import java.util.ArrayList;

public class Athlete implements Cloneable{
    String name;
    ArrayList<Integer> lapTimes;

    public Athlete(){

    }
    public Athlete(String name,ArrayList<Integer> lapTimes){
        this.name=name;
        this.lapTimes=lapTimes;
    }

    @Override
    public Athlete clone() {
        return new Athlete(this.name,(ArrayList<Integer>) this.lapTimes.clone());
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", lapTimes=" + lapTimes +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Integer> czas = new ArrayList<>();
        czas.add(15);
        czas.add(13);
        czas.add(12);
        Athlete UsianBolt= new Athlete("Usian",czas);
        Athlete UsianBoltK = UsianBolt.clone();
        UsianBolt.toString();
        UsianBoltK.toString();
    }

}
