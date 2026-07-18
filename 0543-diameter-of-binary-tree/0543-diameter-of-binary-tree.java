/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDiameter = 0 ;// Global variable to keep track of the maximum diameter
    public int diameterOfBinaryTree(TreeNode root) {

        getHeight(root);
        return maxDiameter;
    }
    public int getHeight(TreeNode node){
        if (node == null) return 0 ; // base case

        int left_height = getHeight(node.left); // height of the left sub tree
        int right_height = getHeight(node.right); // height of the right sub tree

        //update the max diameter if needed
        maxDiameter = Math.max(maxDiameter , left_height + right_height);

        //return the height of the current node
        return 1 + Math.max(left_height,right_height);
    }
}