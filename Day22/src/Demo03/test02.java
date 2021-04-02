package Demo03;

import java.util.function.Supplier;

// 求数组的最大值
public class test02 {
    public static int method( Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int[] nums = {11,22,33,23};
        int max = method(() -> {
            int max1 = nums[0];
            for (int num : nums) {
                max1 = num > max1 ? num:max1;
            }
            return max1;
        });
        System.out.println(max);
    }
}
