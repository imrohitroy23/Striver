class xor{
    public long sumXOR (int arr[], int n) {
        //Complete the function
        long sum=0;
        for(int i=0;i<32;i++){
            long sb=0, usb=0;
            for(int j=0;j<n;j++){
                if((arr[j]&(1<<i))!=0) sb++;
                else usb++;
            }
            long pc=sb*usb;
            sum+=pc*(1<<i);
        }
        return sum;
    }
}