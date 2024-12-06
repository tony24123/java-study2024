package chap1_7.super_;

public class Child extends Parent {

    public boolean c;

    public Child() {
        System.out.println("Child의 첫번째 생성자 호출!");
    }
    public void subMethod() {
        System.out.println("child a = " + this.a);
        System.out.println("child b = " + this.b);
        System.out.println("child c = " + this.c);
    }
}