package personal;

import java.io.*;
import java.util.*;

public class CT1224P {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        LinkedList<Integer> stack = new LinkedList<>();
        for(int i = 1; i <=num; i++){
            stack.addLast(i);
        }

        int count = 1;
        while(stack.size() != 1){
            if(count % 2 == 1){
                stack.removeFirst();
            }else{
                stack.addLast(stack.removeFirst());
            }
            count++;
        }
        System.out.println(stack.getLast());
    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int size = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = Integer.parseInt(st.nextToken());
//        }
//
//        LinkedList<Integer> stack = new LinkedList<>();
//        int[] result = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            while(stack.size() > 0 && array[stack.getLast()] < array[i]) {
//                int lastIdx = stack.removeLast();
//                result[lastIdx] = array[i];
//            }
//            stack.addLast(i);
//        }
//
//        for (Integer integer : stack) {
//            result[integer] = -1;
//        }
//
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        for(int i = 0 ; i < size ;i++){
//            bw.write(result[i]+" ");
//        }
//        bw.flush();
//        bw.close();
//    }
}
