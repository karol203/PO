package zad7;

public class Employee {
    private String firstName;
    private String lastName;
    private int position;
    private int age;
    private int salary;

    public Employee(String firstName,String lastName, int position, int age, int salary){
        this.firstName =firstName;
        this.lastName=lastName;
        this.position=position;
        this.age=age;
        this.salary=salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void showInformation(){
        System.out.println(this.firstName + " " + this.lastName + " " + this.position + " " + this.age + " " + this.salary);
    }

    public static void main(String[] args) {
        Employee pracownik1 = new Employee("Karol","Nowakowski",1,1,1);
        pracownik1.showInformation();
    }
}
