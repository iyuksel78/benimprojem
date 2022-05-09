package animalTask;

public class Cat extends Animal implements Playable{


    public Cat(String name, String breed, String color, String size, int age, char gender) {
        super(name, breed, color, size, age, gender);
    }

    public void meow() {
        System.out.println(name + " : is meowing");
    }
    public void scratch() {
        System.out.println(name + " : is scratching");
    }

    @Override
    public void eat() {
        System.out.println(name+ " is eating biryani");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing with yumak");
    }

    @Override
    public void play3() {
        System.out.println("merhaba");
    }

}
