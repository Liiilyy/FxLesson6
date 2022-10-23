//проблема 7.
//Телефон: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карты, Дебетовая, Кредитная, Время городских и междугородних звонков.
//Создайте массив объектов. Выход:
//а) сведения об абонентах, время внутригородских вызовов которых превышает установленное время;
//б) сведения об абонентах, пользовавшихся междугородней связью;
//в) информация об абонентах в алфавитном порядке.
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

        Collections.sort(phoneArrayList, new SortName());
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
class SortName implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
//1 has minutes among city calls: 15
//2 has minutes among city calls: 20
//3 has minutes among city calls: 15
//4 has minutes among city calls: 7
//5 has minutes among city calls: 15
//1 has more minutes than 15 in city: 20
//2 has more minutes than 15 in city: 25
//3 has more minutes than 15 in city: 30
//5 has more minutes than 15 in city: 40
//original list:
//
//id: 1  Surname: Alina  Name: Tanatar  Middle Name: Mukhitkyzy  Adress: Almaty  Credit card number: 87079858633  Debet: 15000  Credit: 50000000  Time in city: 20  Time among cities15
//original list:
//
//id: 2  Surname: Aizhan  Name: Zhumashova  Middle Name: Kurmashevna  Adress: Taldykorgan  Credit card number: 87706783290  Debet: 27000  Credit: 1200000  Time in city: 25  Time among cities20
//original list:
//
//id: 3  Surname: Yuki  Name: Rashid  Middle Name: Kuanyshovna  Adress: Merki  Credit card number: 8709021331  Debet: 83000  Credit: 454000  Time in city: 30  Time among cities15
//original list:
//
//id: 4  Surname: Ainur  Name: Namaz  Middle Name: Namaz  Adress: Taraz  Credit card number: 87778968912  Debet: 9000  Credit: 32000  Time in city: 10  Time among cities7
//original list:
//
//id: 5  Surname: Akzhan  Name: Bembeyaz  Middle Name: Bakytkyzy  Adress: Taraz  Credit card number: 87011138000  Debet: 51400  Credit: 170000  Time in city: 40  Time among cities15
//sorted list:
//
//id: 5  Surname: Akzhan  Name: Bembeyaz  Middle Name: Bakytkyzy  Adress: Taraz  Credit card number: 87011138000  Debet: 51400  Credit: 170000  Time in city: 40  Time among cities15
//sorted list:
//
//id: 4  Surname: Ainur  Name: Namaz  Middle Name: Namaz  Adress: Taraz  Credit card number: 87778968912  Debet: 9000  Credit: 32000  Time in city: 10  Time among cities7
//sorted list:
//
//id: 3  Surname: Yuki  Name: Rashid  Middle Name: Kuanyshovna  Adress: Merki  Credit card number: 8709021331  Debet: 83000  Credit: 454000  Time in city: 30  Time among cities15
//sorted list:
//
//id: 1  Surname: Alina  Name: Tanatar  Middle Name: Mukhitkyzy  Adress: Almaty  Credit card number: 87079858633  Debet: 15000  Credit: 50000000  Time in city: 20  Time among cities15
//sorted list:
//
//id: 2  Surname: Aizhan  Name: Zhumashova  Middle Name: Kurmashevna  Adress: Taldykorgan  Credit card number: 87706783290  Debet: 27000  Credit: 1200000  Time in city: 25  Time among cities20
//
//Process finished with exit code 0
