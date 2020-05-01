import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        int[] hgsum =new int[40];
        int count=0;
        int j;
        for(int i=0;i<=5;i++)
        {
            int sum=0;
            for( j=0 ; j<3;j++)
            {
                sum=sum+arr[i][j];
            }
            if (i==6) {
                break;
            }
            sum= sum+arr[i+1][j-1];
            for( j=0;j<3;j++)
            {
                if (i+2>5) {
                    break;
                }
                sum=sum+arr[i+2][j];
            }
            hgsum[count]=sum;
            count++;
        }
        int max=hgsum[0];
        for(int i=0;i<hgsum.length;i++)
        {
            if(max<hgsum[i])
            {
                max=hgsum[i];
            }
        }
        System.out.println(max);
    }
}
