package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Prcatice {

    /* 1부터 10까지의 숫자를 출력하는 프로그램 */

    public void test1() {
        for (int i = 1; i <= 10; i++ ) {
            System.out.println("i = " + i);
        }
    }

    /* 10부터 1까지의 숫자를 역순으로 출력하는 프로그램 */
    public void test2() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("i = " + i);
        }
    }

    /* 구구단 7단을 출력하는 프로그램 */

    public void test3() {
        int i = 7;
            for (int j = 1; j < 10; j++) {
                System.out.println(i * j);
            }
    }

    /* 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램 */

    public void test4() {
        for (int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println("i = " + i);
            }
        }
    }

    /* 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램
     *   팩토리얼은 6! = 1 * 2 * 3 * 4 * 5 * 6
     * */

    public void test5() {
        System.out.println("팩토리얼을 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 1;

        for (int i = 1; i <= num; i++) {

            sum *= i;

        }
            System.out.println("팩토리얼은 " + num + "!" + " = " + sum);

    }

    public void test6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("팩토리얼을 구하고 싶은 숫자를 입력해주세요:");
        int num = sc.nextInt();
        int result = 1;
        String output = num + "! = ";

        for (int i = 1; i <= num; i++) {
            result *= i;
            if (i == num) {
                output += i;
            } else {
                output += i + " * ";
            }
        }

        output += " = " + result;
        System.out.println(output);
    }


}
