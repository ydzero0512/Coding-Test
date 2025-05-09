// Title: 명령 프롬프트
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader를 사용하여 속도 향상
        
        int n = Integer.parseInt(br.readLine());
        String[] fileNames = new String[n];

        for (int i = 0; i < n; i++) {
            fileNames[i] = br.readLine();
        }

        char[] pattern = fileNames[0].toCharArray(); // 첫번째 파일명을 기준으로 패턴 설정 

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (fileNames[i].charAt(j) != pattern[j]) {
                    pattern[j] = '?';
                }
            }
        }

        System.out.println(new String(pattern));
    }
}

