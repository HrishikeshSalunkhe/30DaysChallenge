package thirdDay.array;

/**
 * @author  Hrishikesh Salunkhe
 *
 */
public class SubarrayForGivenSum {
    public static void main(String[] args) {
        int array[] ={1,3,2,8};
        int size = array.length;
        int s =5;
        int i=0, j=0,start = -1;
        int end =  -1,sum =0;
        while(j<size && sum+array[j] < s ){
            sum += array[j];
            j++;
        }
        if(sum == s){
            System.out.println(i+1 +" "+ j);
            return;
        }
        while(j<size){
            sum += array[j];
            while(sum > s){
                sum -=array[i];
                i++;
            }
            if(sum == s){
                start =i+1;
                end = j+1;
                break;
            }
            j++;
        }
        System.out.println(start +" "+end);

    }
}
