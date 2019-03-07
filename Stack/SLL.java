package StackImplementation;
public class SLL<T>{
    Node head = null;
    Node tail = null;
    int size = 0;
    
    // add head
    public void addHead(T element){
        head = new Node(element,head);
        if(head == null){
            
            tail = head;
        }
        size++;
    
    }
    // add tail
    public void addTail(T element){
        if(tail == null){
            tail = new Node(element,null);
            head = tail;
        }
        else{
            Node newElement = new Node(element,null);
            tail.setNext(newElement);
            tail = newElement;
        }
        size++;      
        
    }
    
    // remove head
    public void remHead(){
        Node h = new Node (head,null);
        if(head != null){
            head = new Node(head.getNext().getElement(),head.getNext().getNext());
            size--;
        }
    }
    

    
    // size
    public int size(){
        return size;
    }
    // get head
    public Object getHead(){
        return head.getElement();
    }
    
    // clear list
    public void clear(){
        /*
        while(head.getNext() != null){
            head = head.getNext();
            size--;
        }*/
        head = null;
        tail = null;
        size = 0;
    }
    
    // print
    public String print(){
        Node h = new Node();
        Node aux = head;
        String response = "[]";
        if(size == 1){
            response = "["+head.getElement()+"]";
        }else if(size > 1){
            response = "[";
            while(aux.getNext() != null){
            response += aux.getElement()+",";
            h = aux.getNext();
            aux = aux.getNext();
            }
            response += h.getElement()+"]";
        }
        
        return response;
    }
}
