//Проблема2
//Клиент: идентификатор, фамилия, имя, отчество, адрес, номер кредитной карты, номер банковского счета.
//Создайте массив объектов. Выход:
//а) список покупателей в алфавитном порядке;
//б) список клиентов, номер кредитной карты которых находится в заданном диапазоне.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class problem2 {
    public static void main (String[] args) {
        Buyers student1 = new Buyers(1, "Alina", "Tanatar", "Mukhitkyzy", 7734204, "Almaty", "87079858633");
        Buyers student2 = new Buyers(2, "Aizhan", "Zhumashova", "Kurmashevna", 2572003, "Taldykorgan", "87706783290");
        Buyers student3 = new Buyers(3, "Yuki", "Rashid", "Kuanyshovna", 1632004, "Merki", "8709021331");
        Buyers student4 = new Buyers(4, "Ainur", "Namaz", "Namaz", 18102005, "Taraz", "87778968912");
        Buyers student5 = new Buyers(5, "Akzhan", "Bembeyaz", "Bakytkyzy", 2532005, "Taraz", "87011138000");

        ArrayList<Buyers> list3E = new ArrayList<>();
        list3E.add(student1);
        list3E.add(student2);
        list3E.add(student3);
        list3E.add(student4);
        list3E.add(student5);

        Collections.sort(list3E, new SortByName());
        for (Buyers s : list3E){
            System.out.println(s);
        }
        for (Buyers s : list3E){
            if (s.getCreditNumber() > 1500000 && s.getCreditNumber() < 2500000){
                System.out.println(s.getName() + " " + s.getSourname() + " " + s.getSourname());
            }
        }

    }
}
class  Buyers{
    int id;
    String name;
    String sourname;
    String fatherhood;
    String adress;
    int creditNum;
    String phone;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSourname() {
        return sourname;
    }
    public void setSourname(String sourname) {
        this.sourname = sourname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFatherhood(String fatherhood) {
        this.fatherhood = fatherhood;
    }
    public int getCreditNumber() {
        return creditNum;
    }
    public void setCreditNum(int creditNum) {
        this.creditNum = creditNum;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Buyers(int id,String name,String sourname ,String fatherhood,int creditNum,String address, String phone) {
        this.id = id;
        this.name = name;
        this.sourname = sourname;
        this.fatherhood = fatherhood;
        this.adress = address;
        this.creditNum=creditNum;
        this.phone = phone;
    }
    public String toString() {
        String result = "\nid: " + id + "  Name: " + name + "  Sourname: " + sourname + "  Fatherhood: " + fatherhood+"  CreditCard: "+creditNum+"  Address: "+adress+"  Phone number: "+phone;
        return result;
    }
}
class SortByName implements Comparator<Buyers> {
    @Override
    public int compare(Buyers name1, Buyers name2) {
        return name1.getName().compareTo(name2.getName());
    }
}
//id: 4  Name: Ainur  Sourname: Namaz  Fatherhood: Namaz  CreditCard: 18102005  Address: Taraz  Phone number: 87778968912
//
//id: 2  Name: Aizhan  Sourname: Zhumashova  Fatherhood: Kurmashevna  CreditCard: 2572003  Address: Taldykorgan  Phone number: 87706783290
//
//id: 5  Name: Akzhan  Sourname: Bembeyaz  Fatherhood: Bakytkyzy  CreditCard: 2532005  Address: Taraz  Phone number: 87011138000
//
//id: 1  Name: Alina  Sourname: Tanatar  Fatherhood: Mukhitkyzy  CreditCard: 7734204  Address: Almaty  Phone number: 87079858633
//
//id: 3  Name: Yuki  Sourname: Rashid  Fatherhood: Kuanyshovna  CreditCard: 1632004  Address: Merki  Phone number: 8709021331
//Yuki Rashid Rashid
//
//Process finished with exit code 0