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

        getByFacultetName(list3E,"IT");
        getByFAciltetAndCourse(list3E,"IT",3);
        getByBirthYear(list3E,2004);
        getByGroup(list3E,"E");
    }
    public static void getByFacultetName(ArrayList<Student> list, String facultetName) {
        Student res = null;
        for (Student s : list) {
            if (s.getFacultet().equals(facultetName)) {
                res = s;
                System.out.println(res);
            }
        }
    }

    public static void getByFAciltetAndCourse(ArrayList<Student> list, String facultetName,int course) {
        Student res = null;
        for (Student s : list) {
            if (s.getFacultet().equals(facultetName)&&s.getCourse()==course) {
                res = s;
                System.out.println(res);
            }
        }
    }

    public static void getByBirthYear(ArrayList<Student> list, int year) {
        Student res = null;
        for (Student s : list) {
            String qyrqu = s.getBirthday().substring(6);
            int qyrqylganSan = Integer.parseInt(qyrqu);

            if (qyrqylganSan<= year) {
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
    String addres;
    String pNumber;
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
    public String getAddres() {
        return addres;
    }
    public void setAddres(String addres) {
        this.addres = addres;
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
        this.addres = addres;
        this.pNumber = pNumber;
        this.facultet=facultet;
        this.course=course;
        this.group = group;
    }
    public String toString() {
        String result = "\nid: " + id + "  Name: " + name + "  Sourname: " + sourname + "  Birthday: " + birthday+"  Address: "+addres+"Phone number: "+pNumber+"  Facultet: "+facultet+"  Course: "+course+"  Group: "+group;
        return result;
    }
}