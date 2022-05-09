package AAA;

class A {
    private String username= "bug";
    private String pass= "bgrt";

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public A() {
        System.out.println("A");
    }

}

//================================================================================0000
class B extends A {
    public B() {
        System.out.println("B");
    }
}

//================================================================================0000
class Test {

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.getUsername());
        System.out.println(obj.getPass());
    }


}
//================================================================================0000