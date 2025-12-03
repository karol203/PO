import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student>{
    String imie;
    double sredniaOcen;
    int rokUrodzenia;

    public Student(String imie,double sredniaOcen,int rokUrodzenia){
        this.imie=imie;
        this.sredniaOcen=sredniaOcen;
        this.rokUrodzenia=rokUrodzenia;
    }
    @Override
    public String toString(){
        return "" + sredniaOcen + ' ' + rokUrodzenia;
    }
    @Override
    public int compareTo(Student a){
        if(this.sredniaOcen > a.sredniaOcen){
            return 1;
        }
        else if(this.sredniaOcen < a.sredniaOcen){
            return -1;
        }
        else if (this.rokUrodzenia > rokUrodzenia){
            return 1;
        }
        else if (this.rokUrodzenia < rokUrodzenia){
            return -1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("sdfs",5,2004));
        students.add(new Student("asdfa",4.5,2003));
        students.add(new Student("lukasz",3.0,2005));
        //System.out.println(students);
        //Collections.sort(students);
        //System.out.println(students);
        //students.sort(new AvgGradeStudentComparator());
        //System.out.println(students);
        students.sort(new YearofBirthStudentComparator());
        System.out.println(students);

    }
}
class AvgGradeStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.sredniaOcen,o2.sredniaOcen);
    }
}
class YearofBirthStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.rokUrodzenia, o2.rokUrodzenia);
    }
}