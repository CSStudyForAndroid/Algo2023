package personal;

import java.io.*;
import java.util.*;

public class CT0118P {

    static int[] arrays;
    static int[] original;
    static int[] temp;
    static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        arrays = new int[size+1];
        original = new int[size+1];
        temp = new int[size+1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i < size+1; i++) {
            arrays[i] = Integer.parseInt(st.nextToken());
            original[i] = arrays[i];
        }

        result = 0;
        CountMoving(1, size);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "");
        bw.flush();
        bw.close();
    }

    static void CountMoving(int start, int end) {
        if (end - start < 1) return;

        int mid = start + (end - start) / 2;

        CountMoving(start, mid);
        CountMoving(mid+1, end);

        for(int i = start ; i <= end ; i++){
            temp[i] = arrays[i];
        }

        int resultIdx = start;
        int idx1 = start;
        int idx2 = mid + 1;
        while(idx1 <= mid && idx2 <= end){
            if(temp[idx2]< temp[idx1]){
                arrays[resultIdx] = temp[idx2];
                result += (idx2 - resultIdx);
                resultIdx++;
                idx2++;
            } else {
                arrays[resultIdx] = temp[idx1];
                resultIdx++;
                idx1++;
            }
        }
        while(idx1<=mid){
            arrays[resultIdx] = temp[idx1];
            resultIdx++;
            idx1++;
        }
        while(idx2<=end){
            arrays[resultIdx] = temp[idx2];
            resultIdx++;
            idx2++;
        }
    }
}
