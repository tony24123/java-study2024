package chap1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tvxq = {"영웅재중", "최강창민",
                "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 변경 전 정보: " + Arrays.toString(tvxq));

        // 1. 수정 타겟의 이름을 입력받는다.
        // 2. 해당 이름이 있는지 탐색해본다.
        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.

        String target = sc.nextLine();
        int index = -1;
        for (int i = 0; i < tvxq.length ; i++) {
            if (target.equals(tvxq[i])) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("존재하지않습니다.");
        } else {
            for (int i = index; i < tvxq.length - 1; i++) {
                tvxq[i] = tvxq[i + 1];
            }


        }
        String[] temp = new String[tvxq.length - 1];// 새배열 생성
        for (int i = 0; i < temp.length; i++) {
            temp[i] = tvxq[i];
        }
        tvxq = temp;
        temp = null;
        System.out.println(Arrays.toString(tvxq));
    }
}