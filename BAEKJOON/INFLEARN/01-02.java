package BAEKJOON.INFLEARN;
import java.util.*;

class Main {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isUpperCase(x))
            answer += Character.toLowerCase(x);
            else answer += Character.toUpperCase(x);
        }
        // 아스키 넘버로도 비교 가능 ! 
        // for(char x : str.toCharArray()){
        //     if(x >= 65 && x <= 97) answer += (char)(x + 32);
        //     else answer +=(char)(x - 32); 
        // }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
