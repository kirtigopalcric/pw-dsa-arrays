import java.util.Arrays;

public class DuplicateChecker {
    public static void main(String[] args) {
        
        int nums[] = {1,2,3,1};

        Boolean duplicate = isDuplicate(nums);// store method value

        System.out.println(duplicate);//print
      
    }
    public static Boolean isDuplicate(int nums[]) {

         // Sort the array in ascending order
         Arrays.sort(nums);

        //Iterate through  an array
        for(int i=0;i<nums.length-1;i++){
            //check adjacent
            for(int j=i+1;j<nums.length;j++){
                //Check is it match or not
                if(nums[i] == nums[j]){
                    return true;//Duplicate found
                }
            }
        }
        return false;//No duplicate found
    }
}

