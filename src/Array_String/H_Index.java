package Array_String;

import java.util.Arrays;

public class H_Index {
    public static int hIndex(int[] citations) {
        int h = citations.length;
        int maxi = 0;
        Arrays.sort(citations);
        for(int i = 0;i<citations.length;i++)
        {
            if(citations[i]>=h-i)
            {
                maxi = Math.max(maxi,h-i);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int [] citations = {3,0,6,1,5};
        System.out.println(hIndex(citations));
    }
}
