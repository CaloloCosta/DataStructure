/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.LinkedList;

/**
 *
 * @author carlos
 */

// queue data structure linked list implementation
public class Queue<E> {
    private LinkedList<E> list = new LinkedList<>();
    
    public Queue(){
    }
    
    //size-- returns the size of the list
    public int size(){
        return list.size();
    }
    
    public boolean isEmpty(){ return list.isEmpty();}
    
    public void enqueue(E data){
        list.addLast(data);
    }
    
    public E dequeue(){
        return list.removeFirst();
    }
    
    // returns the first element
    public E first(){
        return list.getFirst();
    }
    
    
}
