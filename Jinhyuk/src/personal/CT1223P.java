package personal;

import java.io.*;
import java.util.*;

public class CT1223P {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        LinkedList<Integer> stack = new LinkedList<>();
        LinkedList<String> result = new LinkedList<>();
        int[] array = new int[size];
        for(int i = 0 ; i < size ; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        int now = 1;
        for (int i = 0; i < size; i++) {
            int target = array[i];

            if (now <= target) {
                while (now <= target) {
                    stack.addLast(now);
                    now++;
                    result.addLast("+");
                }
                stack.removeLast();
                result.addLast("-");
            } else {
                int n  = stack.removeLast();
                if(n > target){
                    System.out.println("NO");
                    result.clear();
                    break;
                }else{
                    result.addLast("-");
                }
            }
        }

        for (String i : result) {
            System.out.println(i);
        }
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int numSize = Integer.parseInt(st.nextToken());
//        int windowSize = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine(), " ");
//
//        LinkedList<int[]> q = new LinkedList<>();
//
//        int[] minArray = new int[numSize];
//
//        for (int i = 0; i < numSize; i++) {
//            int now = Integer.parseInt(st.nextToken());
//            int windowStartIdx = i - windowSize;
//            while (q.size() > 0 && q.getFirst()[0] <= windowStartIdx) {
//                q.removeFirst();
//            }
//
//            while (q.size() > 0 && q.getLast()[1] > now) {
//                q.removeLast();
//            }
//            q.addLast(new int[]{i, now});
//
//            minArray[i] = q.getFirst()[1];
//        }
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for (int i = 0; i < numSize; i++) {
//            bw.write(minArray[i] + " ");
//        }
//        bw.flush();
//        bw.close();
//    }

//    static int checkArr[];
//    static int myArr[];
//    static int checkSecret;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int dnaLength = Integer.parseInt(st.nextToken());
//        int partLength = Integer.parseInt(st.nextToken());
//        char[] dna = br.readLine().toCharArray();
//        st = new StringTokenizer(br.readLine(), " ");
//        checkArr = new int[4];
//        myArr = new int[4];
//        for(int i = 0 ; i < 4; i++){
//            checkArr[i] = Integer.parseInt(st.nextToken());
//            if(checkArr[i] == 0) checkSecret++;
//        }
//        int count = 0;
//
//        for(int i = 0 ; i < partLength; i++){
//            Add(dna[i]);
//        }
//
//        if(checkSecret == 4){
//            count++;
//        }
//
//        for(int endIdx = partLength ; endIdx < dnaLength; endIdx++){
//            int startIdx = endIdx - partLength;
//            Add(dna[endIdx]);
//            Remove(dna[startIdx]);
//            if(checkSecret == 4){
//                count++;
//            }
//        }
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(count+"");
//        bw.flush();
//        bw.close();
//    }
//
//    private static void Add(char c){
//        if(c == 'A'){
//            myArr[0]++;
//            if(myArr[0] == checkArr[0]) checkSecret++;
//        }else if(c == 'C'){
//            myArr[1]++;
//            if(myArr[1] == checkArr[1]) checkSecret++;
//        }else if(c == 'G'){
//            myArr[2]++;
//            if(myArr[2] == checkArr[2]) checkSecret++;
//        }else{
//            myArr[3]++;
//            if(myArr[3] == checkArr[3]) checkSecret++;
//        }
//    }
//
//    private static void Remove(char c){
//        if(c == 'A'){
//            if(myArr[0] == checkArr[0]) checkSecret--;
//            myArr[0]--;
//        }else if(c == 'C'){
//            if(myArr[1] == checkArr[1]) checkSecret--;
//            myArr[1]--;
//        }else if(c == 'G'){
//            if(myArr[2] == checkArr[2]) checkSecret--;
//            myArr[2]--;
//        }else{
//            if(myArr[3] == checkArr[3]) checkSecret--;
//            myArr[3]--;
//        }
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int numCount = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int[] array = new int[numCount];
//        for (int i = 0; i < numCount; i++) {
//            array[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(array);
//
//        int goodNumCount = 0;
//        for (int i = 0; i < numCount; i++) {
//            int startIdx = 0;
//            int endIdx = numCount - 1;
//            while (startIdx < endIdx) {
//                int sum = array[startIdx] + array[endIdx];
//
//                if (sum == array[i]) {
//                    if (startIdx != i && endIdx != i) {
//                        goodNumCount++;
//                        break;
//                    }else if(startIdx == i){
//                        startIdx++;
//                    }else{
//                        endIdx--;
//                    }
//                } else if (sum < array[i]) {
//                    startIdx++;
//                } else {
//                    endIdx--;
//                }
//            }
//        }
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(goodNumCount + "");
//
//        bw.flush();
//        bw.close();
//    }
}
