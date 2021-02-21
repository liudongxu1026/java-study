/**
 * @Description:
 * @Author:刘东旭
 * @Date: 2021/2/21 0021 20:58
 * @LastEditTime: 2021/2/21 0021 20:58
 * @LastEditors: 刘东旭
 */
public class MyArrayFunction {
    public static void main(String[] args) {
        // 求最大值
        int[] arr1 = new int[]{ 2,5,99,10,100,802,29 };
        int theMax = arr1[0]; //默认是第一位
        for (int i=0; i<arr1.length; i++){
            if(arr1[i] > theMax) theMax = arr1[i];
        }
        System.out.printf("%d", theMax);

    }
}
