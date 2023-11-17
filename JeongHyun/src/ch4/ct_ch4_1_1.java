package ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ct_ch4_1_1 {
    /*public static void main(String[] args) throws IOException {
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
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String[] strings = br.readLine().split(" ");
        int x = 1, y = 1;

        for (String string: strings) {
            switch (string) {
                case "L":
                    if (x > 1) x--;
                    break;
                case "R":
                    if (x < n) x++;
                    break;
                case "U":
                    if (y > 1) y--;
                    break;
                case "D":
                    if (y < n) y++;
                    break;
            }
        }

        System.out.println(y + " " + x);
    }
}
