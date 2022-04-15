package PersonTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeId, String jobTtile, double salary) {
        super(name, age, gender, employeeId, jobTtile, salary);
    }
public void createTicket(){
    System.out.println(getJobTitle()+" "+getName()+ "is creating ticket");
}
    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+ "is testing the app");    }
}
