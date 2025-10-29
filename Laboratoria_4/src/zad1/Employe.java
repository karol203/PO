package zad1;

public class Employe extends Person{
    public int salary;
    public String jobId;
    public Employe(String firstName,String lastName, int salary, String jobId){
        super(firstName,lastName);
        this.salary=salary;
        this.jobId=jobId;
    }
    public void test(){
        System.out.println(getFirstName() + " " + lastName);
    }
}
