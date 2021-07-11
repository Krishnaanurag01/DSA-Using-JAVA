package Trie;

public class Trie {

    private TrieNode root;

    public Trie(){
        this.root = new TrieNode();
    }

    // Trie Nodes Class.

    private class TrieNode{
        private TrieNode[] childrens;
        private boolean isWord;
        public TrieNode(){
            this.childrens = new TrieNode[26];
            this.isWord= false;
        }
    }

    //  Insertion method.

    public void insertion(String word){
        if(word==null || word.isEmpty()){
            throw new IllegalArgumentException("invalid Input");
        }
        word = word.toLowerCase();
        TrieNode current = root;
        for(int i = 0 ; i < word.length() ; i++){
            char x = word.charAt(i);
            int index = x - 'a';
            if(current.childrens[index]==null){
                TrieNode node = new TrieNode();
                current.childrens[index] = node;
                current = node;
            }
            else{
                current= current.childrens[index];
            }
        }
        current.isWord=true;
    }

    // Search method will be added soon.

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertion("son");
        trie.insertion("cat");
        trie.insertion("so");
        trie.insertion("cab");
        System.out.print("Insertion Sucessfull.");
    }
}
