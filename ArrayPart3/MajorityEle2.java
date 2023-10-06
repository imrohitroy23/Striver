import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityEle2 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>(nums.length/3)){
                list.add(nums[i]);
                map.replace(nums[i],Integer.MIN_VALUE);
            }
        }
        return list;
    }
    
}
