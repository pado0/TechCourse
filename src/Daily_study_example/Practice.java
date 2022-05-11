package Daily_study_example;
import Daily_algo.*;


public class Practice {
    public static void main(String[] args) {

        System.out.println("programmer----");
        Person programmer = new Programmer();
        programmer.learn();

        System.out.println("student----");
        Person student = new Student();
        student.name = "효진";
        student.learn();

        System.out.println(student instanceof Person);

    }

}
class Person{
    String name;

    Person(int x){
        System.out.println("펄슨 생성자");
    }
    void learn(){
        System.out.println("공부");
    }
}

class Programmer extends Person{
    String companyName;

    Programmer(){
        super(10);
        //super(); // Person 클래스 생성자 호출
    }
    @Override
    void learn() {
        super.learn(); // 부모클래스의 learn 호출.
    }
}

class Student extends Person{
    Student() {
        super(10);
    }

    @Override
    void learn() {
        System.out.println(super.name);
        System.out.println("수능 공부");
    }
}