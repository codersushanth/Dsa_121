package basic_array_problems;

public class ZeroFilledSubarray2 {
	public static long zeroFilledSubarray(int[] nums) {
		   long zeroCount=0;
		   long count=0;
		   for(int num:nums){
		    if(num==0){
		        zeroCount++;
		        count+=zeroCount;
		    }
		    else{
		        zeroCount=0;
		    }
		   }
		   return count;

		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]=new int[] {0,0,1,2,0};
System.out.println(zeroFilledSubarray(nums));
	}

}
