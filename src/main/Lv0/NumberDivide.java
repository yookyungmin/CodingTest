package main.Lv0;
//    두 수의 나눗셈
//        문제 설명
//        정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.


class Solution10{
    public int solution(int num1, int num2){
        int answer=0;
        double a = (double)num1/num2;
        double b = a*1000;
        return (int)b;
    }
}

public class NumberDivide {
    public static void main(String[] args){

        Solution10 s = new Solution10();

        System.out.println(s.solution(5, 8));
    }
}
