public class Solution {
    TreeNode p,q;  
    TreeNode pre;  
    public void recoverTree(TreeNode root) {  
        if (root == null) return;  
        getWrong(root);  
        int tmp = p.val;  
        p.val = q.val;  
        q.val = tmp;  
    }  
    public void getWrong(TreeNode root) {  
        if (root == null) return;  
        getWrong(root.left);  
        if (pre != null && root.val < pre.val) {  
            if (p == null) {  
                p = pre;  
            }  
            q = root;  
        }  
        pre = root; // 
        getWrong(root.right);  
    }  
}