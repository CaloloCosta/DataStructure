/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author carlos
 * @param <E>
 */
public class SinglyLinkedList<E> {
    
    // node inner class
    public class Node <E>{
        private E data;
        private Node<E> next;
        
        public Node(){}
        public Node(E d, Node n){
            data = d;
            next = n;
        }
        
        public void setNext(Node n){
            next = n;
        } 
        
        public Node getNext(){
            return next;
        }
        
        public E getData(){
            return data;
        } 
        
        public void setData(E d){
            data = d;
        }
        
        public Node getHead(){
            return head;
        }
        
    }
    
    private Node <E>tail;
    private Node <E>head;
    private int size;
    
    // creates an empty list
    public SinglyLinkedList(){
        tail = null;
        head = null;
        size = 0;
    }
    
    // isEmpyt -- checks if the llist is empty
    public boolean isEmpty(){
        return size == 0;
    }
    
    // addLast -- adds an element to the end/tail of the list
    public void addLast(E data){
        Node n = new Node(data, null);
        size++;
        
        if(head == null && tail == null)
            head = tail = n;
        
        else if(head != null && tail != null){
            tail.setNext(n);
            tail = n;
        }
    }
    
    // last -- returns last
    public E last(){
        return isEmpty() ? null : tail.getData();
    }
    
    // addFirst -- adds an element at the begining/head of the list
    public void addFirst(E data){
        head = new Node(data, head);
        if(size == 0)
            tail = head;
        size++;
    }
    
    // first -- returns first element
    public E first(){
        return isEmpty()?null:head.getData();
    }
    
    // removeFirst -- remove the first element and returns it
    public E removeFirst(){
        if(isEmpty())
            return null;
        E first = head.getData();
        head = head.getNext();
        size--;
        if(size == 0)
            tail = null;
        
        return first;
    }
    // insert -- inserts an element to the list at a specific position
    public void insert(int index, E data){
        int count = 0;
        Node h = head;
        while(h != null){
            if(count == index)
                h.setData(data);
       
            count++;
            h = h.getNext();
        }
        
        
    }
    
    // get -- get specific element given an index
    public E get(int index){
        int count = 0;
        
        Node h = head;
        while(h != null){
            if(count == index){
                return (E) h.getData();
            }
            count++;
            h = h.getNext();
        }
        return null;
    }

    
    
    // get the list size
    public int size(){
        return this.size;
    }
    
    @Override
    public String toString(){
        String list = "[";
        Node h = head;
        while(h.getNext() != null){
            list += h.getData()+",";
            h = h.getNext();
        }
        list += h.getData()+"]";
        return list;
    }
    
}
