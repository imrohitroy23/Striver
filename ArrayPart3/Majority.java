import java.util.HashMap;

class Majority{
     public int majorityElement(int[] a) {
        int size=a.length;
           HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<size;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<size;i++){
            if(map.get(a[i])>size/2) return a[i];
        }
        return -1;  
    }
}