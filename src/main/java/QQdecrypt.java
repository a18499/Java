import java.util.ArrayList;

/**
 * Created by a1849 on 2016/9/11.
 */
public class QQdecrypt {
    public static void main(String [] args){
        ArrayList cipherdata = new ArrayList();
        ArrayList plaindata = new ArrayList();
        cipherdata.add(6);
        cipherdata.add(3);
        cipherdata.add(1);
        cipherdata.add(7);
        cipherdata.add(5);
        cipherdata.add(8);
        cipherdata.add(9);
        cipherdata.add(2);
        cipherdata.add(4);
        int size = cipherdata.size();
        for (int i=0;i<size;i++){
           System.out.println("plaindata: "+cipherdata.get(0));
           plaindata.add(cipherdata.get(0));
           System.out.println("remove: "+cipherdata.get(0));
           cipherdata.remove(0);
           if(cipherdata.size()>1){
               System.out.println("move: "+cipherdata.get(0));
               cipherdata.add(cipherdata.get(0));
               System.out.println("remove: "+cipherdata.get(0));
               cipherdata.remove(0);
           }
        }
        for (int x=0;x<plaindata.size();x++){
            System.out.print(plaindata.get(x));
        }
    }
}
