package chap1_2;

public class DataType {
    //    메인 메서드 : 프로그램의 실행 기점
    public static void main(String[] args) {
//        자바는 변수가 선언된 중괄호(블록)에서 생성되고 블록이 끝나는 부분에서 소멸한다.
//        컨트롤 알트 v
        int age = 20;
        double pi = 3.14;
        char c = '가';
        String greeting = "안뇽?";
        boolean flag = true;
        System.out.println(123);

        //정수 타입(byte:1바이트, short:2바이트, int:4바이트, long:8바이트)
        byte x1 = 127;
//       줄바꿈: 컨트롤 d
        short x2 = 32767;
        int x3 = 2147483647;

        //정수 리터얼의 기본타입 int
        long x4 = 214748364812313123L;
        System.out.println(x4);

        //실수타입
        float f1 = 3.14F; //4바이트
        double f2 = 3.14; //8바이트
        System.out.println("f2 = " + f2);
        System.out.println("f1 = " + f1);

        //논리 타입
        boolean b1 = true;
        boolean b2 = false;
        boolean b4 = (10 + 3 == 13) && (9 * 1 == 9);

        //문자와 문자열 타입
        char c1 = 'A'; // 2바이트
        char c2 = 67;
        System.out.println("c2 = " + c2);

        char[] cArr = {'h', 'e', 'l', 'l', 'o'};
        String str = new String(cArr);
        System.out.println("str = " + str);

        String str2 = "안녕하세요";
        System.out.println("str2 = " + str2);

        //자바17부터 지원
        String str3 = """
                안녕
                ㄴㅇㅁㄴㅇㄴ
                ㅇㅁㄴㅇㄴㅁ
                """;

        //동적 타이핑
        var z = 100; //타입 추론
        var h = "dsasda";
    }
}
