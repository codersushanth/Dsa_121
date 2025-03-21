package basic_array_problems;
//The **Boyer-Moore Voting Algorithm** finds the majority element in **O(n) time** using a counter.
//It keeps a **candidate** and increases the counter for matches. 
//If the counter reaches **zero**, it picks a new candidate. The final candidate is the majority element. 🚀
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
