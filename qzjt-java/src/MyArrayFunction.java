/**
 * @Description:
 * @Author:������
 * @Date: 2021/2/21 0021 20:58
 * @LastEditTime: 2021/2/21 0021 20:58
 * @LastEditors: ������
 */
public class MyArrayFunction {
    public static void main(String[] args) {
        // �����ֵ
        int[] arr1 = new int[]{ 2,5,99,10,100,802,29 };
        int theMax = arr1[0]; //Ĭ���ǵ�һλ
        for (int i=0; i<arr1.length; i++){
            if(arr1[i] > theMax) theMax = arr1[i];
        }
        System.out.printf("%d", theMax);

    }
}
