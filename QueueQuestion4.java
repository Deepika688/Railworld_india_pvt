package Railworld_India_PVT_Task;

import java.util.*;
class QueueQuestion4 {
    /* A binary tree Node has data, pointer
    to left child and a pointer to right
    child */
    static class Node{
        int data;
        Node left;
        Node right;
    }

    /* Helper function that allocates a new node with the
    given data and NULL left and right pointers. */
    static Node newNode(int data){
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }

    static void dfs(Node root, Map<Integer, Integer> unmap, int depth){
        if(root == null) return;

        // Increment the count of nodes at depth in map
        if(unmap.containsKey(depth)){
            unmap.put(depth, unmap.get(depth)+1);
        }else{
            unmap.put(depth, 1);
        }
        // unmap.put(depth, unmap.get(depth) + 1);
        dfs(root.left, unmap, depth+1);
        dfs(root.right, unmap, depth+1);
    }

    // function to find the level
    // having maximum number of Nodes
    static int maxNodeLevel(Node root){
        Map<Integer, Integer> unmap = new HashMap<Integer, Integer>();
        dfs(root, unmap, 0);
        int maxx = Integer.MIN_VALUE;
        int result = 0;

        for(Integer i : unmap.keySet()){
            if(unmap.get(i) > maxx){
                result = i;
                maxx = unmap.get(i);
            }
            else if(unmap.get(i) == maxx){
                result = Math.min(result, i);
            }
            // System.out.println(i + " -> " + unmap.get(i));
        }
        return result;
    }

    // Driver program to test above
    public static void main(String[] args)
    {
        // binary tree formation
        Node root = newNode(2);           /*        2         */
        root.left        = newNode(1);    /*      /   \       */
        root.right       = newNode(3);    /*     1     3      */
        root.left.left  = newNode(4);     /*   /   \    \     */
        root.left.right = newNode(6);     /*  4     6    8    */
        root.right.right  = newNode(8);   /*       /          */
        root.left.right.left = newNode(5);/*      5           */

        System.out.println("Level having maximum number of Nodes : " + maxNodeLevel(root));
    }
}

