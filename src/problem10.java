//проблема 10.
//Поезд: Пункт назначения, Номер поезда, Время отправления, Количество мест (общее, купе, плацкарт, люкс).
//Создайте массив объектов. Выход:
//а) список поездов, следующих в заданный пункт назначения;
//б) список поездов, следующих в заданный пункт назначения и отправляющихся после заданного часа;
//в) список поездов, отправляющихся в заданный пункт назначения и имеющих общие места
import java.util.ArrayList;

public class problem10 {
    public static void main(String[] args) {
        Train train1 = new Train("Almaty",2,"16:00",54);
        Train train2 = new Train("Taraz",4,"18:00",18);
        Train train3 = new Train("Shymkent",5,"16:00",98);

        ArrayList<Train> trainArrayList = new ArrayList<>();
        trainArrayList.add(train1);
        trainArrayList.add(train2);
        trainArrayList.add(train3);

        for (Train t : trainArrayList){
            if (t.destination.equals("Almaty")){
                System.out.println(t);
            }
        }

        for (Train t : trainArrayList){
            if (t.destination.equals("Almaty")){
                if (t.departure_time.equals("16:00")){
                    System.out.println(t);
                }
            }
        }

        for (Train t : trainArrayList){
            if (t.destination.equals("Shymkent")){
                if (t.number_of_places == 98){
                    System.out.println(t);
                }
            }
        }
    }
}

class Train{
    String destination;
    int number_of_train;
    String departure_time;
    int number_of_places;

    public Train(String destination, int number_of_train, String departure_time, int number_of_places) {
        this.destination = destination;
        this.number_of_train = number_of_train;
        this.departure_time = departure_time;
        this.number_of_places = number_of_places;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", number_of_train=" + number_of_train +
                ", departure_time='" + departure_time + '\'' +
                ", number_of_places=" + number_of_places +
                '}';
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber_of_train() {
        return number_of_train;
    }

    public void setNumber_of_train(int number_of_train) {
        this.number_of_train = number_of_train;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }
    public int getNumber_of_places() {
        return number_of_places;
    }

    public void setNumber_of_places(int number_of_places) {
        this.number_of_places = number_of_places;
    }
}

//Train{destination='Almaty', number_of_train=2, departure_time='16:00', number_of_places=54}
//Train{destination='Almaty', number_of_train=2, departure_time='16:00', number_of_places=54}
//Train{destination='Shymkent', number_of_train=5, departure_time='16:00', number_of_places=98}
