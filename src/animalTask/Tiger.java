package animalTask;

public class Tiger extends Animal {


    public Tiger(String name, String breed, String color, String size, int age, char gender) {
        super(name, breed, color, size, age, gender);
    }

    public void roar() {
        System.out.println(name + " : is roaring");
    }
}
