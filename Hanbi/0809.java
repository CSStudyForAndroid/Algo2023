import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        //초기 시작과 끝 시간 설정
        long start = 0;
        long end = (long) n * times[times.length - 1] ; //제일 긴 시간에서만 심사 할 경우
        
        while(start <= end){
            //시간의 중간값
            long mid = (start + end) / 2;
            long people = 0;
            //주어진 시간(mid) 내에 최대 몇명 심사가 가능한지 알아내는 과정
            for(int i = 0; i < times.length; i++){
                people += mid / times[i];
            }
            //시간 안에 n명보다 많이 처리할 경우
            if(people >= n){
                end = mid - 1; //시간 줄이기
                answer = mid; //일단 성공 시간 저장
            }
            //시간 안에 n명이 안될 경우, 마지막 값 return
            else{
                start = mid + 1; //시간 늘리기
            }
        }
        
        return answer;
    }
}
