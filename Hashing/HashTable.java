package Hashing;

public class HashTable {
    private HashNode[] buckets;
    private Integer numOfBuckets;
    private Integer size;

    // Default Constructor.

    public HashTable(){
        this.buckets=new HashNode[10];
    }

    public HashTable(Integer capacity){
        this.numOfBuckets=capacity;
        this.buckets=new HashNode[capacity];
        this.size=0;
    }

    private class HashNode{
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key , String value){
            this.key=key;
            this.value=value;
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }
    // code to get the index value of key. ***************** Modular Hash Function *****************************

    private int getIndex(Integer key){
        return key % numOfBuckets;
    }

    //Adding data!

    public void put(Integer key , String value){
        if(key==null || value == null){
            throw new IllegalArgumentException("Key and Value must not be null.");
        }
        int index = getIndex(key);
        HashNode head = buckets[index];
        while(head!=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head=head.next;
        }
        size++;
        head = buckets[index];
        HashNode node = new HashNode(key,value);
        node.next=head;
        buckets[index] = node;

    }

    // Getting data from the HashTable.

    public String get(Integer key){
        if(key==null){
            throw new IllegalArgumentException("Key must not be null.");
        }
        int index = getIndex(key);
        HashNode head = buckets[index];
        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }

    // Removing data from HashTable.

    public String remove(Integer key){
        int index = getIndex(key);
        HashNode head = buckets[index];
        HashNode previous=null;
        while(head!=null){
            if(head.key.equals(key)){
                break;
            }
            previous = head;
            head=head.next;
        }
        if(head == null || !head.key.equals(key)){
            return null;
        }
        if(previous!=null){
            previous.next = head.next;
        }else{
            buckets[index]=head.next;
        }
        return head.value;
    }

    // main function.
    public static void main(String[] args) {
        HashTable hashtable= new HashTable(10);
        hashtable.put(12,"Aman");
        hashtable.put(11,"Aman");
        hashtable.put(12,"Anurag");
        hashtable.put(21,"Aman");

        // System.out.print(hashtable.getSize());
        // System.out.print(hashtable.get(121));
        System.out.print(hashtable.remove(11));


    }
}
