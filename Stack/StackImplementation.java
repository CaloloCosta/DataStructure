package StackImplementation;
public class StackImplementation {
    public static void main(String[] args) {
        Stack stkObj = new Stack();
        stkObj.push("First In");
        stkObj.push("Second In");
        stkObj.push("Third In");
        stkObj.push("Forth In");
        System.out.println("----------Stack--------------");
        System.out.println("After pushing: "+stkObj);
        stkObj.pop();
        System.out.println("After poppping: "+stkObj);
        System.out.println("Peek: "+stkObj.peek());
        System.out.println("Size: "+stkObj.size());
        stkObj.clear();
        System.out.println("After clearing: "+stkObj);        
    }
    
}
