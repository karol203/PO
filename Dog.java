public class Dog {
    public String name;
    public int age;
    public String ownerName;
    public String Color;
    public Dog(String name, int age,String ownerName,String color)
    {
        this.name=name;
        this.age=age;
        this.ownerName=ownerName;
        this.Color=color;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
    public String toString(){
        return getName()+ " " + getAge()+ " " + getOwnerName() + " " + getColor();
    }
    @Override
    public boolean equals(Object other){
        if(!(other instanceof Dog dog)){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Dog pies1 = new Dog("Scooby Doo",10,"Kudlaty","Brazowy");

        System.out.println(pies1);
    }
}
