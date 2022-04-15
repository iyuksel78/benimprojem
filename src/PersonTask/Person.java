package PersonTask;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()|| name.isBlank()){
            System.err.println("invalid");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <15 ||age >70){
            System.err.println("not eligible");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public void eat(){
        System.out.println(name+ " is eating");
    }
    public void drink(){
        System.out.println(name+ " is drinking");
    }
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}
