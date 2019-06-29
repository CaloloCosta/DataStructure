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
public class DataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        SinglyLinkedList sll = new SinglyLinkedList();
        
        sll.addLast(1);
        sll.addLast(2);
        sll.addLast(3);
        sll.addLast("Carlos");
        sll.insert(3,"David");
        System.out.println(sll.get(3));
        System.out.println(sll);*/
        
        Queue q = new Queue();
        
        q.enqueue("Carlos");
        q.enqueue("David");
        q.enqueue("Cangombe");
        System.out.println(q.first());
        
    }
    
}
