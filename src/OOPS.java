public class OOPS {
    public static void main(String[] args) {
        Student s2 = new Student();
        s2.name = "Lavish";
        s2.school = "Pragra";
        s2.age = 24;
        s2.ID = 001;

        Student s4 = new Student(s2);
        System.out.println(s4.toString());


    }

}
class Student{
    String name;
    int age;
    String school;
    int ID;

    Student(){

    }
    Student(String name, int age, String school, int ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.school = school;

    }
    Student(Student s1){
        this.name = s1.name;
        this.age = s1.age;
        this.ID = s1.ID;
        this.school = s1.school;

    }
    public String toString(){
        return name + "\n"+
                age + "\n"+
                ID + "\n"+
                school;
    }
}
