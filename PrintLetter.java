import java.util.*;
import java.util.*;

public class PrintLetter {

    public static void main(String args[])
    {
        String str="WELCOME";

        char[] A = str.toCharArray();
        int offset=(1+A.length)/2;
        int len = A.length;
        offset %= len;
        reverse(A, 0, len - offset - 1);
        reverse(A, len - offset, len - 1);
        reverse(A, 0, len - 1);

        String s = new String(A);

        int i, j, row = s.length();
        for (i=0; i<row; i++)
        {
            for (j=2*(row-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
    }

    private static void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
