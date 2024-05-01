// Base class
class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    int numOfSeats;

    Car(String brand, int year, int numOfSeats) {
        super(brand, year);
        this.numOfSeats = numOfSeats;
    }

    void displayCarInfo() {
        display();
        System.out.println("Number of seats: " + numOfSeats);
    }
}

// Another child class inheriting from Vehicle
class Bicycle extends Vehicle {
    int numOfGears;

    Bicycle(String brand, int year, int numOfGears) {
        super(brand, year);
        this.numOfGears = numOfGears;
    }

    void displayBicycleInfo() {
        display();
        System.out.println("Number of gears: " + numOfGears);
    }
}

// Another child class inheriting from Car
class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int year, int numOfSeats, int batteryCapacity) {
        super(brand, year, numOfSeats);
        this.batteryCapacity = batteryCapacity;
    }

    void displayElectricCarInfo() {
        displayCarInfo();
        System.out.println("Battery capacity: " + batteryCapacity);
    }
}

// Main class to test the inheritance
public class VehicleType {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 5);
        car.displayCarInfo();

        System.out.println();

        Bicycle bicycle = new Bicycle("Giant", 2020, 6);
        bicycle.displayBicycleInfo();

        System.out.println();

        ElectricCar electricCar = new ElectricCar("Tesla", 2023, 5, 100);
        electricCar.displayElectricCarInfo();
    }
}
