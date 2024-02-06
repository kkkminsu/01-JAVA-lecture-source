package com.ohgiraffers.section01.method;

public class Application05 {

    public static void main(String[] args) {

        System.out.println("===== main() 메소드 시작 =====");
        Application05 app05 = new Application05();
        app05.testmethod();

        System.out.println("===== main() 메소드 시작 =====");

    }

    public void testmethod() {

        System.out.println("testmethod() 동작");

        /* 필기.
        *   return; 은 컴파일러에 의해 자동으로 추가되는 구문이다.
        *   가장 마지막에 작성해야 하고, 마지막에 작성되지 않을 경우 컴파일 에러를 발생시킨다.*/
    }
}
