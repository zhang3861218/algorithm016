package week08.homework;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/11/8 23:10
 *
 */
public class HammingWeight {
    public int hammingWeight(int n) {
        int sum=0;
        while(n!=0){
            sum++;
            n &= n-1;//每次n&(n-1)都会使最右边的1变为0
        }
        return sum;
    }
}
