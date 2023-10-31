public class MoveZeroes {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[c++]=arr[i];
            }
        }
        while(c<n){
            arr[c++]=0;
        }
        
    }
}
