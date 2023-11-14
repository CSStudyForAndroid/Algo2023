package personal;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.*;

public class CT1114P {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");

        LinkedList<int[]> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());

            while (!list.isEmpty() && list.getLast()[0] > now) {
                list.removeLast();
            }
            list.addLast(new int[]{now, i});

            if (list.getFirst()[1] <= i - size) {
                list.removeFirst();
            }
//            System.out.print(list.getFirst()[0] + " ");
            wr.write(list.getFirst()[0] + " ");
        }
        wr.flush();
        wr.close();
//        for (int i = 0; i < N; i++) {
//            for (int j = list.size() - 1; j > -1; j--) {
//                if (array[i] < list.get(j)[0]) {
//                    list.removeLast();
//                }else{
//                    break;
//                }
//            }
//            list.addLast(new int[]{array[i], i});
//
//            if (list.size() > 0) {
//                int[] min = list.getFirst();
//                if (min[1] == i - size) {
//                    list.removeFirst();
//                }
//            }
//            System.out.print(list.getFirst()[0]+" ");
//        }
    }

}
//public class CT1114P {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int size = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(array);
//        int count = 0;
//        for (int i = 0; i < size; i++) {
//            int target = array[i];
//            for (int j = 0; j < size; j++) {
//                int targetNum = target - array[j];
//                if (targetNum == array[j] || targetNum == 0) continue;
//                if (findIdx(array, 0, size, targetNum, j, i) != -1) {
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//
//    public static int findIdx(int[] array, int startIdx, int endIdx, int targetNum, int startLimit, int endLimit) {
//        if (startIdx > endIdx) return -1;
//        int mid = (startIdx + endIdx) / 2;
//
//        if (array[mid] == targetNum) {
//            if (array[mid] == array[startLimit]) {
//                return -1;
//            } else if (array[mid] == array[endLimit]) {
//                return -1;
//            } else {
//                return mid;
//            }
//        } else if (array[mid] > targetNum) {
//            return findIdx(array, startIdx, mid - 1, targetNum, startLimit, endLimit);
//        } else {
//            return findIdx(array, mid + 1, endIdx, targetNum, startLimit, endLimit);
//        }
//    }
//}
//public class CT1114P {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int size = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        long[] array = new long[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(array);
//        int count = 0;
//        for (int k = 0; k < size; k++) {
//            long find = array[k];
//            int i = 0;
//            int j = size-1;
//            while (i < j) {
//                if (array[i] + array[j] < find) {
//                    i++;
//                } else if (array[i] + array[j] > find) {
//                    j--;
//                } else {
//                    if (i != k && j != k) {
//                        count++;
//                        break;
//                    } else if (i == k) {
//                        i++;
//                    } else if (j == k) {
//                        j--;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}


//public class CT1114P {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int N = Integer.parseInt(st.nextToken());
//        int question = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine(), " ");
//        int[] array = new int[N];
//        for (int i = 0; i < N; i++) {
//            array[i] = Integer.parseInt(st.nextToken());
//        }
//        int[][] questions = new int[question][2];
//        for (int i = 0; i < question; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            questions[i][0] = Integer.parseInt(st.nextToken());
//            questions[i][1] = Integer.parseInt(st.nextToken());
//        }
//        Solution temp = new Solution();
//        for (int i : temp.solution(N, question, array, questions)) {
//            System.out.println(i);
//        }
//    }
//}

//class Solution {
//    public int[] solution(int N, int question, int[] array, int[][] questions) {
//        int[] sum = new int[N+1];
//        sum[0] = 0;
//        sum[1] = array[0];
//        for (int i = 2; i <= N; i++) {
//            sum[i] = sum[i - 1] + array[i-1];
//        }
//        int[] result = new int[question];
//        for(int i = 0 ; i < question; i++){
//            result[i] = (sum[questions[i][1]] - sum[questions[i][0]-1]);
//        }
//
//        return result;
//    }
//}
