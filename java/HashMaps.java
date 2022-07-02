/**
 * HashMaps
 */
import java.lang.reflect.Array;
import java.util.*;
public class HashMaps {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        //string on the left is the key and on the right is the value
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        hashMap.put("a",a);
        hashMap.put("b",b);
        hashMap.put("c",c);

        System.out.println(hashMap.values());
        hashMap.clear();

        //geting the value of the hash map acording to key or value
        hashMap.put("a",a);
        hashMap.put("b",b);
        hashMap.put("c",c);

        System.out.println(hashMap.get("b"));
        hashMap.clear();

        /*
            Problem: Two Sum
            Given an array of integers, return the indices fo two numbers 
            such that they add up to a specific target
        */
        
        int[] numbers = {2, 1, 5, 3};
        int target = 4;
        int[] res = towSum(numbers, target);
        System.out.println("["+res[0] + "," + res[1]+"]");

        List<String> list = new ArrayList<>();
        list.add("Hello-123");
        
        list.add(list.get(0).replace("-","/"));
        
        System.out.println(list);


    }

    public static int[] towSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i <= nums.length; i++) {
            int pintTargetDifference = target - nums[i];
            //hashMap2.put(nums[i],i);
            if (hashMap2.containsKey(pintTargetDifference)){
                return new int[] {hashMap2.get(pintTargetDifference),i};
            } 
            hashMap2.put(nums[i], i);
        }
        throw new IllegalArgumentException("Not Found");
    }
}