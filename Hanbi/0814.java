import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        
        if(n > s){
            answer = new int[] {-1};
        }else{
            if(s%n == 0){
                Arrays.fill(answer, s/n);
            }else{
                for(int i = 0; i < n; i++){
                    answer[i] = s/(n-i);
                    s -= s/(n-i);
                }
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
