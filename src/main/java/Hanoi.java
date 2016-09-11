/**
 * Created by a1849 on 2016/9/11.
 */
public class Hanoi {
    public void hanoi(int num,String A,String B,String C){
        if(num == 1){
            System.out.println("Move "+num+" from "+A+"  to "+C);

        }else {
            hanoi(num-1,A,C,B);
            System.out.println("Move "+num+" from "+A+"  to "+C);
            hanoi(num-1,B,A,C);
        }
    }
    public static void main(String [] args){
        Hanoi test = new Hanoi();
        test.hanoi(4,"A","B","C");
    }
}
