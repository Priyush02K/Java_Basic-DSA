package Array;
import java.util.*;
public class Largest_in_array{

    public static int largestvaule (int numbers[]){
        int largest=Integer.MIN_VALUE; //-infinity
        int smallest=Integer.MAX_VALUE; //+

        for(int i=0;i<numbers.length;i++){
            if(largest <numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest value is : "+smallest);
        return largest;
    }  


    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        System.out.println("the largest value of array "+largestvaule(numbers));
    }
}