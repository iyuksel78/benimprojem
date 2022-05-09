package animalTask;

public final class Dog extends Animal implements Playable{
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

    @Override
    public void eat() {
        System.out.println(name+ " is eating pizza");;
    }

    @Override
    public void play() {
        System.out.println(name+ " is playing with ball");
    }


}
