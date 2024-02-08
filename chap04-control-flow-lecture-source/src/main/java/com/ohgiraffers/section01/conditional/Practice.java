package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Practice {

    public void qaIf() {

        System.out.println("숫자 한 개를 입력하세요 : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(0 <= num && num <= 10) {
            if(num % 2 == 0) {
                System.out.println("짝수다.");
            }else if(num % 2 !=0) {
                System.out.println("홀수다.");
            }
        }
        else {
            System.out.println("1~10사이의 정수를 입력해주세요.");
        }
    }

    public void qaIf2() {
        /* 필기.
            BMI(신체질량지수)를 계산하고, 계산된 값에 따라
            저체중(20 미만)인 경우 "당신은 저체중 입니다.",
            정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
            과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
            비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요

            BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.

            계산 예시) BMI = 67 / ( 1.7 *1.7)
         * */
        System.out.println("당신의 체중/신장 을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);

        int weight = sc.nextInt();
        System.out.println("weight = " + weight);

        double tall = sc.nextDouble() / 100;
        System.out.println("tall = " + tall);

//        double tall2 = (tall / 100) ;
//        System.out.println("tall2 = " + tall2);

        double BMI = ( weight / (tall * tall) );
        System.out.println("BMI = " + BMI);

        if (BMI < 20) {
            System.out.println("당신은 저체중 입니다.");
        } else if (20 <= BMI && BMI < 25) {
            System.out.println("당신은 정상체중 입니다.");
        } else if (25 <= BMI && BMI < 30) {
            System.out.println("당신은 과체중 입니다.");
        } else if (30 < BMI) {
            System.out.println("당신은 비만 입니다.");
        }
    }
}
