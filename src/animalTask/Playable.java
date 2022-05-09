package animalTask;

public interface Playable {
    boolean isfriendly=true;
    void play();
    static void play2(){
        System.out.println("static method");
    }

    default void play3(){
        System.out.println("default");
    }


}
