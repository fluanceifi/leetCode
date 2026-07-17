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
import java.util.*;
import java.io.*;

class Solution {
    public static StringBuilder sb;
    public static List<Integer> answer;

    public List<Integer> preorderTraversal(TreeNode root) {
        sb = new StringBuilder();
        answer = new ArrayList<>();

        traversal(root);

        return answer;
    }

    public void traversal(TreeNode node) {
        if(node == null) {
            return;
        }

        answer.add(node.val);

        traversal(node.left);
        traversal(node.right);
    }


}