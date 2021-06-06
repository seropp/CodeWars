package kyu5;

public class MaxSubarraySum {
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        
    }

    public static int sequence(int[] arr) {
        if(arr.length==0) return 0;
        int sum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int res = 0;
                for (int k = i; k <= j; k++) {
                    res+=arr[k];
                }
                if (sum<res) sum=res;
            }
        }
        
        return sum;
    }
}
