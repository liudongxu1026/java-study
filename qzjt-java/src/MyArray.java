/**
 * @Description: ����ѧϰ
 * @Author:������
 * @Date: 2021/2/19 0019 13:22
 * @LastEditTime: 2021/2/19 0019 13:22
 * @LastEditors: ������
 */
import java.util.Arrays;
public class MyArray {
    public static void main(String[] args) {
        int[] arr1 = new int[3]; //�������Է� 3 �� int ���͵�����,Ĭ��ֵ�� 0
        System.out.println(Arrays.toString(arr1));
        float[] arr2 = new float[]{1.1f,2.0f,3.2f};
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[0]);
        System.out.println(arr2.length);
    }
}
