package chap1_6;

public class Main {
    public static void main(String[] args) {
        MyCar myCar = new MyCar();

        myCar.pressStartButton();


        //변속 수행
        myCar.setMode("D");
        System.out.println("현재모드: " + myCar.getMode());
    }
}
