package Array_String;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    static int removeDuplicate(int [] arr)
    {
        int j = 1;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] != arr[i-1])
            {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,3,3,4,4,5,6,6,6};

       int k = removeDuplicate(arr);
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }
}
