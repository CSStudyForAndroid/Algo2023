package personal;

import java.util.Collections;
import java.util.LinkedList;

public class CT1104P {
    public static void main(String[] args) {

    }
}

//class Solution {
//    public LinkedList<int[]> solution(int n, int[][] build_frame) {
//        LinkedList<int[]> list = new LinkedList<>();
//
//        for (int i = 0; i < build_frame.length; i++) {
//            int x = build_frame[i][0];
//            int y = build_frame[i][1];
//            int src = build_frame[i][2];
//            int[] temp = new int[]{x, y, src};
//            if (build_frame[i][3] == 1) { // 설치
//                System.out.println(list.size());
//                list.add(temp);
//                System.out.println(list.size());
//                System.out.println();
//                if (!checkMap(list)) {
//                    list.remove(temp);
//                }
//            } else { // 삭제
//                list.remove(temp);
//                if (!checkMap(list)) {
//                    list.add(temp);
//                }
//            }
//            System.out.println(list);
//        }
//
//        list.sort((int[] a, int[] b) -> {
//            if (a[0] != b[0]) {
//                return a[0] - b[0];
//            } else if (a[1] != b[1]) {
//                return a[1] - b[1];
//            } else {
//                return a[2] - b[2];
//            }
//        });
//
//        return list;
//    }
//
//    Boolean checkMap(LinkedList<int[]> list) {
//        for (int[] i : list) {
//            int x = i[0];
//            int y = i[1];
//            int what = i[2];
//            if (what == 0) {
//                if (y == 0 || isOk(x - 1, y, 1, list) || isOk(x, y - 1, 0, list) || isOk(x, y, 1, list))
//                    continue;
//                return false;
//            } else {
//                if (isOk(x, y - 1, 0, list) || isOk(x + 1, y - 1, 0, list) || isOk(x - 1, y, 1, list) ||
//                        isOk(x + 1, y, 1, list))
//                    continue;
//                return false;
//            }
//
//        }
//        return true;
//    }
//
//    Boolean isOk(int x, int y, int what, LinkedList<int[]> list) {
//        for (int[] i : list) {
//            if (i[0] == x && i[1] == y && i[2] == what) continue;
//            return false;
//        }
//        return true;
//    }
//}
