import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StockSpanner {
  List<Integer> list;

  public StockSpanner() {
    this.list = new ArrayList<>();
  }

  public int next(int price) {
    list.add(price);
    int count = 0;
    for (int i = list.size() - 1; i >= 0; i--) {
      if (list.get(i) > price)
        break;
      count++;
    }
    return count;
  }

  public int[] calculateSpans(int[] prices) {
    int[] spans = new int[prices.length];
    spans[0] = 1; 

    Stack<Integer> indexStack = new Stack<>();
    indexStack.push(0);

    for (int i = 1; i < prices.length; i++) {
      while (!indexStack.isEmpty()
          && prices[indexStack.peek()] < prices[i])
        indexStack.pop();
      if (indexStack.isEmpty())
        spans[i] = i + 1;
      else
        spans[i] = i - indexStack.peek();
      indexStack.push(i);
    }
    return spans;
  }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */