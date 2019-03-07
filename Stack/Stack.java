package queueandstack;
// last in first out LIFO
public class Stack<T> {
    SLL sll = new SLL();
    
    // push: elements into the stack
    public void push(T element){
        sll.addHead(element);
    }
    
    // pop: deletes and return the element at the top
    public void pop(){
       sll.remHead();
    }
    
    // size
    public int size(){
        return sll.size();
    }
    
    // peek: returns the value at the top
    public Object peek(){
        return sll.getHead();
    }
    
    // clear: clears the stack
    public void clear(){
        sll.clear();
    }
    
    @Override
    public String toString(){
        return sll.print();
    }
}
