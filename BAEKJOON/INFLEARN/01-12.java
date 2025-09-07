package BAEKJOON.INFLEARN;
import java.util.*;

 class Main {

    public static void main ( String[] args) {

        // 입력값 --> 정수, string 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); //줄바꿈 넘기 
        String str = sc.nextLine();
        int temp = 0;
        // 입력받은 문자열을 7자리씩 자른다 substring(0,7) , ( 8, 15 ), ( n, n + 7)
        String answer = "";
        for(int i = 0; i < n ; i ++){
            String substr = str.substring(temp, temp + 7);
            String text = substr.replace("#", "1").replace("*", "0");
            int num = Integer.parseInt(text, 2);
            char ch = (char)num;
            answer += ch;
            temp += 7;
        }

        System.out.println(answer);

    }


}