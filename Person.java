import java.util.Objects;

public class Person {
    String firstName;
    String lastName;
    int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String firstName, String lastName, int age){
        if(age<0){
            this.age=0;
        }
        this.age=age;
        if(firstName == null){
            firstName = "";
        }
        if(lastName == null){
            lastName = "";
        }
        this.firstName=firstName;
        this.lastName=lastName;

        }
    @Override
    public String toString() {
        return "Person: " + getFirstName() + "\n" + getLastName() + "\n Age: " + getAge();
    }
    @Override
    public boolean equals(Object other){
        if(!(other instanceof Person person)){
            return false;
        }
        return person.getFirstName().equals(this.getFirstName()) && person.getLastName().equals(this.getLastName()) && person.getAge()==this.getAge();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getFirstName(),getLastName(),getAge());
    }

}
