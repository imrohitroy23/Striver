public class MaximumSubarray {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
        int res=0;
        int t=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            res+=arr[i];
            if(res>t) t=res;
            if(res<0) res=0;
        }
        return t;
    }
}
