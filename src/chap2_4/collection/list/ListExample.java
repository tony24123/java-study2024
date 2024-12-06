package chap2_4.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> hobbies = new ArrayList<>();
        hobbies.add("수영");
        hobbies.add("축구");
        hobbies.add("영화감상");
        hobbies.add("낮잠");

        System.out.println(hobbies);

        // 중간 삽입
        hobbies.add(1, "코딩");
        System.out.println(hobbies);

        // 데이터 수 확인
        int size = hobbies.size();
        System.out.println("size = " + size);

        // 인덱스 찾기
        int index1 = hobbies.indexOf("영화감상");
        int index2 = hobbies.indexOf("뮤지컬");
        System.out.println("index1 = " + index1);
        System.out.println("index2 = " + index2);

        // 요소 포함 여부
        boolean flag = hobbies.contains("코딩");
        System.out.println("flag = " + flag);

        // 요소 삭제
        hobbies.remove("수영");
        hobbies.remove(2);

        System.out.println(hobbies);

        // 요소 수정
        hobbies.set(0, "디자인");
        System.out.println(hobbies);

        // 요소 참조
        String hobby = hobbies.get(1);
        System.out.println("hobby = " + hobby);

        // 리스트의 순회(반복문처리)
        System.out.println("==============");

//        for (int i = 0; i < hobbies.size(); i++) {
//            System.out.println(hobbies.get(i));
//        }

        for (String s : hobbies) {
            System.out.println("s = " + s);
        }

        System.out.println("=============");
//        hobbies.forEach(System.out::println);

        // 전체 삭제
        hobbies.clear();
        System.out.println(hobbies);
        System.out.println(hobbies.isEmpty());

        // 리스트에 초기값 넣고 시작하기
        System.out.println("===========");
        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30));
        numbers.add(100);
        System.out.println(numbers);

    }
}
