package animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog("max", "husky", "red", "M", 12, 'F', "var");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        System.out.println(dog);
        System.out.println();

        Dog dog1 = new Dog("max", "husky", "red", "M", 12, 'F', "var");
        dog1.name = "berci";
        System.out.println("dog1 = " + dog1);


        Cat cat = new Cat("ser", "mama", "beyaz", "büyük", 10, 'M');

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.scratch();
        cat.meow();
        System.out.println("cat = " + cat);
        System.out.println();

        Tiger tiger = new Tiger("tigerr", "tarma", "siyah", "büyük", 40, 'F');

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.roar();
        System.out.println("tiger = " + tiger);

        System.out.println(cat.name + " " + dog.breed + " " + tiger.size);
        dog.bark();
    }
}
