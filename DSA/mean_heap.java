import java.util.*;
import java.util.Scanner;

public class mean_heap<T extends Comparable<T>> {
    private List<T> list;
    public mean_heap(){
        list = new ArrayList<>();
    }

    private int parent(int index){
        if(index == 0) return index;
        return (index-1)/2;
    }

    private void swap(int index1, int index2){
        T tem = list.get(index2);
        list.set(index2,list.get(index1));
        list.set(index1,tem);
        return;
    }

    private int leftchild(int index){
        return (index *2) +1;
    }

    private int rightchild(int index){
        return (index *2) +2;
    }
    public void insert(T val){
        list.add(val);
        this.upheap(list.size()-1);
        return;
    }
    private void upheap(int index){
        if(index ==0) return;
        int parent = this.parent(index);
        if(this.list.get(parent).compareTo(this.list.get(index)) > 0)
            this.swap(parent, index);
        upheap(parent);
        return;
    }
    public T remove() throws Exception{
        if(this.list.isEmpty())
            throw new Exception("Removing from Empty Heap is not possible.");
        T tem = this.list.get(0);
        T last = this.list.remove(this.list.size()-1);
        if(!this.list.isEmpty()){
            this.list.set(0, last);
            downheap(0);
        }
        return tem;
    }
    private void downheap(int index){
        int leftchild = leftchild(index);
        int rightchild = rightchild(index);
        int min = index;
        if(leftchild < this.list.size() && this.list.get(min).compareTo(this.list.get(leftchild)) > 0){
            min = leftchild;
        }
        if(rightchild < this.list.size() && this.list.get(min).compareTo(this.list.get(rightchild)) > 0){
            min = rightchild;
        }
        if(min != index){
            this.swap(index, min);
            downheap(min);
        }
        return;
    }


    public ArrayList<T> sort() throws Exception{
        ArrayList<T> l = new ArrayList<>();
        while(!this.list.isEmpty()){
            T tem = this.remove();
            l.add(tem);
        } 
        return l;
    }

    public static void main(String[] args) throws Exception{
        mean_heap<Integer> heap = new mean_heap<Integer>();
        System.out.print("How many elements do you have with you:  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Go On entering all your elements one by one:-");
        for(int i=0; i<n;i++){
            int tem = sc.nextInt();
            heap.insert(tem);
        }
        ArrayList<Integer> arr = heap.sort();
        System.out.println(arr);
    }
}
