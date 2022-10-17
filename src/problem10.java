import java.util.ArrayList;

public class problem10 {
    public static void main(String[] args) {
        Train train1 = new Train("Almaty",2,"16:00","Obshie",54);
        Train train2 = new Train("Taraz",4,"18:00","Plascart",18);
        Train train3 = new Train("Shymkent",5,"16:00","Kupe",98);
        Train train4 = new Train("Kostanai",1,"16:00","Luyks",100);
        Train train5 = new Train("Kokshetau",3,"18:00","Plascart",14);
        Train train6 = new Train("Almaty",1,"18:00","Obshie",48);
        ArrayList<Train> trainArrayList = new ArrayList<>();
        trainArrayList.add(train1);
        trainArrayList.add(train2);
        trainArrayList.add(train3);
        trainArrayList.add(train4);
        trainArrayList.add(train5);
        trainArrayList.add(train6);

//        String destination_needed = "Almaty";
//        ArrayList<Train> needed = new ArrayList<>();
//        for(Train s:trainArrayList){
//            if(s.getDestination()==destination_needed){needed.add(s);}
//        }
//        System.out.println(needed);


//        String destination_needed = "Almaty";
//        String time_needed = "18:00";
//        ArrayList<Train> needed = new ArrayList<>();
//        for(Train s:trainArrayList){
//            if(s.getDestination()==destination_needed && s.getDeparture_time()==time_needed){needed.add(s);}
//        }
//        System.out.println(needed);
        
//        String destination_needed = "Almaty";
//        String needed_places = "Obshie";
//        ArrayList<Train> needed = new ArrayList<>();
//        for(Train s:trainArrayList){
//            if(s.getDestination()==destination_needed && s.getType_of_places()==needed_places){needed.add(s);}
//        }
//        System.out.println(needed);
    }
}

class Train{
    String destination;
    int number_of_train;
    String departure_time;
    String type_of_places;
    int number_of_places;

    public Train(String destination, int number_of_train, String departure_time, String type_of_places, int number_of_places) {
        this.destination = destination;
        this.number_of_train = number_of_train;
        this.departure_time = departure_time;
        this.type_of_places = type_of_places;
        this.number_of_places = number_of_places;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", number_of_train=" + number_of_train +
                ", departure_time='" + departure_time + '\'' +
                ", type_of_places='" + type_of_places + '\'' +
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

    public String getType_of_places() {
        return type_of_places;
    }

    public void setType_of_places(String type_of_places) {
        this.type_of_places = type_of_places;
    }

    public int getNumber_of_places() {
        return number_of_places;
    }

    public void setNumber_of_places(int number_of_places) {
        this.number_of_places = number_of_places;
    }
}


