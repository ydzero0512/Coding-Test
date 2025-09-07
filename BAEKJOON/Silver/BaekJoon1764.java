package BAEKJOON.Silver;
import java.util.*;

class Main {

    public static void main(String args[]){
        // 첫 숫자 : 듣도 못한 , 두번째 : 보도 못한 
        // 1 ~ n까지 / n+1 ~ 끝까지 
        // 배열에 담거나 해시맵으로 풀면 될 듯 
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<String , Integer> map = new HashMap<String , Integer>();
        
        for (int i = 0; i < n; i++){
            map.put(sc.next(), 1);  // 듣도 못한 사람  
        }
    
        for (int i = 0; i < m; i++){
           String str = sc.next();
           map.put(str,map.getOrDefault(str, 0)+1); //키가 있으면  +1 한 값. 없으면 1
        }
        
        ArrayList<String> ls = new ArrayList<String>(); // 듣보잡 담을 배열
        // 듣보잡 수, value가 1이상인 애들 출력
        for(String s : map.keySet()){
            Integer num = map.get(s);
            if(num > 1) ls.add(s);
        }
        
        System.out.println(ls.size());
        Collections.sort(ls); // ArrayList 는 Collections로 정렬 해주어야함 ! 
        for(int i = 0; i < ls.size();i++){
        System.out.println(ls.get(i));
        }
        
    }



}