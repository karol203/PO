package zad6;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name,String breed,int age){
        this.name =name;
        this.breed=breed;
        this.age=age;
    }
    public Dog(String name,String breed){
        this(name,breed,1);
    }

    public static void main(String[] args) {
        Dog pies = new Dog("fafik","dalmatynczyk");
        System.out.println(pies.name +" "+pies.breed+" "+pies.age);
    }
}
