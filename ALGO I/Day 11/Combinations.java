class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(1, n, k, new ArrayList<Integer>(), res);
        return res;
    }
    
    private void backTrack(int curNum, int n, int k, List<Integer> combo, List<List<Integer>> res) {
        if (combo.size() == k) {
            res.add(new ArrayList<>(combo));
            return;
        }
        if (curNum > n) {
            return;
        }
        // add current number
        combo.add(curNum);
        backTrack(curNum + 1, n, k, combo, res);
        // backtrack, revert previous operation
        combo.remove(combo.size() - 1);
        
        // ignore current number
        backTrack(curNum + 1, n, k, combo, res);
    }
}