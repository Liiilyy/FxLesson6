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
            if (s.getGrade() < 70){
                System.out.println(s.getName() + " " + s.surname + " doesn't have enough grades to 70: " + s.getGrade());
            }
        }

        for (Abiturent s : list3E){
            if (s.getGrade() >= 70){
                System.out.println(s.getName() + " " + s.surname + " has more grades than 70: " + s.getGrade());
            }
        }
        Collections.sort(list3E, new SortByGrade());
        System.out.println("students with TOP 3 highest scores: ");
        for ( int i = 0; i < 3; i++){
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
    String phoneNum;
    int grade;

    public Abiturent(int id, String surname, String name, String middleName, String adress,
                     String phoneNum, int grade) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.adress = adress;
        this.phoneNum = phoneNum;
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
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String toString() {
        String result = "\nid: " + id + "  Name: " + name + "  Sourname: " + surname + "  Fatherhood: " + middleName+"  Address: "+adress+"  Phone number: "+phoneNum+"  Grade: "+grade;
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
