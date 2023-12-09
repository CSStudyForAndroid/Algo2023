package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n21734 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String smupc = br.readLine();

        for(int i = 0; i < smupc.length(); i++){
            int num = smupc.charAt(i);
            int sum = getSum(num);

            for(int j = 0; j < sum; j++)
                System.out.print(smupc.charAt(i));
            System.out.println();
        }

    }

    public static int getSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
