package PersonTask;

public class Employee extends Person{
    private int employeeId;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        setSalary(salary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        if (salary<0){
            System.err.println("invalid");
            System.exit(1);
        }
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0){
            System.err.println("invalid");
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+ " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
