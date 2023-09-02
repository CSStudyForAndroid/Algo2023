import java.util.*;

class 스티커모으기2 {
    public int solution(int sticker[]) {
        // 첫번째 스티커를 떼는 방법과 안 떼는 방법으로 나눔!
        int answer = 0;
        if(sticker.length == 1) return sticker[0];

        int[] dp1 = new int[sticker.length];
        int[] dp2 = new int[sticker.length];

        // 첫번재 스티커 떼는 경우
        dp1[0] = sticker[0];
        dp1[1] = sticker[0];
        for(int i = 2; i < sticker.length - 1; i++){
            dp1[i] = Math.max(dp1[i-1], dp1[i-2] + sticker[i]);
        }

        // 첫번째 스티커를 떼지 않는 방법
        dp2[0] = 0;
        dp2[1] = sticker[1];
        for(int i = 2; i < sticker.length; i++){
            dp2[i] = Math.max(dp2[i-1], dp2[i-2] + sticker[i]);
        }

        answer = Math.max(dp1[sticker.length-2], dp2[sticker.length -1]);


        return answer;
    }
}
