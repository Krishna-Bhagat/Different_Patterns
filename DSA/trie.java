public class trie {
    static class  Node {        
        boolean endofword;
        Node[] children;
        public Node(){
            children = new Node[26];
            endofword = false;
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    static Node root = new Node();

    public void insert(String s){
        Node cur = root;
        for(int i=0; i<s.length(); i++){
            int ch = s.charAt(i) - 'a';
            if(cur.children[ch] == null){
                cur.children[ch] = new Node();   
            }
            if(i == s.length() -1) cur.endofword = true;
            cur = cur.children[ch];
        }
    }

    public boolean search(String word){
        Node cur = root;
        for(int i=0; i<word.length(); i++){
            int ch = word.charAt(i) - 'a';
            if(cur.children[ch] == null) return false;
            if(i == word.length()-1) return cur.endofword == true;
            cur = cur.children[ch];
        }
        return false;
    }
    public boolean wordbreak(String test){
        if(test.length() ==0) return true;
        for(int i=1; i<=test.length(); i++){
            String left = test.substring(0, i);
            String right = test.substring(i, test.length());
            if(this.search(left) && this.wordbreak(right)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] word = {"there","are","the","hello","hi","then","their","here"};
        trie tree = new trie();
        for(int i=0; i<word.length; i++){
            tree.insert(word[i]);
        }
        if(tree.search("thor")){
            System.out.println("Yes, It's present there.");
        }
        else System.out.println("No, It's not present there.");

        String test = "therearehere";
        if(tree.wordbreak(test)){
            System.out.println("yes, this word can be broken down as per the given dictionary words.");
        }
        else{
            System.out.println("No, this word can't be broken down.");
        }
    }
}
