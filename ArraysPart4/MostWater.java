public class MostWater {
    public int maxArea(int[] A) {
        int ans=0;
        int left=0;
        int right=A.length-1;
        while(left<right)
        {
            ans=Math.max(ans,Math.min(A[left],A[right])*(right-left));
            if(A[left]<A[right])
            {
                left++;
            }
            else{
                right--;
            }
            
        }
        
        return ans;
        
    
    }
}
