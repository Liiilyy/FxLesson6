//проблема 3.
//Пациент: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
//Создайте массив объектов. Выход:
//а) список больных с данным диагнозом;
//б) список больных, номер медицинской карты которых находится в заданном интервале.
import java.util.ArrayList;

public class problem3 {
    public static void main (String[] args) {
        Patient student1 = new Patient(1, "Alina", "Tanatar", "Mukhitkyzy", 7734204, "Almaty", "87079858633", "headache");
        Patient student2 = new Patient(2, "Aizhan", "Zhumashova", "Kurmashevna", 2572003, "Taldykorgan", "87706783290", "bronchitis");
        Patient student3 = new Patient(3, "Yuki", "Rashid", "Kuanyshovna", 1632004, "Merki", "8709021331","schizophrenia");
        Patient student4 = new Patient(4, "Ainur", "Namaz", "Namaz", 18102005, "Taraz", "87778968912","depression");
        Patient student5 = new Patient(5, "Akzhan", "Bembeyaz", "Bakytkyzy", 2532005, "Taraz", "87011138000","common cold");


        ArrayList<Patient> list3E = new ArrayList<>();
        list3E.add(student1);
        list3E.add(student2);
        list3E.add(student3);
        list3E.add(student4);
        list3E.add(student5);

        for (Patient s : list3E){
            if(s.getDisease().equals("depression")){
                System.out.println("depressed student : " + s);
            }
        }

        for (Patient s : list3E){
            if (s.getCreditNum() > 1500000 && s.getCreditNum() < 2500000){
                System.out.println("Desired credit: "+s);
            }
        }

    }
}
class  Patient{
    int id;
    String name;
    String sourname;
    String fatherhood;
    String adress;
    int creditNum;
    String phone;
    String disease;

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
    public int getCreditNum() {
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
    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public Patient(int id,String name,String sourname ,String fatherhood,int creditNum,String adress, String phone,String disease) {
        this.id = id;
        this.name = name;
        this.sourname = sourname;
        this.fatherhood = fatherhood;
        this.adress = adress;
        this.creditNum = creditNum;
        this.phone = phone;
        this.disease = disease;
    }
    public String toString() {
        String result = "\nid: " + id + "  Name: " + name + "  Sourname: " + sourname + "  Fatherhood: " + fatherhood+"  CreditCard: "+creditNum+"  Adress: "+adress+"  Phone number: "+phone+"  Disease; "+disease;
        return result;
    }
}
//depressed student :
//id: 4  Name: Ainur  Sourname: Namaz  Fatherhood: Namaz  CreditCard: 18102005  Adress: Taraz  Phone number: 87778968912  Disease; depression
//Desired credit:
//id: 3  Name: Yuki  Sourname: Rashid  Fatherhood: Kuanyshovna  CreditCard: 1632004  Adress: Merki  Phone number: 8709021331  Disease; schizophrenia
