package BAEKJOON.INFLEARN;
import java.util.*;

class Main {
        public String solution(String str){
            String answer = "";
            String[] arr = str.split(" ");
            int m = Integer.MIN_VALUE;
            for(String x : arr){
                if(x.length() > m){
                    m = x.length();
                    answer = x;
                }
            }
            return answer;
        }
        public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

}
