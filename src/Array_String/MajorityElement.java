package Array_String;

public class MajorityElement {
    static int majorityEle(int[] arr)
    {
        Integer ans = null;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count==0)
               ans = arr[i];
            if (ans == arr[i])
                count++;
            else
                count--;
        }
        return ans;
    }
    public static void main(String[] args) {
         int [] nums = {3,2,2,2,3};
        System.out.println(majorityEle(nums));
    }
}
