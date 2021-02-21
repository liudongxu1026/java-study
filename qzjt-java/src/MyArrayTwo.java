/**
 * @Description:
 * @Author:刘东旭
 * @Date: 2021/2/21 0021 20:28
 * @LastEditTime: 2021/2/21 0021 20:28
 * @LastEditors: 刘东旭
 */
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_ADDPeer;

import java.util.Arrays;
public class MyArrayTwo {
    public static void main(String[] args) {
        // 分别指定一维数组二维数组长度
        // [ [0,0,0,0],[0,0,0,0] ]
        int[][] arr1 = new int[2][4];
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr1[0]));
        // 只指定一维数组的长度
        int[][] arr2 = new int[2][];
        System.out.println(Arrays.deepToString(arr2));

        // 静态多维数组
        int[][] arr3 = new int[][]{
            {1,2,3},
            {4,5,6},
            {44,15,56},
        };
        int num = 0;
        for (int i=0; i<arr3.length; i++){
            for (int j=0; j<arr3[i].length; j++){
                num += arr3[i][j];
            }
        }
        System.out.printf("%d\n", num);
//        System.out.println(Arrays.deepToString(arr3));
        //特殊写法 x是一维数组 y是二维数组
//        int [] x,y[];
//        System.out.println(Arrays.toString(x));
//        System.out.println(Arrays.deepToString(y));

        int[][][] arr4 = new int[2][3][4];
        System.out.println(Arrays.deepToString(arr4));
        int[][][] arr5 = new int[2][3][];
        System.out.println(Arrays.deepToString(arr5));
    }
}
