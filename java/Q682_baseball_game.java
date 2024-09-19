import java.util.Stack;

public class Q682_baseball_game {
    public int calPoints(String[] operations) {
        if (operations == null || operations.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (String op: operations) {
            if (op.equals("+")) {
                if (stack.size() >= 2) {
                    int e1 = stack.pop();
                    int e2 = stack.peek();
                    int twoSum = e1 + e2;
                    sum += twoSum;
                    stack.push(e1);
                    stack.push(twoSum);
                }
            } else if (op.equals("D")) {
                if (!stack.isEmpty()) {
                    int doubledScore = stack.peek() * 2;
                    sum += doubledScore;
                    stack.push(doubledScore);
                }
            } else if (op.equals("C")) {
                if (!stack.isEmpty()) {
                    int lastScore = stack.pop();
                    sum -= lastScore;
                }
            } else {
                int now = Integer.parseInt(op);
                sum += now;
                stack.push(now);
            }
        }
        
        return sum;
    }
}