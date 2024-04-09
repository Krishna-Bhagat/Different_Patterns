public class AVL_tree {
    public Node root;
    static class Node{
        private int data;
        int height;
        Node left;
        Node right;
        public Node(int val){
            this.data = val;
            this.height =0;
        }
        public Node(){}
    }

    public int height(Node node){
        if(node == null)    return -1;
        else return Math.max(height(node.left),height(node.right)) +1;
    }

    public void insert(int value){
        this.root = this.insert(root, value);
        return;
    }

    private Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }
        if(node.data < value){
            node.right = this.insert(node.right, value);
        }
        else{
            node.left = this.insert(node.left, value);
        }
        return rotate(node);
    }

    private Node rotate(Node node){
        //incase left side is heavy
        if(height(node.left) - height(node.right) >1){
            //left-left case
            if(height(node.left.left) - height(node.left.right) >0){
                return rightRotate(node);
            }
            //left-right case
            if(height(node.left.right) - height(node.left.left) >0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        //incase right side is heavy
        if(height(node.right) - height(node.left) >1){
            //right-right case
            if(height(node.right.right) - height(node.right.left) >0){
                return leftRotate(node);
            }
            //right-left case
            if(height(node.right.left) - height(node.right.right) >0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1;
        return node;
    }

    private Node rightRotate(Node node){
        Node child = node.left;
        Node rightgrandchild = child.right;

        child.right = node;
        node.left = rightgrandchild;

        node.height = Math.max(height(node.left),height(node.right)) + 1;
        child.height = Math.max(height(child.left),height(child.right)) + 1;
        return child;
    }

    private Node leftRotate(Node node){
        Node child = node.right;
        Node leftgrandchild = child.left;

        child.left = node;
        node.right = leftgrandchild;

        node.height = Math.max(height(node.left),height(node.right)) + 1;
        child.height = Math.max(height(child.left),height(child.right)) + 1;
        return child;
    }

    public void display(Node node, int level){
        if(node == null) return;
        display(node.left,level+1);
        for(int i=0;i<level; i++){
            System.out.print("\t");
        }
        System.out.println("|------>"+node.data);
        display(node.right, level+1);
        return;
    }
    public static void main(String[] args) {
        AVL_tree tree = new AVL_tree();
        for(int i=15; i>0; i--){
            tree.insert(i);
        }
        tree.display(tree.root, 0);
        return;
    }
}