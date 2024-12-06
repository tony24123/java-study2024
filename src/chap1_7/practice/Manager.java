package chap1_7.practice;

public class Manager extends Employee{
    private double bonus;


    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void work(){
        System.out.printf(name + "님이 관리자로 팀을 관리합니다.\n");
    }

    public double getTotalCompensation() {
        return salary + bonus;
    }
}
