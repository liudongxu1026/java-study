/**
 * ������ϰ 2021.02.19
 */
public class PrimeNumber {
    public static void main(String[] args) {
        // ���� 13, 1-13 �������г� 1 ���ⶼ�޷��� 13 ����
        // ������ 8��1-8�У�2 4 ���Ա� 8 ����
        for (int i = 1; i <= 100; i++) {
            int num = 0; //��������
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    num++;
                }
            }
            // num=2 ��ʱ�������ǰ������
            // �� 13 Ϊ����ֻ������ 1��13(�䱾��)
            if(num == 2){
                System.out.printf("%d �Ĵ��� %d\n", i, num);
            }
        }
    }
}
