/**
 * ��ӡ hello world ����
 * @author liudongxu
 * @version 1.0
 */
public class Test {
    // main �����ǳ������
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "hello";
        str1 = "hello java"; //��str1�޸ĺ�str1���ڴ��ַû�иı䣬str2�����·����ڴ��ַ
        int hello = System.identityHashCode(str1); // 366712642
        int hello2 = System.identityHashCode(str2);// 366712642 --> 1829164700
        System.out.println(hello);
        System.out.println(hello2);
    }
}