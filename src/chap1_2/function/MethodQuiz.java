package chap1_2.function;

import java.util.Arrays;

public class MethodQuiz {
    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userNames = {"홍길동", "박영희"};

    public static void main(String[] args) {
        printFoods();
        push("라면");
        push("김치찌개");
        int index =  indexof("파스타");
        System.out.println("index = " + index);
        int index2 = indexof("라면땅");
        System.out.println("index2 = " + index2);
        pop();
//        System.out.println(Arrays.toString(foods));
        remove("치킨");
        System.out.println(Arrays.toString(foods));
        boolean flag1 = include("떡볶이");
        System.out.println("flag1 = " + flag1);
    }

    static boolean include(String foodName) {
        boolean flag = false;
        for (int i = 0; i < foods.length-1 ; i++) {
            if(foods[i].equals(foodName)){
                flag = true;
            }
        }
        return flag;
    }


    static String[] remove(String foodName) {
        int newIndex = indexof(foodName);
        for (int i = newIndex; i <foods.length-1 ; i++) {
            foods[i] = foods[i+1];
        }
        String[] temp = new String[foods.length-1];
        for (int i = 0; i < foods.length-1 ; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
        temp = null;
        return foods;
    }

    static String[] pop() {
        String[] temp = new String[foods.length-1];
        for (int i = 0; i < foods.length - 1; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
        temp = null;
        return foods;
    }

    static int indexof(String foodName) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if(foods[i].equals(foodName)){
                index = i;
                break;
            }
        }
        return index;
    }

    static void printFoods() {

        System.out.println(Arrays.toString(foods));

    }

    static void push(String newFood) {
        String[] temp = new String[foods.length+1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length-1] = newFood;
        foods = temp;
        temp = null;
        System.out.println(Arrays.toString(foods));//        System.out.println(Arrays.toString(foods));
    }










//        push("라면");
//        push("김치찌개");
//        printFoods();
//
//        int index = indexOf("파스타");
//        System.out.println("index = " + index);
//
//        int index2 = indexOf("라면땅");
//        System.out.println("index2 = " + index2);
//
//        pop();
//        remove("치킨");
//        printFoods();
//
//
//        boolean flag1 = include("파스타");
//        System.out.println("flag1 = " + flag1);
//
//        boolean flag2 = include("떡라면");
//        System.out.println("flag2 = " + flag2);
//
//        insert(3, "파인애플");
//
//        printFoods();
//
//        modify(2, "닭갈비");
//        printFoods();
}

