import java.util.Scanner;

public class singly_linked_list {
    static Scanner sc = new Scanner(System.in);
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static void main(String[] args) {
        singly_linked_list list = new singly_linked_list();
        boolean flag = true;
        while(flag){
            System.out.println("\nEnter the operation you want to perform in your singly-linked list: ");
            System.out.println("1.Insert\t2.Delete\t3.Display\t4.Insert After\t5.Delete After\t6.Search a Key");
            int s= sc.nextInt();
            switch (s) {
                case 1:
                    list.insert();
                    break;
                case 2:
                    list.delete();
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    list.insertafter();
                    break;
                case 5:
                    list.deleteafter();
                    break;
                case 6:
                    list.searchakey();
                    break;
                default:
                    flag = false;
                    break;
            }
        }
    }
    private void searchakey() {
        short postion = 1;
        boolean flag = true;
        Node cur = head;
        System.out.println("Enter your search key: ");
        int n = sc.nextInt();
        while(cur != null && cur.data != n){
            cur = cur.next;
            postion ++;
        }
        if(cur.data == n) System.out.println("Your key is present in position no."+postion);
        if(flag) System.out.println("No such key is found.");
    }
    private void deleteafter() {
        boolean flag = true;
        System.out.println("Enter the data after which you want to delete: ");
        int n = sc.nextInt();
        if(head == null){}
        else{
            Node cur = head;
            while(cur != null && cur.data != n){
                cur= cur.next;
            }
            if(cur.data == n){
                flag = false;
                cur.next = cur.next.next;
            }
        }
        if(flag)  System.out.println("Sorry, No such reference is found after which your data can be deleted! ");
    }
    private void insertafter() {
        boolean flag = true;
        System.out.println("Enter the data to be inserted: ");
        int d = sc.nextInt();
        System.out.println("Enter the data after which you want to insert: ");
        int n = sc.nextInt();
        if(head == null){}
        else{
            Node cur = head;
            while(cur != null && cur.data != n){
                cur= cur.next;
            }
            if(cur.data == n){
                Node in = new Node(d);
                flag = false;
                Node tem = cur.next;
                cur.next = in;
                in.next = tem;
            }
        }
        if(flag)  System.out.println("Sorry, No such reference is found after which your data can be inserted! ");
    }
    private void display() {
        if(head == null) System.out.println("Sorry, No any data to display!");
        else{
            Node cur = head;
            System.out.println("Your data inside linked list are:");
            while( cur != null){
                System.out.print(cur.data+"\t");
                cur = cur.next;
            }
        }
    }
    private void delete() {
        System.out.println("Enter the data to be deleted: ");
        int d= sc.nextInt();
        boolean flag = true;
        if(head == null){
            System.out.println("Sorry, Your linked list is empty!");
        }
        else if(head.data == d) {
            head = head.next;
            flag = false;
        }
        else{
            Node cur = head;
            while (head.next != null && cur.next != null &&cur.next.data != d) {
                cur = cur.next;
            }
            if(cur.next.data ==d) {
                cur.next = cur.next.next;
                flag = false;
            }
            
        }
        if(flag) System.out.println("Sorry, No such data to b edeleted.");
        
    }
    private void insert() {
        System.out.println("Enter the data to be inserted: ");
        int d= sc.nextInt();
        Node n = new Node(d);
        if(head == null){
            head = n;
        }
        else{
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = n;
        }
        System.out.println("Your data ha been inserted.");
    }
}
