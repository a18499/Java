import java.util.ArrayList;
import java.util.Random;

/**
 * Created by a1849 on 2016/9/4.
 */
public class Algorithm {
    ArrayList<Integer> Numbers;
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
    public  ArrayList<Integer> quicksort(ArrayList<Integer> numbers ,int left,int right){
           Numbers = numbers;
            quicksortcore(left, right);
            return Numbers;
    }
    protected void quicksortcore(int left,int right){
        int temp,leftPointer,rightPointer,base;
        if(left>right){
            return;
        }
        base = Numbers.get(left);
        leftPointer = left;
        rightPointer=right;
        while (leftPointer!=rightPointer){
            while (Numbers.get(rightPointer)>=base&&leftPointer< rightPointer){
                rightPointer--;

            }
            while (Numbers.get(leftPointer)<=base&&leftPointer<rightPointer){
                leftPointer++;
            }
            if( leftPointer< rightPointer){
                temp=Numbers.get(leftPointer);
                Numbers.set(leftPointer,Numbers.get(rightPointer));
                Numbers.set(rightPointer,temp);
            }

        }

        Numbers.set(left,Numbers.get(leftPointer));
        Numbers.set(leftPointer,base);
        quicksortcore(left,leftPointer-1);
        quicksortcore(leftPointer+1,right);
    }
    public static void main(String [] args){
        Algorithm algorithm = new Algorithm();
        ArrayList<Integer> testArray = new ArrayList<>();
        ArrayList<Integer> resulttestArray ;
        Random r = new Random();
        for(int i=0;i<1000;i++){
            testArray.add(r.nextInt(1000));
        }
        for(int each : testArray){
            System.out.println(each);
        }
        System.out.println("Begin to Sort");
        //resulttestArray = algorithm.bubbleSort(testArray);
        resulttestArray = algorithm.quicksort(testArray,0,testArray.size()-1);
        for(int each : resulttestArray){
            System.out.println(each);
        }
    }
}
