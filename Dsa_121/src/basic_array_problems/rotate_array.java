package basic_array_problems;

public class rotate_array {
static void rotate(int nums[],int k) {
	
	
	int n=nums.length;
	shuffle(nums,0,n-1);
	shuffle(nums,0,k-1);
	shuffle(nums,k,n-1);
	
}

	private static void shuffle(int[] nums, int start, int end) {
	// TODO Auto-generated method stub
	while(start<=end) {
		int temp=nums[start];
		nums[start]=nums[end];
		nums[end]=temp;
		start++;
		end--;
		
	}
}

	public static void main(String[] args) {
	int nums[]=new int[] {1,2,3,4,5,6,7};
	rotate(nums,3);
	for(int i=0;i<nums.length;i++) {
		System.out.print(nums[i]+" ");
	}

	}

}
