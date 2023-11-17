package ch6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ct_ch6_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        List<String> list = new ArrayList<>(map.keySet()); // key값 들만 모임
        list.sort(Comparator.comparing(map::get)); // value값들을 내림차순으로 정렬

        for(String str: list){
            System.out.print(str + " ");
        }
    }
}
