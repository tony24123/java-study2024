package chap1_6.modi.pac1;

public class A {
    //필드
    public int f1;
    int f2; // default 제한자
    private int f3;

    //생성자
    public A(){
        this(10.99);
        f1 = 1;
        f2 = 2;
        f3 = 3;
        m1();
        m2();
        m3();
    }
    A(int a){}
    private A(double b){}

    //메서드
    public void m1() {}
    void m2() {}
    private void m3() {}


}
