import java.util.ArrayList;

public class Teacher implements Cloneable {
    String name;
    String subject;
    int experience;

    public Teacher(){

    }
    public Teacher(String name, String subject, int experience){
        this.name=name;
        this.subject=subject;
        this.experience=experience;
    }

    @Override
    public Teacher clone() {
        try {
            Teacher clone = (Teacher) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", experience=" + experience +
                '}';
    }

    public static void main(String[] args) {
        Teacher Jacek = new Teacher("Jacek","Analiza",5);
        Teacher Jacekklon = Jacek.clone();
        System.out.println(Jacek);
        System.out.println(Jacekklon);
        Jacekklon.name="Grzegorz";
        Jacekklon.subject = "tsers";
        Jacekklon.experience=4;
        System.out.println(Jacek);
        System.out.println(Jacekklon);
    }
}
