package com.ohgiraffers.section03.constant;

public class Application01 {

    public static void main(String[] args) {

        /* 목차. 1. 상수 선언 */
        final int AGE;

        /* 목차. 2. 초기화 */
        AGE = 20;

        /* 목차. 3. 필요한 위치에 상수를 호출해서 사용한다. */
        /* 목차. 3-1. 출력 구문에서의 사용 */
        System.out.println("AGE의 값은? : " + AGE);

        System.out.println("AGE의 2배는? : " + (AGE *2));

        /* 목차. 3-2 대입연산 시 활용 */
        int sum = AGE;
//        int AGE = AGE + 10;
    }

}
