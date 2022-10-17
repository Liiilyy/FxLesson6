import java.util.ArrayList;

public class problem6 {
    public static void main(String [] args){
        ArrayList<House> houseArrayList = new ArrayList<>();
        House house1 = new House(1, 15, 10, 5, 2, "Beverly", "kirpish", 50);
        House house2 = new House(2, 20, 50, 2,  9, "takhom", "agash", 50);
        House house3 = new House(3, 18, 68, 3,  6, "Junisaliev", "tas", 50);
        House house4 = new House(4, 154, 87, 3,  2, "pushkin", "tas", 50);
        House house5 = new House(5, 205, 89, 4, 7, "mambetbatyr", "kirpish", 50);

        houseArrayList.add(house1);
        houseArrayList.add(house2);
        houseArrayList.add(house3);
        houseArrayList.add(house4);
        houseArrayList.add(house5);
        for (House s : houseArrayList){
            if (s.getRoomsQuantity() == 2){
                System.out.println(s.number + " " + s.getRoomsQuantity() + " rooms");
            }
        }
        for (House s : houseArrayList){
            if (s.getRoomsQuantity() == 2){
                if (s.getFloor() > 1 && s.getFloor() < 5){
                    System.out.println(s);
                }
            }
        }
        for (House s : houseArrayList){
            if (s.area > 60){
                System.out.println(s.number + " area: " + s.area);
            }
        }
    }
}
class House{
    int id;
    int number;
    int area;
    int floor;
    int quantityOfRooms;
    String street;
    String typeOfBuilding;
    int serviceLife;

    public House (int id, int number, int area, int floor, int quantityOfRooms, String street, String typeOfBuilding, int serviceLife){
        this.id = id;
        this.number = number;
        this.area = area;
        this.floor = floor;
        this.quantityOfRooms = quantityOfRooms;
        this.street = street;
        this.typeOfBuilding = typeOfBuilding;
        this.serviceLife = serviceLife;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomsQuantity() {
        return quantityOfRooms;
    }

    public void setRoomsQuantity(int quantityOfRooms) {
        this.quantityOfRooms = quantityOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

    public void setTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }

    public int getServiceLife() {
        return serviceLife;
    }

    public void setServiceLife(int serviceLife) {
        this.serviceLife = serviceLife;
    }
    public String toString() {
        String result = "\nid: " + id + "  Number: " + number + "  Area: " + area + "  Floor: " + floor+"  Quantity Of Rooms: "+quantityOfRooms+"  Street: "+street+"  Type Of Building: "+typeOfBuilding+"  Service Life: "+serviceLife;
        return result;
    }
}