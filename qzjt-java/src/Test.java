/**
 * 打印 hello world 的类
 * @author liudongxu
 * @version 1.0
 */
public class Test {
    // main 方法是程序入口
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "hello";
        str1 = "hello java"; //将str1修改后，str1的内存地址没有改变，str2被重新分配内存地址
        int hello = System.identityHashCode(str1); // 366712642
        int hello2 = System.identityHashCode(str2);// 366712642 --> 1829164700
        System.out.println(hello);
        System.out.println(hello2);
    }
}