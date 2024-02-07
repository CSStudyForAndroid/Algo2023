package personal;

import java.io.*;
import java.util.*;

public class CT0206P {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String numList = br.readLine();

        StringTokenizer st = new StringTokenizer(numList, "-");

        int sum = 0;
        int size = st.countTokens();
        for (int i = 0; i < size; i++) {
            String part = st.nextToken();
            StringTokenizer st2 = new StringTokenizer(part, "+");
            int partSum = 0;
            while (st2.hasMoreTokens()) {
                partSum += Integer.parseInt(st2.nextToken());
            }
            if (i == 0) {
                sum += partSum;
            } else {
                sum -= partSum;
            }
        }

        System.out.println(sum);
    }
}
