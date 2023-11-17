package etc;

import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        Arrays.sort(routes, (a,b) -> Integer.compare(a[1], b[1])); // 끝나는 순으로 오름차순 정렬
        int location = routes[0][1]; // 처음 위치

        for(int i = 1; i < routes.length; i++){
            if(routes[i][0] > location){
                answer++;
                location = routes[i][1];
            }
        }


        return answer;
    }
}