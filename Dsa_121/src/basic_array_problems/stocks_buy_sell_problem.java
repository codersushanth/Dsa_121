package basic_array_problems;

public class stocks_buy_sell_problem {
static int sell(int nums[]) {
	int curr=nums[0];
	int max=0;
	for(int i=0;i<nums.length;i++) {
		curr=Math.min(curr,nums[i]);
		int profit=nums[i]-curr;
		max=Math.max(max, profit);
		
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int nums[]=new int[] {1,3,4,5,6,20};
 System.out.println(sell(nums));
	}

}
