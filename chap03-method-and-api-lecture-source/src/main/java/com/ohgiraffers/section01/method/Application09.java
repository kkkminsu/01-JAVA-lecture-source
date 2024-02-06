package com.ohgiraffers.section01.method;

public class Application09 {

    public static void main(String[] args) {

        /* 수업목표. 다른 클래스에 작성한 메소드를 호출할 수 있다. */
        /* 필기.
        *   다른클래스에 작성한 메소드 호출
        *  */
        int first = 10;
        int second = 20;
        int max = Calculator.maxNumberOf(first, second);

        System.out.println("max = " + max);
    }

}
