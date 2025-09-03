package BAEKJOON.INFLEARN;
import java.util.*;

class Main{
    public int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        // for(int i=0; i<str.length(); i++){
        //     if(str.charAt(i) == c) answer++;
        // }
        // 향상된 for문 --> 배열, 컬렉션만 사용 가능 ! 문자열은 안되므로 toCharArray() 사용
        for(char x : str.toCharArray()){
            if(x == c) answer++;
        }
        return answer;
    }
    public static void main (String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(T.solution(str,c));
    }

}

