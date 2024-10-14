package HomeWorks.Hw6;

public class HomeWork6 {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Виталя";
    person1.age = 27;

    Person person2 = new Person();
    person2.name = "Pafnutiy";
    person2.age = 98;
        person2.sayHello();
        person1.speak();

    }
}
class Person {
    String name;
    int age;

    void speak(){
        for (int i = 0; i < 1; i++){
        System.out.println("Меня зовут " +name+ " и мне " +age+ " лет!");
    }

}
void sayHello(){
    System.out.println("Hello brados!");
    }
}
