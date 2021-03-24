package Day15;

import java.util.Objects;

public class test01 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int[] arr1 = null;
        int element = getElement(arr1,4);
        System.out.println(element);
    }

    public static int getElement(int[] arr,int n){
        Objects.requireNonNull(arr,"参数为空!");
        if( n < 0 || n > arr.length-1){
            throw new ArrayIndexOutOfBoundsException("越界了哦");
        }
        int element = arr[n];
        return element;
    }
}
