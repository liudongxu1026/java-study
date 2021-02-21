/**
 * @Description: 数组学习
 * @Author:刘东旭
 * @Date: 2021/2/19 0019 13:22
 * @LastEditTime: 2021/2/19 0019 13:22
 * @LastEditors: 刘东旭
 */
import java.util.Arrays;
public class MyArray {
    public static void main(String[] args) {
        int[] arr1 = new int[3]; //声明可以放 3 个 int 类型的数组,默认值是 0
        System.out.println(Arrays.toString(arr1));
        float[] arr2 = new float[]{1.1f,2.0f,3.2f};
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[0]);
        System.out.println(arr2.length);
    }
}
