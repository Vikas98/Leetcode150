package Array_String;

import java.util.Arrays;

public class MergeSortedArray {
    static  void mergeSortedArray(int[] arr1 ,int n,int[] arr2,int m)
    {
        int i = n-1;
        int j = m-1;
        int k = arr1.length-1;

        while (j>=0)
        {
            if(i>=0 && arr1[i]>arr2[j])
            {
                arr1[k--]= arr1[i--];
            }
            else
            {
                arr1[k--] = arr2[j--];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,4,5};
        mergeSortedArray(arr1,arr1.length-3,arr2,arr2.length);
        System.out.println(Arrays.toString(arr1));
    }
}
