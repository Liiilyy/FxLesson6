//Проблема1
//Студент: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
//Создайте массив объектов. Выход:
//а) список студентов данного факультета;
//б) списки обучающихся по каждому факультету и курсу;
//в) список учащихся, родившихся после данного года обучения;
//г) список учебной группы.

import java.util.ArrayList;
public class problem1 {
    public static void main (String[] args) {
        Student student4 = new Student(1 ,"Alina","Tanatar", "08.12.2004" , "Almaty" , "87079858633","IT",3,"E");
        Student student1 = new Student(2 ,"Aizhan","Zhumashova", "05.04.2005" , "Taldykorgan" , "87706783290","IT",3,"E");
        Student student2 = new Student(3 ,"Yuki","Rashid", "06.08.2005" , "Merki" , "8709021331","IT",3,"E");
        Student student3 = new Student(4 ,"Ainur","Namaz", "02.09.2004" , "Taraz" , "87778968912","Math",3,"G");
        Student student5 = new Student(5 ,"Akzhan","Bembeyaz", "16.10.2003" , "Taraz" , "87011138000","Economic",4,"A");

        ArrayList<Student> list3E = new ArrayList<>();
        list3E.add(student1);
        list3E.add(student2);
        list3E.add(student3);
        list3E.add(student4);
        list3E.add(student5);

        getByFacultet(list3E,"IT");
        getByFacultetAndCourse(list3E,"IT",3);
        getByBirthYear(list3E,2004);
        getByGroup(list3E,"E");
    }
    public static void getByFacultet(ArrayList<Student> list, String facultet) {
        Student res = null;
        for (Student s : list) {
            if (s.getFacultet().equals(facultet)) {
                res = s;
                System.out.println(res);
            }
        }
    }

    public static void getByFacultetAndCourse(ArrayList<Student> list, String facultet,int course) {
        Student res = null;
        for (Student s : list) {
            if (s.getFacultet().equals(facultet)&&s.getCourse()==course) {
                res = s;
                System.out.println(res);
            }
        }
    }

    public static void getByBirthYear(ArrayList<Student> list, int year) {
        Student res = null;
        for (Student s : list) {
            String created = s.getBirthday().substring(6);
            int gn = Integer.parseInt(created);

            if (gn<= year) {
                res = s;
                System.out.println(res);
            }
        }
    }
    public static void getByGroup(ArrayList<Student> list, String group) {
        Student res = null;
        for (Student s : list) {
            if (s.getFacultet().equals(group)) {
                res = s;
                System.out.println(res);
            }
        }
    }
}
class Student {
    int id;
    String name;
    String sourname;
    String birthday;
    String adress;
    String phone;
    String facultet;
    int course;
    String group;

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
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getFacultet() {
        return facultet;
    }
    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public Student(int id,String name,String sourname,String birthday ,String addres, String pNumber,String facultet,int course, String group) {
        this.id = id;
        this.name = name;
        this.sourname = sourname;
        this.birthday = birthday;
        this.adress = addres;
        this.phone = pNumber;
        this.facultet=facultet;
        this.course=course;
        this.group = group;
    }
    public String toString() {
        String result = "\nid: " + id + "  Name: " + name + "  Sourname: " + sourname + "  Birthday: " + birthday+"  Address: "+adress+"Phone number: "+phone+"  Facultet: "+facultet+"  Course: "+course+"  Group: "+group;
        return result;
    }
}
//id: 2  Name: Aizhan  Sourname: Zhumashova  Birthday: 05.04.2005  Address: TaldykorganPhone number: 87706783290  Facultet: IT  Course: 3  Group: E
//
//id: 3  Name: Yuki  Sourname: Rashid  Birthday: 06.08.2005  Address: MerkiPhone number: 8709021331  Facultet: IT  Course: 3  Group: E
//
//id: 1  Name: Alina  Sourname: Tanatar  Birthday: 08.12.2004  Address: AlmatyPhone number: 87079858633  Facultet: IT  Course: 3  Group: E
//
//id: 2  Name: Aizhan  Sourname: Zhumashova  Birthday: 05.04.2005  Address: TaldykorganPhone number: 87706783290  Facultet: IT  Course: 3  Group: E
//
//id: 3  Name: Yuki  Sourname: Rashid  Birthday: 06.08.2005  Address: MerkiPhone number: 8709021331  Facultet: IT  Course: 3  Group: E
//
//id: 1  Name: Alina  Sourname: Tanatar  Birthday: 08.12.2004  Address: AlmatyPhone number: 87079858633  Facultet: IT  Course: 3  Group: E
//
//id: 4  Name: Ainur  Sourname: Namaz  Birthday: 02.09.2004  Address: TarazPhone number: 87778968912  Facultet: Math  Course: 3  Group: G
//
//id: 1  Name: Alina  Sourname: Tanatar  Birthday: 08.12.2004  Address: AlmatyPhone number: 87079858633  Facultet: IT  Course: 3  Group: E
//
//id: 5  Name: Akzhan  Sourname: Bembeyaz  Birthday: 16.10.2003  Address: TarazPhone number: 87011138000  Facultet: Economic  Course: 4  Group: A
