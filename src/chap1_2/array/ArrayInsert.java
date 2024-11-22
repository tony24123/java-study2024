package chap1_2.array;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] numbers = {10,50,90,100,150};

        int targetIndex =2;
        int newNumber = 70;

        int[] newArr = Arrays.copyOf(numbers,numbers.length+1);
        System.out.println(Arrays.toString(newArr));

        for (int i = newArr.length - 1; i > targetIndex ; i--) {
            newArr[i] = newArr[i-1];
        }
        newArr[targetIndex] = newNumber;
        numbers =newArr;
        newArr = null;
        System.out.println(Arrays.toString(numbers));
    }
}
