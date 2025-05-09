// Title: 두 수 비교하기
import java.util.*;

public class BaekJoon1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = "";
        if (a > b) result = ">";
        if (a < b) result = "<";
        if (a == b) result = "==";

        System.out.println(result);
    }
}
