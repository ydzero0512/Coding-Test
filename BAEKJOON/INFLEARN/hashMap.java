package BAEKJOON.INFLEARN;
import java.util.*;
  
public class hashMap {
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    HashMap<Character, Integer> map = new HashMap<Character, Integer>(); // 해쉬맵은 char안됨 Character 
    
    // 문자열을 돌면서 객체에 넣고, 그 키값이 객체에 있으면 넣지않고 +1시켜줌
    
    for(int i = 0; i < n; i++){
    Character hobo = str.charAt(i);
    if(!map.containsKey(hobo)) map.put(hobo, 1);
    else map.replace(hobo, map.get(hobo) + 1 );
      
    }
    Integer max = Collections.max(map.values());
    Character answer  = ' '; // '' X !!! ' 'o
    for ( Character s : map.keySet() ){
    	if(max == map.get(s)) answer = s;
    }
    System.out.println(answer);
  }
}