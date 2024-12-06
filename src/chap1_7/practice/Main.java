package chap1_7.practice;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("홍길동", 300000);
        Manager mgr = new Manager("김철수", 500000, 100000);

        emp.work();
        System.out.println(emp.name + "님의 급여: " + emp.getSalary() + "원");
        mgr.work();
        System.out.println(mgr.name + "님의 총 보상: " + mgr.getTotalCompensation() + "원");

    }
}
