/**
 *
 * 153是一个非常优美的数
 * 153=1*1*1+5*5*5+3*3*3
 * 你知道在三位整数（abc）中，满足abc=a*a*a+b*b*b+c*c*c这个条件的最大的整数是什么?
 *
 * 啊哈挑战第一题java版
 * Created by musil on 2016-12-03.
 */
public class testfunction {
    public static void main(String[] args) {
        int a,b,c;
        for(a=9;a>0;a--) {
            for(b=9;b>=0;b--) {
                for(c=9;c>=0;c--) {
                if ((a * 100 + b * 10 + c) == (a * a * a + b * b * b + c * c * c)) {
                    System.out.println("a="+a+"；b="+b+"；c="+c);
                    return;
                }
                }
            }
        }
    }
}
