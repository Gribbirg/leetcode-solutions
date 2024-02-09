class Solution {
  int maxProfit(List<int> prices) {
    var profit = 0;

    for (int i = 1; i < prices.length; i++) {
      int dif = prices[i] - prices[i - 1];
      if (dif > 0) profit += dif;
    }

    return profit;
  }
}

main() {
  var sol = Solution();
  print(sol.maxProfit([7, 1, 5, 3, 6, 4]));
  print(sol.maxProfit([1, 2, 3, 4, 5]));
  print(sol.maxProfit([7, 6, 4, 3, 1]));
}