package homeworkthree;

public class Employee {

    private String name;
    private double salary;
    protected String nickName;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    private String employee() {
        return "Employee{" +
                "name=" + name +
                ", salary=" + salary +
                '}';
    }

    public String printName(){
        return "The employees name is " + name;
    }

}
