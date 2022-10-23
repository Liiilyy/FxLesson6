//problem 8.
//Car: id, Brand, Model, Year of issue, Color, Price, Registration number.
//Create an array of objects. Output:
//a) a list of cars of a given brand;
//b) a list of cars of a given model that have been in operation for more than n years;
//c) a list of cars of a given year of manufacture, the price of which is higher than the specified one
import java.util.ArrayList;

public class problem8 {
    public static void main(String [] args){
        ArrayList<Car> carArrayList = new ArrayList<>();
        Car car1 = new Car(1, "BMW", "e39", 1997, "black", 14000, "6458562");
        Car car2 = new Car(2, "Mercedes", "s63", 2020, "white", 30000, "784512");
        Car car3 = new Car(3, "RollsRoyse", "Phantom", 2021, "blue", 45000, "32465489");
        Car car4 = new Car(4, "Toyota", "camry 70", 2019, "white", 3600, "894651651");
        Car car5 = new Car(5, "Volkswagen", "Golf", 2002, "green", 1200, "74128963");

        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        carArrayList.add(car4);
        carArrayList.add(car5);


        for (Car s : carArrayList){
            if (s.stamp.equals("Mercedes")){
                System.out.println(s);
            }
        }

        for (Car s : carArrayList){
            if (s.stamp.equals("Mercedes") && s.yearRelease < 2022){
                System.out.println(s);
            }
        }


        for (Car s : carArrayList){
            if (s.yearRelease == 2002 && s.price > 100){
                System.out.println(s);
            }
        }
    }
}

class Car{
    int id;
    String stamp;
    String model;
    int yearRelease;
    String color;
    int price;
    String Number;

    public Car(int id, String stamp, String model, int yearRelease, String color, int price, String Number){
        this.id = id;
        this.stamp = stamp;
        this.model = model;
        this.yearRelease = yearRelease;
        this.color = color;
        this.price = price;
        this.Number = Number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String Number() {
        return Number;
    }

    public void Number(String Number) {
        this.Number = Number;
    }
    public String toString() {
        String result = "\nid: " + id + "  Stemp: " + stamp + "  Model: " + model + "  Year Release: " + yearRelease+"  Color: "+color+"  Price: "+price+"  Registration number: "+Number;
        return result;
    }
}
//id: 2  Stemp: Mercedes  Model: s63  Year Release: 2020  Color: white  Price: 30000  Registration number: 784512
//
//id: 2  Stemp: Mercedes  Model: s63  Year Release: 2020  Color: white  Price: 30000  Registration number: 784512
//
//id: 5  Stemp: Volkswagen  Model: Golf  Year Release: 2002  Color: green  Price: 1200  Registration number: 74128963