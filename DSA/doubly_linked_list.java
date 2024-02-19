import java.util.Scanner;

public class doubly_linked_list {
    Node head;
    Node tail;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public void insert(int tem){
        Node newnode = new Node(tem);
        if(head == null && tail == null){
            head =newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void print(){
        Node tem = head;
        System.out.println("Your elements in Linked List are: ");
        while(tem != tail){
            System.out.print(tem.data + "\t");
            tem = tem.next;
        }
        System.out.print(tem.data + "\t");
    }
    public void delete(int tem){
        Node temp = head;
        Node pre = null;
        if(temp.data == tem){
            head = temp.next;
            return;
        }
        else{
            boolean flag = true;
            while(flag){
                pre = temp;
                temp = temp.next;
                if(temp.data == tem){
                    pre.next = temp.next;
                    flag = false;
                }
                if(temp == null) return;
            }
        }
    }
    public void search(int d){
        Node tem = head;
        boolean flag = true;
        while(flag){
            if(tem.data == d){
                System.out.print("Yess, Your data is found in this linked list.");
                flag = false;
            }
            else{
                tem = tem.next;
            }
        }
    }
    public static void main(String[] args) {
        doubly_linked_list list = new doubly_linked_list();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Which Operation do you want to perfome??");
            System.out.println("Press '1' for insertion.\nPress '2' for deletion.");
            System.out.println("Press '3' for printing all elements.\nPress '4' for searching any element.");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.print("Enter the element to be inserted:\t");
                    int d = sc.nextInt();
                    list.insert(d);
                    break;
                case 2:
                    System.out.print("Enter the element to be deleted:\t");
                    int t = sc.nextInt();
                    list.delete(t);
                    break;
                case 3:
                    list.print();
                    break;
                case 4:
                    System.out.print("Enter the element to be searched:\t");
                    int s = sc.nextInt();
                    list.search(s);
                    break;
                default:
                    flag = false;
                    break;
            }
        }
        sc.close();
    }
}
