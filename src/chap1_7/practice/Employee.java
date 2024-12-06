package chap1_7.practice;

public class Employee {
    public String name;
    public double salary;

    //생성자
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.printf(name + "직원이 일합니다.\n");
    }

    public double getSalary() {
        return salary;
    }
}
