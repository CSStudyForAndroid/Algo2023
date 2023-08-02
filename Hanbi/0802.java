//프로그래머스 - 등굣길
import java.util.*;
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] map = new int[m][n];
        
        //물웅덩이를 지도에 표시
        for(int[] puddle  : puddles){
            map[puddle[0]-1][puddle[1]-1] = -1;
        }
        //시작 값은 1이어야 더할게 있음.
        map[0][0] = 1;
        
        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                //물웅덩이가 아니라면 0으로, -1로 냅두면 더했을 때 값이 달라짐
                if(map[i][j] == -1){
                    map[i][j] = 0;
                }
                else{
                   if(i != 0){map[i][j] += map[i-1][j] % 1000000007;} 
                   if(j != 0){map[i][j] += map[i][j-1] % 1000000007;}
               }
            }
        }
        
        return map[m-1][n-1] % 1000000007;
    }
}
