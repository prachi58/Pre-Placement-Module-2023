<<<<<<< HEAD
class Solution {
  public int[] sortedSquares(int[] A) {
    final int n = A.length;
    int[] ans = new int[n];
    int i = n - 1;

    for (int l = 0, r = n - 1; l <= r;)
      if (Math.abs(A[l]) > Math.abs(A[r]))
        ans[i--] = A[l] * A[l++];
      else
        ans[i--] = A[r] * A[r--];

    return ans;
  }
=======
class Solution {
  public int[] sortedSquares(int[] A) {
    final int n = A.length;
    int[] ans = new int[n];
    int i = n - 1;

    for (int l = 0, r = n - 1; l <= r;)
      if (Math.abs(A[l]) > Math.abs(A[r]))
        ans[i--] = A[l] * A[l++];
      else
        ans[i--] = A[r] * A[r--];

    return ans;
  }
>>>>>>> 5f5b1e22131ee23d547d0cf325b77303ee0a02f3
}