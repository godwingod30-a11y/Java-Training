package Day23;

import java.util.*;

public class Problem11 {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, count = 0;

        for (int n : nums) {
            sum += n;
            int rem = ((sum % k) + k) % k;

            count += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}
