
import java.util.*;
import java.io.*;

class BaekJoon1037 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] arr = str.split(" "); // ["10","20"]
        if(num == 1) {
            int a = Integer.parseInt(arr[0]);
            System.out.println(a*a);
        } else {
            int[] intNum = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(intNum); 
            int a = intNum[0];
            int b = intNum[intNum.length - 1];
            System.out.println(a*b);
        }

    }
}
