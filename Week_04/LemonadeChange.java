package week04.homework;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/10/11 22:51
 *
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for (int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five++;
            }else if(bills[i]==10){
                if(five==0){
                    return false;
                }else{
                    five--;
                    ten++;
                }
            }else if(bills[i]==20){
                if(five==0||(five<3&&ten==0)){
                    return false;
                }else if(five>0&&ten>0){
                    ten--;
                    five--;
                }else if(five>2&&ten==0){
                    five-=3;
                }
            }
        }
        return true;
    }
}
