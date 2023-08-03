import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        //첫 값 넣어주기
        queue.offer(numbers[0]);
        queue.offer(-1 * numbers[0]);
        
        for(int i = 1; i < numbers.length; i++){
						//이전까지 큐에 들어있는 값 만큼 반복
            int pre_size = queue.size();
            for(int j = 0; j < pre_size; j++){
                int now = queue.poll();
                queue.offer(now + numbers[i]);
                queue.offer(now  - numbers[i]);
            }
        }
        // System.out.println(queue);
        for(int i : queue){
            if(i == target){
                answer++;
            }
        }
        return answer;
    }
    
}
