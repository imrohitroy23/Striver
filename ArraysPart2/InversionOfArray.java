public class InversionOfArray {
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return mer(arr, 0, arr.length-1);
    }
    static long mer(long[] arr, int l, int h){
        long c=0;
        if(l<h){
            int mid=(l+h)/2;
            c+=mer(arr,l,mid);
            c+=mer(arr,mid+1,h);
            c+=m(arr,l,mid,h);
        }
        return c;
    }
    static long m(long[] arr, int l, int m, int h){
        int n1=m-l+1;
        int n2=h-m;
        long[] left=new long[n1];
        long[] right=new long[n2];
        for(int i=0;i<n1;i++) left[i]=arr[l+i];
        for(int j=0;j<n2;j++) right[j]=arr[m+1+j];
        int i=0, j=0,k=l;
        long c=0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                c+=n1-i;
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
            
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
        return c;
    }
}
