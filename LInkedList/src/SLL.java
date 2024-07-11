package src;

public class SLL {

    private Node head;
    private Node tail;
    private int size;

    public SLL(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node( int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;

    }

    public void insertLast(int val){
        Node node = new Node(val);

        if(tail == null){
            insertFirst(val);
            return;
        }

        tail.next = node;
        tail = node;
        size++;
    }
    public void insertRec(int val, int index){

        Node temp = head;

        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index != 1){
            temp = temp.next;
            insertRec(val, index - 1);
        }

        if(index == 1){
            Node node = insertRec()
        }


    }


    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size - 1){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }

        Node newNode = new Node(val,temp.next);
        temp.next = newNode;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;

        head = head.next;
        if(head == null){
            tail = null;
        }
        return val;
    }

    public void display(){
        Node temp = head;
            while(temp!=null){
                System.out.println(temp.value + " -> ");
                temp = temp.next;
            }
        System.out.println("END");

    }


}
