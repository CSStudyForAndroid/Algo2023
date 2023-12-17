package personal;

import java.io.*;

public class CT1217P {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int startNum = 1;
        int endNum = 1;
        int sum = 1;
        int count = 0;
        while (endNum <= n) {
            if (sum == n) {
                count++;
                endNum++;
                sum += endNum;
            } else if (sum < n) {
                endNum++;
                sum += endNum;
            } else {
                sum -= startNum;
                startNum++;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(count);


        bw.flush();
        bw.close();
    }
}
