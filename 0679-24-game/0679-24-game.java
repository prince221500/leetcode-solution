import java.util.*;

class Solution {
    private static final double EPS = 1e-6;

    public boolean judgePoint24(int[] cards) {
        List<Double> nums = new ArrayList<>();
        for (int c : cards) nums.add((double) c);
        return dfs(nums);
    }

    private boolean dfs(List<Double> nums) {
        
        if (nums.size() == 1) {
            return Math.abs(nums.get(0) - 24) < EPS;
        }

        
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {

               
                List<Double> candidates = generate(nums.get(i), nums.get(j));

               
                List<Double> rest = new ArrayList<>();
                for (int k = 0; k < nums.size(); k++) {
                    if (k != i && k != j) rest.add(nums.get(k));
                }

                
                for (double c : candidates) {
                    List<Double> next = new ArrayList<>(rest);
                    next.add(c);
                    if (dfs(next)) return true;
                }
            }
        }

        return false;
    }

    private List<Double> generate(double a, double b) {
        List<Double> res = new ArrayList<>();
        res.add(a + b);
        res.add(a - b);
        res.add(b - a);
        res.add(a * b);
        if (Math.abs(b) > EPS) res.add(a / b);
        if (Math.abs(a) > EPS) res.add(b / a);
        return res;
    }
}
