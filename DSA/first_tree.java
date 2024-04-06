import java.util.Scanner;
//This is binary tree and all its operation
public class first_tree {
    Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int t){
            this.data= t;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        boolean flag = true;
        first_tree tree = new first_tree();
        int val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any value: ");
        val = sc.nextInt();
        tree.treefunction(val);
        do{
            System.out.println("\nWhat's Next!!");
            System.out.print("Press 1 for insertion || Press 2 for deletion || Press 3 for Printing || Press 4 for Prettier printing:\t");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter any value for insertion:\t");
                    val = sc.nextInt();
                    tree.treefunction(val);
                    break;
                case 2:
                    System.out.print("Enter any value for deletion:\t");
                    val = sc.nextInt();
                    tree.root = tree.delete(tree.root,val);
                    break;
                case 3: 
                    tree.printing(tree.root);
                    break;
                case 4:
                    tree.preetyprinting(tree.root,0);
                    break;
                default:
                    flag = false;
                    break;
            }
        }while(flag);
        sc.close();
    }
    private void preetyprinting(first_tree.Node node, int level) {
        if(node == null) return;
        preetyprinting(node.left, level+1);
        for(int i=0;i<level; i++){
            System.out.print("\t");
        }
        System.out.println("|-------"+node.data);
        preetyprinting(node.right, level+1);
    }
    private Node delete(Node root, int val) {
        if(root.data < val){
            root.right = delete(root.right, val);
        } 
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            if(root.left == null && root.right == null) return null;
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            Node precendence = inorderprecedence(root.right);
            root.data = precendence.data;
            root.right = delete(root.right, precendence.data);
        }  
        return root;     
    }
    private Node inorderprecedence(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    private void printing(first_tree.Node node) {
        if(node.left == null && node.right == null) System.out.print(node.data+" -> ");
        else{
            if(node.left != null)   this.printing(node.left);
            System.out.print(node.data+" -> ");
            if(node.right != null)   this.printing(node.right);
        }
        return;
    }
    private void treefunction(int t) {
        if(root == null) root = new Node(t);
        else{
            if(t<=root.data) root.left = this.insertion(root.left,t);
            else root.right = this.insertion(root.right,t);
        }
    }
    private Node insertion(first_tree.Node node, int t) {
        if(node == null) node = new Node(t);
        else{
            if(t<=node.data) node.left = this.insertion(node.left,t);
            else node.right = this.insertion(node.right,t);
        }
        return node;
    }
}
