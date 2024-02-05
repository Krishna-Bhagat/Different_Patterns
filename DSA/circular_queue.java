import java.util.Scanner;

public class circular_queue {
    static Scanner sc = new Scanner(System.in);
    static int front = -1;
    static int rear = -1;
    static int size;
    circular_queue(){
        System.out.print("Enter the size of your circular queue: ");
        size = sc.nextInt();
    }
    public static void main(String[] args) {
        circular_queue a = new circular_queue();
        int[] array = new int[size];
        System.out.println("Which operation do you want to do in your Circular Queue: ");
        while(true){
            boolean flag = false;
            System.out.println("Press '1' to Enqueue a Value.\nPress '2' to Dequeue a Value.\nPress '3' to Display all Values.");
            switch (sc.nextInt()) {
                case 1:
                    enqueue(array);
                    break;
                case 2:
                    dequeue(array);
                    break;
                case 3:
                    display(array);
                    break;
                default:
                    flag = true;
                    break;
            }
            if(flag) break;  
        }
    }
    private static void display(int[] array) {
        if(front==-1 && rear ==-1){
            System.out.println("Sorry! your queue is empty. No any value to display.\n");
        }
        else{
            System.out.println("your elements in your queuue: ");
            int i=front;
            while(true){
                System.out.print(array[i]+"\t");
                if(i==size-1 && i!= rear) i=0;
                else if(i == rear) break;
                else ++i;
            }
            System.out.println();
        }
    }
    private static void dequeue(int[] array) {
        if(front==-1 && rear ==-1){
            System.out.println("Sorry! your queue is empty. No any value to dequeue.\n");
        }
        else if(front== rear){
            System.out.println("Your Dequeued value is: "+array[front]);
            front=-1;
            rear=-1;
        }
        else{
            System.out.println("Your Dequeued value is: "+array[front]);
            if(front+1==size && rear < front) front=0;
            else front++;
        }
    }
    private static void enqueue(int[] array) {
        System.out.print("Enter a value enqueue a value inside your Queue: ");
        int value = sc.nextInt();
        if(front==-1 && rear == -1){
            front++;
            rear++;
            array[rear] = value;
        }
        else if((rear +1)%size == front){
            System.out.println("Sorry! your queue is already full.\n");
        }
        else if(rear == size-1 && front != 0){
            rear =0;
            array[rear] = value;
        }
        else{
            rear++;
            array[rear] = value;
        }
    }
}
