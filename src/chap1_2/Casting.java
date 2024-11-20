package chap1_2;

//알트 엔터 -> 오류 원인 찾기
public class Casting {
    public static void main(String[] args) {
        //타입 캐스팅
        //타입이 다르면 연산이 불가능
        byte a =100; //1byte
        int b =a; //4byte
        System.out.println("b = " + b);

        //큰 데이터를 작은 공간에 넣을 때는 명시적으로 변환을 해야 함.
        int c = 1000; //4byte

        //1의 보수 : 비트를 반전
        // 1101000 -> 0010111
        //2의 보수 : 1을 더함
        // 0010111
        //+      1
        // 0011000 -> 24

        byte d =(byte) c; //1byte
        System.out.println("d = " + d);
        //결론 : 큰데이터를 작은 공간에 대입하면 데이터 손실 가능성이 있음

        int k = 50; //4바이트 정수
        double j = k; //8바이트 실수
        System.out.println("j = " + j);

        double m = 5.567;
        int n = (int) m;
        System.out.println("n = " + n);

        //묵시적 형변환 -> upcasting (promotion)
        //명시적 형변환 -> downcasting
        int v = 100;
        double z = 6.6;
        double result = v + z;

        //char 2바이트 int 4바이트
        int result2 = 'A' + 4;
        System.out.println(result2);

        int h = 5;
        double result3 = 27 / (double)h;
        System.out.println("result3 = " + result3);

        //int보다 작은 데이터의 연산은 모두 강제로 int로 변환됨
        byte b1 = 100;
        byte b2 =70;
        int b3 = b1 + b2;

        // char + char == int
        int i = 'A' + 'B';

    }
}
