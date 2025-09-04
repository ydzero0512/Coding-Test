package BAEKJOON.Silver;
import java.io.*;
import java.util.*;

public class BaekJoon1026 {
    // 두번째 배열에서 작은수, 큰 수 찾아서 첫번째 배열에서 큰수, 작은수로 맞춰줘야함 
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // int형으로 바꿔줌 
        Integer [][] arr = new Integer[2][n]; // 선언할 때는 크기만큼 선언! 
        
        for (int t = 0; t < 2; t++) {
            String[] sarr = br.readLine().split(" "); // 로컬변수라서
            for (int i = 0; i < n; i++) {
                arr[t][i] = Integer.parseInt(sarr[i]);
            }
        }// 배열에 담음 [[1,2,3],[4,5,4]]

        Arrays.sort(arr[0]);
        Arrays.sort(arr[1],Collections.reverseOrder());
       
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer +=  arr[0][i] * arr[1][i];
        }
        Arrays.sort(arr[1]); //다시 돌려주기
        System.out.println(answer);
        
    }
}
