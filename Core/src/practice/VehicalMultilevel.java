package practice;
class Vehicle
{
    String brand;
    String model;
    int year;
    Vehicle(String brand,String model,int year)
    {
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    void displayInfo()
    {
        System.out.println(brand+" "+model+" "+year);
    }
}
class Car extends Vehicle
{
    int numDoors;
    Car(String brand,String model,int year,int numDoors)
    {
        super(brand,model,year);
        this.numDoors=numDoors;
    }
    void carDetails()
    {
        displayInfo();
        System.out.println("numDoors="+numDoors);
    }
}
class ElectricCar extends Car
{
    int batteryCapacity;
    ElectricCar(String brand,String model,int year,int numDoors,int batteryCapacity)
    {
        super( brand, model, year, numDoors);
        this.batteryCapacity=batteryCapacity;
    }
    void electricCarDetails()
    {
        carDetails();
        System.out.println("battery capacity="+batteryCapacity);
    }
}
public class VehicalMultilevel
{
    public static void main(String args[])
    {
        ElectricCar e=new ElectricCar("BMW","M5",2004,4,50);
        e.electricCarDetails();
    }
}