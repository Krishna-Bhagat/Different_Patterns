import java.util.ArrayList;
import java.util.LinkedList;

public class hashmap<K,V> {
    class Node{
        K key;
        V value;
        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    ArrayList<LinkedList<Node>> list;
    private int default_size = 5;
    private float loadfactor =  1.5f;
    private int size =0;

    public hashmap(){
        list = new ArrayList<>(default_size);
        for(int i=0; i<default_size; i++){
            list.add(i,new LinkedList<Node>());
        }
    }
    private int hash(K key){
        long tem = (long)Math.abs(key.hashCode()) * 128742;
        return (int)(tem % default_size);
    }

    public void put(K key, V value){
        int bi = this.hash(key);
        LinkedList<Node> ll = list.get(bi);
        int di = finddata(ll,key);
        if(di == -1){
            ll.add(new Node(key,value));
            ++size;
        }
        else{
            ll.get(di).value = value;
        }
        double t = (double)size/default_size;
        if(t>loadfactor) this.rehashing();
        return;
    }

    private int finddata(LinkedList<Node> ll, K key){
        for(int i=0; i<ll.size(); i++){
            if(ll.get(i).key == key) return i;
        }
        return -1;
    }
    private void rehashing(){
        ArrayList<LinkedList<Node>> tem = list;
        this.default_size = default_size*2;
        this.list = new ArrayList<>(default_size);
        for(int i=0; i<default_size; i++){
            list.add(i,new LinkedList<Node>());
        }
        for(int i=0; i<tem.size(); i++){
            LinkedList<Node> ll = tem.get(i);
            for(int j=0; j<ll.size(); j++){
                this.put(ll.get(j).key, ll.get(j).value);
            }
        }
        return;
    }

    public V get(K key){
        int bi = this.hash(key);
        int di = this.finddata(this.list.get(bi), key);
        if(di == -1) return null;
        else return this.list.get(bi).get(di).value;
    }

    public V remove(K key){
        int bi = hash(key);
        LinkedList<Node> ll = this.list.get(bi);
        int di = this.finddata(ll, key);
        if(di ==-1) return null;
        else{
            Node t =ll.remove(di);
            return t.value;
        } 
    }
    public static void main(String[] args) {
        hashmap<String, Integer> has = new hashmap<>();
        has.put("Krishna", 5);
        has.put("Suman", 15);
        has.put("Rohan", 54);
        has.put("Binay", 135);
        has.put("Raju", 532);
        has.put("Kanhaiya", 25);
        has.put("Rabi", 35);
        has.put("Kishan", 325);
        has.put("Raunak", 65);
        System.out.println(has.get("Kishan"));
        has.remove("Kishan");
        System.out.println(has.get("Kishan"));
    }
}
