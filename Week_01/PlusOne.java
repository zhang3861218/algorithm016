package week01.homework;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/9/13 21:03
 *
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }else{
                digits[i]=0;
                if (i==0){
                    digits=new int[digits.length+1];
                    digits[0]=1;

                }
            }

        }
        return digits;
    }


    public static void main(String[] args) {
        PlusOne po=new PlusOne();
        int[] array1={9,9};
        int[] array=po.plusOne(array1);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
