import java.util.Scanner;

public class findMin {
    public static String findMinValue(int[] array){
        int min = array[0];
        int position = 0;
        String resultString = "";
        for (int i = 1; i< array.length; i++){
            if(min>array[i]){
                min = array[i];
                position = i;
            }
        }
        resultString = "min = "+min+" at position "+ position;
        return resultString ;
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,1,5,6,0,-2,11};
        System.out.println(findMinValue(array));
    }
}
