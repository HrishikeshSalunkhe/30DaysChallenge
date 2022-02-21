package thirdDay.array;

/**
 * @author Hrishikesh Salunkhe
 * list of visitors in a park for 'n' consecutive days are given
 * Problem Statement:
 * A program to find a record breaker day wehere
 *  days before record day have stricltly minimum number of visitors,
 *  also for one day after record day has minimum number of visitors
 */
public class RecordBreaker {
    public static void main(String[] args) {
        int array[] ={1,2,0,7,2,0,2,2};
        int size = array.length;
        int max=0;
        for (int i = 0; i < array.length; ++i) {
            if(i == array.length-1){
                if(max < array[i]){
                    System.out.println("Yes");
                }
            }
            else{
                if(max < array[i] && array[i]> array[i+1]){
                    System.out.println("Yes");
                }
            }
            if(max < array[i]){
                max =array[i];
            }
        }
    }
}
