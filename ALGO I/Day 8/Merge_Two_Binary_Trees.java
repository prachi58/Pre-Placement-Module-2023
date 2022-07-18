class Solution {
   public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

      if (root1 == null && root2 == null)
         return null;

      int val = (root1 != null ? root1.val : 0) + (root2 != null ? root2.val : 0);

      return new TreeNode(
              val,
              mergeTrees(root1 == null ? null : root1.left, root2 == null ? null : root2.left),
              mergeTrees(root1 == null ? null : root1.right, root2 == null ? null : root2.right)
      );
   }
}