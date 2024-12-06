package chap1_3;

import java.util.Arrays;

// 클래스: 객체를 만들기 위한 설계도
public class Dancer {

    // 객체는 속성과 기능으로 이루어져 있음

    // 속성: 객체를 명사적으로 표현
    // 필드(field)
    /*
        {
            dancerName: 'kim',
            crewName: 'street man',
            genres: ['kpop', 'choreo', 'wacking'],
            danceLevel: 1,
            stretching: () => {}
        }
     */
    String dancerName; // 댄서명
    String crewName; // 크루명
    String[] genres; // 장르 목록
    int danceLevel; // 0: 초보, 1: 아마추어, 2: 프로

    // 객체의 기능 - 객체를 동사적으로 표현
    // method
    // 설계도에 있는 함수는 static을 붙이지 않는다.

    // 춤추는 기능
    void dance() {
        System.out.printf("%s 댄서가 %s춤을 춥니다.\n", dancerName, genres[0]);
    }
    // 자기소개 기능
    void introduce() {
        System.out.println("이름: " + dancerName);
        System.out.println("팀명: " + crewName);
        System.out.println("장르: " + Arrays.toString(genres));
        System.out.println("레벨: " + danceLevel);
    }

    // 생성자 (constructor)
    // 객체가 생성될 때 호출되는 특별한 함수
    // - 생성자 규칙
    // 1. 생성자의 이름은 반드시 클래스명과 같아야 함.
    // 2. 생성자는 무조건 void 리턴 - 따라서 void를 안적어도됨

    Dancer() {
        // 객체 생성시 필드를 초기화
        dancerName = "춤꾼";
        crewName = "시골 춤쟁이들";
        genres = new String[] {"kpop"};
        danceLevel = 0;
    }

    //오버로딩 (overloading): 메서드를 같은 이름으로 여러개 생성
    // 규칙: 이름은 같지만 파라미터의 타입이나 개수가 달라야 함
    Dancer(String dName) {
        dancerName = dName;
        crewName = "도시 춤쟁이들";
        genres = new String[] {"urban"};
        danceLevel = 0;
    }
}
