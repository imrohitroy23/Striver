public class StockBuyAndSell {
        
    public int maxProfit(int[] arr) {
     
        int n=arr.length;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
            if(arr[i]>=min) max=Math.max(max,arr[i]-min);
        }
        return max;
    }
}
