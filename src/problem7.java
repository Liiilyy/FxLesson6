import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class problem7 {
    public static void main(String [] args){
        ArrayList<Phone> phoneArrayList = new ArrayList<>();
        Phone phone1 = new Phone(1, "Alina", "Tanatar", "Mukhitkyzy","Almaty", "87079858633",15000, 50000000, 20, 15);
        Phone phone2 = new Phone(2, "Aizhan", "Zhumashova", "Kurmashevna","Taldykorgan", "87706783290",27000, 1200000, 25, 20);
        Phone phone3 = new Phone(3, "Yuki", "Rashid", "Kuanyshovna", "Merki", "8709021331",83000, 454000, 30, 15);
        Phone phone4 = new Phone(4, "Ainur", "Namaz", "Namaz",  "Taraz", "87778968912",9000, 32000, 10, 7);
        Phone phone5 = new Phone(5, "Akzhan", "Bembeyaz", "Bakytkyzy", "Taraz", "87011138000",51400, 170000, 40, 15);


        phoneArrayList.add(phone1);
        phoneArrayList.add(phone2);
        phoneArrayList.add(phone3);
        phoneArrayList.add(phone4);
        phoneArrayList.add(phone5);

        for (Phone s : phoneArrayList){
            if (s.timeAmongCities > 0){
                System.out.println(s.getId() + " has minutes among city calls: " + s.timeAmongCities);
            }
        }

        for (Phone s : phoneArrayList){
            if (s.timeInCity > 15){
                System.out.println(s.getId() + " has more minutes than 15 in city: " + s.timeInCity);
            }
        }
        for (Phone s : phoneArrayList){
            System.out.println("original list: " + '\n' + s);
        }

        Collections.sort(phoneArrayList, new SortAtymen());
        for (Phone s : phoneArrayList){
            System.out.println("sorted list: " + '\n' + s);
        }
    }

}


class Phone{
    int id;
    String surname;
    String name;
    String middleName;
    String adress;
    String creditCardNum;
    int debet;
    int credit;
    int timeInCity;
    int timeAmongCities;

    public Phone(int id, String surname, String name,
                 String middleName, String adress, String creditCardNum, int debet, int credit, int timeInCity, int timeAmongCities){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.adress = adress;
        this.creditCardNum = creditCardNum;
        this.debet = debet;
        this.credit = credit;
        this.timeInCity = timeInCity;
        this.timeAmongCities = timeAmongCities;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(String creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public int getDebet() {
        return debet;
    }

    public void setDebet(int debet) {
        this.debet = debet;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getTimeInCity() {
        return timeInCity;
    }

    public void setTimeInCity(int timeInCity) {
        this.timeInCity = timeInCity;
    }

    public int getTimeAmongCities() {
        return timeAmongCities;
    }

    public void setTimeAmongCities(int timeAmongCities) {
        this.timeAmongCities = timeAmongCities;
    }
    public String toString() {
        String result = "\nid: " + id + "  Surname: " + surname + "  Name: " + name + "  Middle Name: " + middleName+"  Adress: "+adress+"  Credit card number: "+creditCardNum+"  Debet: "+debet+"  Credit: "+credit+"  Time in city: "+timeInCity+"  Time among cities"+timeAmongCities;
        return result;
    }
}
class SortAtymen implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
