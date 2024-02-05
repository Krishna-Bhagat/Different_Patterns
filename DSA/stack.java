import java.util.Scanner;

public class stack {
    static Scanner sc = new Scanner(System.in);
    static int size;
    static int top = -1;
    stack(){
        System.out.print("Enter the size of your stack: ");
        size = sc.nextInt();
    }
    public static void main(String[] args) {
        stack a = new stack();
        int[] array = new int[size];
        System.out.println("Which operation do you want to do in your stack: ");
        while(true){
            boolean flag = false;
            System.out.println("Press '1' to Push a Value.\nPress '2' to Pop a Value.\nPress '3' to Display a Value.");
            switch (sc.nextInt()) {
                case 1:
                    push(array);
                    break;
                case 2:
                    pop(array);
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
        System.out.println("Value inside your stack are: ");
        for (int i=0; i<=top; i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println("\n");
    }
    private static void pop(int[] array) {
        if(top == -1){
            System.out.println("Sorry! your stack is empty. First push any value to pop.");
        }
        else{
            System.out.println("Your poped value is: "+array[top]);
            top--;
        }
        System.out.println();
    }
    private static void push(int[] array) {
        int value;
        System.out.print("Enter the value to push inside your stack: ");
        value = sc.nextInt();
        if(top == size-1){
            System.out.println("Sorry! your srtack is already full. Pop your last entered value to push new one.");
        }
        else{
            top++;
            array[top] = value;
        }
        System.out.println();
    }
}
