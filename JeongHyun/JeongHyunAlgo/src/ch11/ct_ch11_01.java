package ch11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ct_ch11_01 { // 모험가 길드
    /*
     공포도 높음 -> 쉽게 공포 느껴 대처 능력 감소
     동빈이는 공포도 x인 모험가는 반드시 x명 이상으로 구성한 모험가 그룹에 참여해야 함
     최대 몇 개의 모험가 그룹 만들 수 있는가
     N명의 모험가에 대한 정보 제공
     모든 모험가를 특정 그룹에 넣을 필요 없음(몇 명은 마을에 남아 있어도 됨)

     입력값 100,000 데이터 -> NlogN
     2 3 1 2 2 -> 1 2 3 / 2 2
     1 1 2 3 3 -> 1 / 1 / 2 3 3
     */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            al.add(Integer.parseInt(st.nextToken()));
        }

        // 정렬
        Collections.sort(al);

        int count = 0;
        int result = 0;
        for(int i = 0; i < n; i++){
            count++;
            if(count >= al.get(i)){
                result++;
                count = 0;
            }
        }

        System.out.println(result);
    }

}
