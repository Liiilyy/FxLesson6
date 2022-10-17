import java.util.ArrayList;

public class problem3 {
    public static void main (String[] args) {
        Patient student1 = new Patient(1, "Alina", "Tanatar", "Mukhitkyzy", 7734204, "Almaty", "87079858633", "Bas Auru");
        Patient student2 = new Patient(2, "Aizhan", "Zhumashova", "Kurmashevna", 2572003, "Taldykorgan", "87706783290", "Tumau");
        Patient student3 = new Patient(3, "Yuki", "Rashid", "Kuanyshovna", 1632004, "Merki", "8709021331","Tuburkulez");
        Patient student4 = new Patient(4, "Ainur", "Namaz", "Namaz", 18102005, "Taraz", "87778968912","Tuburkulez");
        Patient student5 = new Patient(5, "Akzhan", "Bembeyaz", "Bakytkyzy", 2532005, "Taraz", "87011138000","Rak");


        ArrayList<Patient> list3E = new ArrayList<>();
        list3E.add(student1);
        list3E.add(student2);
        list3E.add(student3);
        list3E.add(student4);
        list3E.add(student5);

        for (Patient s : list3E){
            if(s.getAuru().equals("Rak")){
                System.out.println("Rakpen auyratyn : " + s);
            }
        }

        for (Patient s : list3E){
            if (s.getCreditNumber() > 1500000 && s.getCreditNumber() < 2500000){
                System.out.println("Qajetti karta: "+s);
            }
        }

    }
}
class  Patient{
    int id;
    String name;
    String sourname;
    String fatherhood;
    String address;
    int creditNumber;
    String phoneNumber;
    String auru;

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
        return creditNumber;
    }
    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAuru() {
        return auru;
    }
    public void setAuru(String auru) {
        this.auru = auru;
    }
    public Patient(int id,String name,String sourname ,String fatherhood,int creditNumber,String address, String phoneNumber,String auru) {
        this.id = id;
        this.name = name;
        this.sourname = sourname;
        this.fatherhood = fatherhood;
        this.address = address;
        this.creditNumber=creditNumber;
        this.phoneNumber = phoneNumber;
        this.auru = auru;
    }
    public String toString() {
        String result = "\nid: " + id + "  Name: " + name + "  Sourname: " + sourname + "  Fatherhood: " + fatherhood+"  CreditCard: "+creditNumber+"  Address: "+address+"  Phone number: "+phoneNumber+"  Auru; "+auru;
        return result;
    }
}
