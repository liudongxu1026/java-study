// 练习for
public class ForDemo {
    // demo1
//    public static void main(String[] args){
//        for(int i = 0; i<150; i++){
//            String str = i + "";
//            // 3的倍数
//            if(i % 3 == 0){
//                str += " a";
//            }
//            // 5的倍数
//            if(i % 5 == 0){
//                str += " b";
//            }
//            // 7的倍数
//            if(i % 7 == 0){
//                str += " c";
//            }
//            System.out.println(str);
//        }
//    }
    // demo2
//    public static void main(String[] args){
//        int total = 0;
//        for (int i = 0; i<100; i++){
//            if(i % 2 == 1)
//                total+=i;
//        }
//        System.out.println(total);
//    }
    // demo3
//    public static void main(String[] args){
//        int total = 0;
//        int num = 0;
//        for (int i = 0; i<100; i++){
//            if(i % 7 == 0){
//                num += 1;
//                total += i;
//            }
//        }
//        System.out.println("共有" + num + "个，总计" + total);
//    }
    // demo4
    public static void main(String[] args){
        for (int i = 100; i<=999; i++){
            int hundred = i / 100; //百位数
            int tens = (i % 100) / 10 ; //十位数
            int units =  i-(hundred*100)-(tens*10); //个位数
            int result = (hundred*hundred*hundred) + (tens*tens*tens) + (units*units*units);
            if(result == i){
                System.out.printf("%d, %d, %d, %d\n",i, hundred ,tens , units);
            }
        }
    }
}
