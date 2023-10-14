package personal;

import java.util.Arrays;
import java.util.LinkedList;

public class CT1014P {
    public static void main(String[] args) {

    }
}


//class Solution {
//    int[] discount = {10, 20, 30, 40};
////    LinkedList<int[]> result = new LinkedList<>();
//
//    int[] result = new int[2];
//    public int[] solution(int[][] users, int[] emoticons) {
//        int[] answer = {};
//        int[] combi = new int[emoticons.length];
//        for (int i = 0; i < emoticons.length; i++) {
//            combi[i] = 0;
//        }
//
//        makeMoney(users, combi, emoticons, 0);
//
////        result.sort((o1, o2) -> {
////            if (o1[0] == o2[0]) {
////                return (o2[1] - o1[1]);
////            } else {
////                return o2[0] - o1[0];
////            }
////        });
//
//        return result;
//    }
//
//    void makeMoney(int[][] users, int[] combi, int[] emoticons, int n) {
//        if (n == emoticons.length) {
//            int totalSaleMoney = 0;
//            int servicePeople = 0;
//            for (int i = 0; i < users.length; i++) {
//                int limitDiscount = users[i][0];
//                int limitMoney = users[i][1];
//                int resultMoney = 0;
//                for (int j = 0; j < combi.length; j++) {
//                    int discountedMoney = ((emoticons[j] / 100) * ((100 - combi[j])));
//                    if (limitDiscount <= combi[j]) resultMoney += discountedMoney;
//                }
//                if (limitMoney <= resultMoney) servicePeople++;
//                else totalSaleMoney += resultMoney;
//            }
////            result.add(new int[]{servicePeople, totalSaleMoney});
//            if(result[0] < servicePeople){
//                result[0] = servicePeople;
//                result[1] = totalSaleMoney;
//            }else if(result[0] == servicePeople){
//                result[1] = Math.max(result[1], totalSaleMoney);
//            }
//        } else {
//            for (int j = 0; j < 4; j++) {
//                combi[n] = discount[j];
//                makeMoney(users, combi, emoticons, n + 1);
//                combi[n] = 0;
//            }
//        }
//    }
//}