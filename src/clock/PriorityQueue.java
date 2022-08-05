package clock;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev
 */
public class PriorityQueue<T> {

/**
     * Where the data is actually stored.
     */
    private final Priority[] storage;

    /**
     * The size of the storage array.
     */
    private final int capacity;

    /**
     * The index of the last item stored.
     *
     * This is equal to the item count minus one.
     */
   
//    stores the current index value
   
    private int currentIndex = 0;

    /**
     * Create a new empty queue of the given size.
     *
     * @param size
     */
    public PriorityQueue(int size) {
        storage = new Priority[size];
        System.out.println(storage);
        capacity = size;
    }


    public T head() {
        
        Priority biggestItem = new Priority(null,0);
        if (isEmpty()) {
            System.out.println("error ");
        } else {
       
        int max = Integer.MIN_VALUE;
 
       
        for( int i = 0; i < currentIndex; i++) {
       
        if(((Priority) storage[i]).getPriority() > max) {
       
        max = ((Priority) storage[i]).getPriority();
        biggestItem = (Priority) storage[i];
       
        }
        }
            return (T) biggestItem.getData();
        }
        
        return (T) biggestItem.getData();
       
    }

 
    public void add(Alarm item, int priority) {
       
         if(currentIndex <= capacity) {
        storage[currentIndex] = new Priority(item, priority);
        currentIndex +=1;
         }
    }
   
   
   
    public void remove(){
   
    int removedIndex = 0;
   
        if (isEmpty()) {
            System.out.println("error ");
       
        } else {
       
        int max = Integer.MIN_VALUE;
       
        Priority toRemove = new Priority(null,0);
       
        for( int i = 0; i < currentIndex; i++) {
       
        if(((Priority) storage[i]).getPriority() > max) {
       
        max = ((Priority) storage[i]).getPriority();
        toRemove = (Priority) storage[i];
       
        }
        }
       
        for( int i = 0; i < storage.length; i++) {
       
        if(storage[i] == toRemove) {
       
        storage[i] = null;
       
        removedIndex = i;
        break;
        }
       
        }
       
        for ( int i = removedIndex; i<currentIndex; i++) {
       
        storage[i] = storage[i+1];
       
       
        }
       
        currentIndex -=1;
           
        }
       
       
    }


    public boolean isEmpty() {
        return currentIndex < 0;
    }
   

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i <= currentIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + storage[i];
        }
        result = result + "]";
        return result;
    }

}
