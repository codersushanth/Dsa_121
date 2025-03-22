package basic_array_problems;

public class zeroFilledSubarray {
	 public static long zeroFilledSubarray1(int[] nums) {
		   int i=0;
		   long l=0;
		   long count=0;
		   int n=nums.length;
		   while(i<n){
		    l=0;
		    if(nums[i]==0){
		   while(i<n && nums[i]==0){
		     //traversal for zero subarray   
		        l++;
		        i++;
		    }
		    }
		  
		    else{
		        i++;
		    }
		    count+=(l)*(l+1)/2;//formula for subarray
		   }
		   return count;

		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{0,0,0,1,0,0,0};
		System.out.println(zeroFilledSubarray1(arr));
		

	}

}
