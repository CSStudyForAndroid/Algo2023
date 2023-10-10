package ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ct_ch12_08 { // 문자열 재정렬
    /*
    알파벳 대문자 & 숫자 0~9 문자열이 입력됨
    모든 알파멧 오름차순 정렬 + 모든 숫자를 더한 값 출력

     s <= 10,000 -> O(NlogN)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> al = new ArrayList<>(); // 알파벳 부분
        int num = 0; // 숫자부분
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){ // Character.isLetter: 문자인지 체크
                // 알파벳인 경우
                al.add(str.charAt(i));
            }else{
                // 숫자인 경우
                num += str.charAt(i) - '0';
            }
        }

        // 알파벳 정렬 & 출력
        Collections.sort(al);
        for(int i = 0; i < al.size(); i++)
            System.out.print(al.get(i));

        // 숫자 출력
        if(num != 0) System.out.print(num);

    }
}
