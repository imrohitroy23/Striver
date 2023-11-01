public class frequenciesofArray {
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            if(arr[i]<=N)
            {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }
        int q=0;
        for(int i=0;i<N;i++)
        {
            if(map.get(i+1)==null)
            {
                arr[i]=0;
            }
            else
            arr[i]=map.get(i+1);
        }
    }
}
