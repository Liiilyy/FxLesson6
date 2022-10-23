//проблема 4.
//Абитуриент: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
//Создайте массив объектов. Выход:
//а) список поступающих с неудовлетворительными оценками;
//б) список абитуриентов, у которых баллы выше указанного;
//c) выбрать заданное количество n претендентов с наибольшим общим баллом (также вывести полный список претендентов с полупроходной суммой).

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class problem4 {
    public static void main(String [] args){
        ArrayList<Abiturent> list3E = new ArrayList<>();
        Abiturent student1 = new Abiturent(1, "Alina", "Tanatar", "Mukhitkyzy","Almaty", "87079858633", 100);
        Abiturent student2 = new Abiturent(2, "Aizhan", "Zhumashova", "Kurmashevna","Taldykorgan", "87706783290", 75);
        Abiturent student3 = new Abiturent(3, "Yuki", "Rashid", "Kuanyshovna", "Merki", "8709021331",59);
        Abiturent student4 = new Abiturent(4, "Ainur", "Namaz", "Namaz",  "Taraz", "87778968912",83);
        Abiturent student5 = new Abiturent(5, "Akzhan", "Bembeyaz", "Bakytkyzy", "Taraz", "87011138000",67);



        list3E.add(student1);
        list3E.add(student2);
        list3E.add(student3);
        list3E.add(student4);
        list3E.add(student5);

        for (Abiturent s : list3E){
            if (s.getGrade() < 60){
                System.out.println(s.getName() + " " + s.surname + " 60ka jetpeidi: " + s.getGrade());
            }
        }

        for (Abiturent s : list3E){
            if (s.getGrade() >= 60){
                System.out.println(s.getName() + " " + s.surname + " 60tan asady: " + s.getGrade());
            }
        }
        Collections.sort(list3E, new SortByGrade());
        System.out.println("top2: ");
        for ( int i = 0; i < 2; i++){
            System.out.println(list3E.get(i));
        }
    }
}

//task4 - Abiturent
class Abiturent{
    int id;
    String surname;
    String name;
    String middleName;
    String adress;
    String phone;
    int grade;

    public Abiturent(int id, String surname, String name, String middleName, String adress,
                     String phoneNum, int grade) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.adress = adress;
        this.phone = phone;
        this.grade = grade;
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

    public String getPhoneNum() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String toString() {
        String result = "\nid: " + id + "  Name: " + name + "  Sourname: " + surname + "  Fatherhood: " + middleName+"  Address: "+adress+"  Phone number: "+phone+"  Grade: "+grade;
        return result;
    }
}
class SortByGrade implements Comparator<Abiturent> {
    @Override
    public int compare(Abiturent name1, Abiturent name2) {
        if (name1.getGrade() == name2.getGrade())
            return 0;
        if (name1.getGrade() > name2.getGrade())
            return -1;
        else
            return 1;
    }
}
//Rashid Yuki 60ka jetpeidi: 59
//Tanatar Alina 60tan asady: 100
//Zhumashova Aizhan 60tan asady: 75
//Namaz Ainur 60tan asady: 83
//Bembeyaz Akzhan 60tan asady: 67
//top2:
//
//id: 1  Name: Tanatar  Sourname: Alina  Fatherhood: Mukhitkyzy  Address: Almaty  Phone number: null  Grade: 100
//
//id: 4  Name: Namaz  Sourname: Ainur  Fatherhood: Namaz  Address: Taraz  Phone number: null  Grade: 83
