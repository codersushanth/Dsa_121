package basic_array_problems;

public class finding_max_repeated_elements {

	static int max(int nums[]) {
		int count=0;
		int ret=nums[0];
		for(int nums1:nums) {
			if(count==0) {
				ret=nums1;
			}
			count+=(ret==nums1)?1:-1;
		}
		return ret;
		
	}
	
	public static void main(String[] args) {
		
		int arr[]=new int[] {2,2,1,2,3,2,4};
		int x=max(arr);
		System.out.print(x);
		
	}
}
