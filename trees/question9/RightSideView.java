package trees.question9;

import java.util.*;
import trees.definiton.TreeNode;

class Solution {
    List<Integer> res = new ArrayList<>();
    public void bfs(Queue<TreeNode> queue){
        if (queue.isEmpty()) {
            return;
        }
        int ref = -1;
        Queue<TreeNode> drill = new LinkedList<>();
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp == null) continue;
            ref = temp.val;
            drill.add(temp.left);
            drill.add(temp.right);
        }
        res.add(ref);
        bfs(drill);
    }
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> imp = new LinkedList<>();
        imp.add(root);
        bfs(imp);
        res.remove(new Integer(-1));
        return res;
    }
}

public class RightSideView {

    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.rightSideView(new TreeNode(1, new TreeNode(2, new TreeNode(4, null, new TreeNode(5)), null), new TreeNode(3))));
    }
}