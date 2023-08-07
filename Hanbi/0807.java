import java.util.*;
class Solution {
    boolean[] visited;
    int answer = Integer.MAX_VALUE;
    
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        
        dfs(0, begin, target, words, visited);
        if(answer == Integer.MAX_VALUE){
            return 0;
        }
        return answer;
    }
    
    public void dfs(int count, String begin, String target, String[] words, boolean[] visited){
        
        if(begin.equals(target)){
            answer = Math.min(answer, count);
            return;
        }
        
        for(int i = 0; i < words.length; i++){
            if(visited[i] || !check(begin, words[i])){
                continue;
            }
            
            visited[i] = true;
            dfs(count + 1, words[i], target, words, visited);
            visited[i] = false;
        }
        
    }
    
    //두 단어가 딱 한글자 차이 일 경우
    public boolean check(String begin, String target){
        
        int cnt = 0;
        for(int i = 0; i < target.length(); i++){
            if(begin.charAt(i) != target.charAt(i)){
                cnt++;
            }else{
                continue;
            }
        }
        
        if(cnt == 1){
            return true;
        }
        return false;  
    } //check 함수 끝
    
    
}
