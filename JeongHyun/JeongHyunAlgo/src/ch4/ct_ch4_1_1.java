package ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ct_ch4_1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int x = 1, y = 1;

        for(String str: strs){
            switch (str){
                case "L":
                    if(y > 1) y--;
                    break;
                case "R":
                    if(y < n) y++;
                    break;
                case "U":
                    if(x > 1) x--;
                    break;
                case "D":
                    if(x < n) x++;
                    break;
            }
        }
        System.out.println(x + " " + y);
    }
}
