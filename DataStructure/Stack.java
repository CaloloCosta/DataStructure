/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author carlos
 */
// statck implamentation using linked list
import java.util.LinkedList;

public class Stack<E> {
    LinkedList list = new LinkedList<>();
    
    public int size(){
        return list.size();
    }
    
    public void push(E data){
        list.addLast(data);
    }
    
    public E pop(){
        return (E) list.removeLast();
    }
    
    public E peek(){
        return (E)list.getLast();
    }
    
    public void clear(){
        list.clear();
    }
    
}
