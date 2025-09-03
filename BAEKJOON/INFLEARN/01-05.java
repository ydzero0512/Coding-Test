package BAEKJOON.INFLEARN;
import java.util.*;

class Main {
        public String solution(String str){
            // 첫번째, 마지막 인덱스에서 비교하여 
            char[] arr = str.toCharArray();
            int lt = 0, rt = arr.length -1;
            while (lt<rt) {
                if(!Character.isAlphabetic(arr[lt])){
					lt++;
                }else if (!Character.isAlphabetic(arr[rt])){
                     rt--;
                }else{
                                    
                        char tmp = arr[lt];
                        arr[lt] = arr[rt];
                        arr[rt] = tmp;
                        lt++;
                        rt--;
                    
            }}
            return String.valueOf(arr);
        }
        public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

}