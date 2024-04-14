
public class Segment_tree {
    Node root;
    private static class Node{
        int data;
        int leftindex;
        int rightindex;
        Node left;
        Node right;
        Node(){}
        Node(int left, int right){
            this.leftindex = left;
            this.rightindex = right;
        }
    }
    public void construct(int[] arr){
        this.root = insert(arr,0,arr.length-1);
    }

    private Node insert(int[] arr, int start, int end){
        if(start == end){
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }
        Node tem = new Node(start,end);
        int mid = start + (end - start)/2;
        tem.left = insert(arr, start, mid);
        tem.right = insert(arr, mid+1, end);
        tem.data = tem.left.data + tem.right.data;
        return tem;
    }
    public void display(){
        this.print(this.root, 0);
    }

    private void print(Node node, int level){
        if(node == null) return;
        print(node.left,level+1);
        for(int i=0; i<level; i++){
            System.out.print(" \t\t  ");
        }
        System.out.println("|-----> ["+node.leftindex+","+node.rightindex+"] | "+node.data);
        print(node.right, level+1);
    }
    public int query(int start, int end){
        return this.queryhelper(this.root, start, end);
    }
    private int queryhelper(Node node, int start, int end){
        if(node.leftindex>=start && node.rightindex <= end) return node.data;
        else if(node.rightindex < start || node.leftindex > end) return 0;
        else{
            return this.queryhelper(node.left, start, end) + this.queryhelper(node.right, start, end);
        }
    }
    public void update(int index, int newvalue){
        this.updatehelper(this.root, index, newvalue);
    }
    private void updatehelper(Node node, int index, int newvalue){
        if(node.leftindex == node.rightindex && node.leftindex == index){
            node.data = newvalue;
            return;
        }
        if(node.leftindex <= index && node.rightindex >= index){
            int mid = node.leftindex+ (node.rightindex-node.leftindex)/2;
            if(node.leftindex <= index && index <= mid)    updatehelper(node.left, index, newvalue);
            else updatehelper(node.right, index, newvalue);
            node.data = node.left.data + node.right.data;
        }
        else return;
    }
    public static void main(String[] args) {
        Segment_tree tree = new Segment_tree();
        int[] arr = {3,8,7,6,-2,-8,4,9};
        tree.construct(arr);
        tree.display();
        int sum = tree.query(2, 5);
        System.out.println("\nSum is: "+sum);
        tree.update(0,1);
        tree.display();
    }
}
