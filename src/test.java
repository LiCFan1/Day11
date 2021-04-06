import java.util.Arrays;

public class test {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] n1 =new int[m];
        System.arraycopy(nums1,0,n1,0,m);
        int i = 0;
        int j = 0;
        while( i < m && j < n){
            if(n1[i] > nums2[j]){
                nums1[i+j] = nums2[j];
                j += 1;
            }else{
                nums1[i+j] = n1[i];
                i += 1;
            }
        }
        if( i >= m){
            while(j<n){
                nums1[i+j] = nums2[j];
                j++;
            }
        }else if(j >= n){
            while(i<m){
                nums1[i+j] = n1[i];
                i++;
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,5,6};
        merge(a,3,b,3);
        System.out.println(Arrays.toString(a));
    }
}
