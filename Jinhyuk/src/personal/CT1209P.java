package personal;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class CT1209P {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        int count = Integer.parseInt(str);
//        String numList = br.readLine();
//        int num = 0;
//        for (char i : numList.toCharArray()) {
//            num += (i - '0');
//        }
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(num +"\n");
//        bw.flush();
//        bw.close();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int size = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int[] array = new int[size];
//        int max = 0;
//        for(int i = 0 ; i < size; i++){
//            array[i] = Integer.parseInt(st.nextToken());
//            max = Math.max(max, array[i]);
//        }
//        double sum = 0.0;
//        for(int i : array){
//            sum += ((i*100)/ (double) max);
//        }
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(String.valueOf((sum/ (double) size)));
//        bw.flush();
//        bw.close();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int size = Integer.parseInt(st.nextToken());
//        int count = Integer.parseInt(st.nextToken());
//
//        int[] sumArray = new int[size+1];
//        st = new StringTokenizer(br.readLine(), " ");
//        int sum = 0;
//        for(int i = 0 ; i < size; i++){
//            sum += Integer.parseInt(st.nextToken());
//            sumArray[i+1] = sum;
//        }
//        int[] result = new int[count];
//        for(int i = 0 ;i < count ;i++){
//            st = new StringTokenizer(br.readLine(), " ");
//            int startIdx = Integer.parseInt(st.nextToken());
//            int endIdx = Integer.parseInt(st.nextToken());
//            result[i] = sumArray[endIdx] - sumArray[startIdx-1];
//        }
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for(int i = 0 ; i < count ; i++){
//            bw.write(String.valueOf(result[i])+"\n");
//        }
//        bw.flush();
//        bw.close();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int size = Integer.parseInt(st.nextToken());
//        int count = Integer.parseInt(st.nextToken());
//
//        int[][] array = new int[size + 1][size + 1];
//        for (int i = 1; i <= size; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            for (int j = 1; j <= size; j++) {
//                array[i][j] = array[i][j - 1] + Integer.parseInt(st.nextToken());
//            }
//        }
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        for (int i = 0; i < count; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            int startX = Integer.parseInt(st.nextToken());
//            int startY = Integer.parseInt(st.nextToken());
//            int endX = Integer.parseInt(st.nextToken());
//            int endY = Integer.parseInt(st.nextToken());
//            int sum = 0;
//            for (int j = startX; j <= endX; j++) {
//                sum += array[j][endY] - array[j][startY - 1];
//            }
//            bw.write(sum + "\n");
//        }
//
//        bw.flush();
//        bw.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int size = Integer.parseInt(st.nextToken());
        int divide = Integer.parseInt(st.nextToken());

        int[] sumArray = new int[size + 1];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= size; i++) {
            sumArray[i] = Integer.parseInt(st.nextToken()) + sumArray[i - 1];
        }
        findCase(1, sumArray, divide, new LinkedList<Integer>());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    static int count = 0;

    public static void findCase(int start, int[] sumArray, int divide, LinkedList<Integer> list) {
        if (list.size() == 2) {
            if ((sumArray[list.get(1)] - sumArray[list.get(0) - 1]) % divide == 0) {
                count++;
            }
        } else {
            for (int i = start; i < sumArray.length; i++) {
                list.addLast(i);
                findCase(i, sumArray, divide, list);
                list.removeLast();
            }
        }
    }
}


