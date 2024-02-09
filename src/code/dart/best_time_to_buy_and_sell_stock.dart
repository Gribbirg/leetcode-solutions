import 'dart:math';

class Solution {
  int maxProfit(List<int> prices) {
    var maxProfit = 0;
    var minValue = prices.first;
    for (var i = 1; i < prices.length; i++) {
      if (prices[i] > minValue)
        maxProfit = max(maxProfit, prices[i] - minValue);
      else
        minValue = prices[i];
    }
    return maxProfit;
  }
}

main() {
  var sol = Solution();
  print(sol.maxProfit([7, 1, 5, 3, 6, 4]));
  print(sol.maxProfit([7, 6, 4, 3, 1]));
}
