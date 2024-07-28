package Array_String;

public class JumpGame {
    static boolean jumpGame(int [] arr)
    {
        int n = arr.length;
        int i = n-2;
        int goal = n-1;
        while (i>=0) {
            if (i + arr[i] >= goal)
            {
                goal = i;
                i--;
            }
            else {
                i--;
            }
        }
        return goal==0 ? true:false;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,1,1,2};
        int [] arr2 = {3,2,1,0,4};
        System.out.println(jumpGame(arr2));
    }
}
