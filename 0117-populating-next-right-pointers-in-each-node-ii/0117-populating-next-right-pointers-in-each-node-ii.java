/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        // Your code goes here.
        Queue<Node> queue = new LinkedList<Node>();
        
        if(root != null) {
        queue.add(root);
        root.next = null;
        Node temp = null;
        while(!queue.isEmpty()) {
            
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                Node prev = temp;
                temp = queue.poll();
                
                if(i>0)
                    prev.next = temp;
                
                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);  
            }
            temp.next = null;   
        }   
        }
        
        return root;
    }
}