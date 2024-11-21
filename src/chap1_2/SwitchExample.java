package chap1_2;

public class SwitchExample {
    public static void main(String[] args) {
        int a = 10;
        String season = "여름";
        double b = 5.5;
        String spring = "봄";
        // switch에 들어가는 변수의 타입은 정수형 또는 문자형
        switch(season) {

            //case에는 변수 지정 불가능, 상수나 리터럴만 가능
//            case spring:
            case "봄":
            case "여름":
            case "가을":
            case "겨울":
        }
    }
}
