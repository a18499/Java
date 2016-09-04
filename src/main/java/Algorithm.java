import java.util.ArrayList;
import java.util.Random;

/**
 * Created by a1849 on 2016/9/4.
 */
public class Algorithm {
    public ArrayList<Integer> bubbleSort(ArrayList<Integer> numbers){

        int temp;
        System.out.println("Num Size: "+numbers.size());
        for(int i=1;i<=numbers.size()-1;i++){
            for(int j=0;j<numbers.size()-i;j++){
                if(numbers.get(j)<numbers.get(j+1)){
                    temp = numbers.get(j);
                    numbers.set(j,numbers.get(j+1));
                    numbers.set(j+1,temp);
                }
            }
        }
        return  numbers;
    }

    public static void main(String [] args){
        Algorithm algorithm = new Algorithm();
        ArrayList<Integer> testArray = new ArrayList<>();
        ArrayList<Integer> resulttestArray ;
        Random r = new Random();
        for(int i=0;i<10;i++){
            testArray.add(r.nextInt(1000));
        }
        System.out.println("Begin to Sort");
        resulttestArray = algorithm.bubbleSort(testArray);
        for(int each : resulttestArray){
            System.out.println(each);
        }
    }
}
