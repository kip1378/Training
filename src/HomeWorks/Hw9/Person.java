package HomeWorks.Hw9;

public class Person {

    private String name;
    private int age;
    private char gender;


    public String nameWithoutPrefix (){
        return name;
    }

    public String getName(){
        if (gender == 'M') {
            return "Mr. " + name;
        } else if  (gender == 'F'){
        return "Mrs. " + name;
        } else {
            return name;
        }
    }
    public Person (String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender =gender;
    }

    public int getAge (){
        return age;
    }


    public char getGender() {
        return gender;
    }


}


