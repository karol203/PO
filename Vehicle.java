import java.util.Objects;

public class Vehicle {
    String brand;
    String model;
    int yearOfProduction;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Vehicle(String brand, String model, int yearOfProduction) {
        if (yearOfProduction > 2025) {
            this.yearOfProduction = 2025;
        }
        this.yearOfProduction = yearOfProduction;
        if (brand == null) {
            this.brand = "";
        }
        if (model == null) {
            this.model = "";
        }
        this.brand = brand;
        this.model = model;

    }

    @Override
    public String toString() {
        return "Vehicle: " + getBrand() + " " + getModel()+", Year: " + getYearOfProduction() + ".";
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Vehicle vehicle)) {
            return false;
        }
        return vehicle.getBrand().equals(this.getBrand()) && vehicle.getModel().equals(this.getModel()) && vehicle.getYearOfProduction() == this.getYearOfProduction();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getBrand(),getModel(),getYearOfProduction());
    }

    public static void main(String[] args) {
        Vehicle pojazd1= new Vehicle("Volkswagen","Passat",2004);
        Vehicle pojazd2= new Vehicle("Volkswagen","Passat",2004);
        System.out.println(pojazd1);
        System.out.println(pojazd2.equals(pojazd1));
        System.out.println(pojazd1.hashCode());
        System.out.println(pojazd2.hashCode());
    }
}