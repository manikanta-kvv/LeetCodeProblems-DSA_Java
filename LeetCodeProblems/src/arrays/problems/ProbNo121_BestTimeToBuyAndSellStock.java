package arrays.problems;

public class ProbNo121_BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int res = maxProfit(prices);
		System.out.println(res);
		
	}
	
	public static int maxProfit(int[] prices) {
		int leastSoFar = Integer.MAX_VALUE;
		int overAllProfit = 0;
		int profitIfSoldToday = 0;
		for(int i = 0; i<prices.length; i++) {
			if(prices[i] < leastSoFar) {
				leastSoFar = prices[i];
			}
			profitIfSoldToday = prices[i] - leastSoFar;
			if( overAllProfit < profitIfSoldToday) {
				overAllProfit = profitIfSoldToday;
			}
		}
		return overAllProfit;
    }
}
