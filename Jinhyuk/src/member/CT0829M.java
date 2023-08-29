//package member;
//
//import javax.sound.midi.Soundbank;
//import java.util.Comparator;
//import java.util.PriorityQueue;
//
//public class CT0829M {
//    public static void main(String[] args) {
//        Solution temp = new Solution();
//        System.out.println(temp.solution(10, 60, 45, new String[]{"23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"}));
//    }
//}
//
//class Solution {
//    public String solution(int n, int t, int m, String[] timetable) {
//        String answer = "";
//
//        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
//        for (String i : timetable) {
//            int hour = Integer.valueOf(i.substring(0, 2));
//            int min = Integer.valueOf(i.substring(3, 5));
//            q.add(60 * hour + min);
//        }
//
//        int nowTimeInMin = 9 * 60;
//        int lastTime = nowTimeInMin;
//        for (int i = 0; i < n; i++) {
//            if (i == n - 1) {
//                for (int j = 0; j < m; j++) {
//                    if (q.peek() != null) {
//                        if (q.peek() > nowTimeInMin) {
//                            lastTime = nowTimeInMin;
//                            break;
//                        }
//                        lastTime = q.poll() - 1;
//                    } else {
//                        if (lastTime <= nowTimeInMin) {
//                            lastTime = nowTimeInMin;
//                        }
//                    }
//                }
//            } else {
//                for (int j = 0; j < m; j++) {
//                    if (q.peek() != null) {
//                        if (q.peek() > nowTimeInMin) {
//                            break;
//                        }
//                        int num = q.poll();
//                    }
//                }
//            }
//            nowTimeInMin += t;
//        }
//
//        int hour = (lastTime / 60);
//        int min = (lastTime % 60);
//        String hourStr = "";
//        String minStr = "";
//        if (hour < 10) hourStr = "0" + hour;
//        else hourStr = String.valueOf(hour);
//        if (min < 10) minStr = "0" + min;
//        else minStr = String.valueOf(minStr);
//        answer = hourStr+":"+minStr;
//        return answer;
//    }
//}
