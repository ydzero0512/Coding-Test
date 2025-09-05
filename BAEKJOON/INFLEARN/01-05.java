package BAEKJOON.INFLEARN;
import java.util.*;
import java.io.*;
  
 class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String revStr = new StringBuilder(str).reverse().toString();
    String answer = "NO";
    if(str.equalsIgnoreCase(revStr)) answer = "YES";
    System.out.println(answer);
    return ;
  }
}