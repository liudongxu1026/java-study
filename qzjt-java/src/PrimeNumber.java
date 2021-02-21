/**
 * 质数练习 2021.02.19
 */
public class PrimeNumber {
    public static void main(String[] args) {
        // 质数 13, 1-13 的数字中除 1 以外都无法被 13 整除
        // 非质数 8，1-8中，2 4 可以被 8 整除
        for (int i = 1; i <= 100; i++) {
            int num = 0; //整除次数
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    num++;
                }
            }
            // num=2 的时候表明当前是质数
            // 以 13 为例，只能整除 1和13(其本身)
            if(num == 2){
                System.out.printf("%d 的次数 %d\n", i, num);
            }
        }
    }
}
