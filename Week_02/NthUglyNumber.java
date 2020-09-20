package week02.homework;

import java.util.TreeSet;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/9/20 17:44
 *
 */
public class NthUglyNumber {

    //暴力法——时间超时
    public int nthUglyNumber(int n) {
        int index=0;
        for (int i=0;;i++){
            if (isUgly(i)){
                index++;
                if(index==n){
                    return i;
                }

            }
        }

    }

    public boolean isUgly(int n){
        if (n<1){
            return false;
        }
        while (n%2==0){
            n/=2;
        }
        while (n%3==0){
            n/=3;
        }
        while (n%5==0){
            n/=5;
        }
        return n==1;
    }



    //将丑数加入set，再每次弹出最小的一个，第n个即为第n次弹出的最小值
    public int nthUglyNumber1(int n) {
        TreeSet<Long> set = new TreeSet<Long>();
        int count = 0;
        long result = 1;
        set.add(result);
        while (count < n) {
            result = set.pollFirst();
            count++;
            set.add(result * 2);
            set.add(result * 3);
            set.add(result * 5);
        }
        return (int) result;
    }




}
