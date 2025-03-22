package basic_array_problems;

public class stock_sell_problem2 {
static int sell(int nums[]) {
	int profit=0;
	int buy=nums[0];
	for (int i = 1; i < nums.length; i++) {
		if(nums[i]>buy) {
			profit+=nums[i]-buy;
		}
		buy=nums[i];
	}
	return profit;
} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]=new int[] {1,2,7,10,500};
		System.out.println(sell(nums));

	}

}
