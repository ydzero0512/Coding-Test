package BAEKJOON.INFLEARN;

import java.util.*;

class Main {
        public String solution(String str){
           // contains로 문자가 포함되는지 ?
           char[] arr = str.toCharArray();
           String answer = "";
           for(char x : arr){
            if(!answer.contains(Character.toString(x))){
                answer += x;
            }
           };
           return answer;
        }
        public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

}