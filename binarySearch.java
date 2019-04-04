public class binarySearch{
/* Binary search algorithm that returns true when it finds the integer key given, and returns false when it does not find*/
  public static boolean binarySearch(LinkedList list, int key){
    // sort the list before starting with the operations
    Collections.sort(list);
    int size = list.size();
    int leftMost = 0;
    int rightMost = size-1;
    int middle;        
    do{
      middle = Math.round((leftMost+rightMost)/2); // rounds down
      if(key == Integer.parseInt(list.get(middle).toString()))
        return true;
      else if(key < Integer.parseInt(list.get(middle).toString()))
        rightMost = middle -1;
      else
        leftMost = middle +1;
    }while(leftMost <= rightMost);
    return false;
    }
}
