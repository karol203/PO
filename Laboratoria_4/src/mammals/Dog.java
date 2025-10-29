package mammals;

import animals.Animal;

public class Dog extends Animal {
    public Dog(){
        super("Pies",10);
        this.species=species;
        //this.age=age;
    }

    public static void main(String[] args) {
        Dog pies = new Dog();
        System.out.println(pies.species);
    }
}
