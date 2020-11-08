package week08.homework;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/11/8 23:27
 *
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n<=0){
            return true;
        }
        return (n&(n-1))==0;
    }
}
