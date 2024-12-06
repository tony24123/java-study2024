package chap1_3.arrayList;

public class ListMain {
    public static void main(String[] args) {
        //문자열 데이터를 배열로 모아서 보관
        StringList students = new StringList();
        students.push("김또또");
        students.push("박삐삐");
        students.printArray();
    }
}
