package animalTask;

public class Dog extends Animal {
    public String tasma;
    public void bark() {
        System.out.println(name + " : is barking");
    }

    public Dog(String name, String breed, String color, String size, int age, char gender, String tasma) {
        super(name, breed, color, size, age, gender);
        this.tasma= tasma;
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", tasma='" + tasma + '\'' +
                '}';
    }
}
