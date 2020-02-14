import java.util.Hashtable;
import java.util.Vector;

/*
 * collection(concept),Collection(interface),Collections(class)
 * collection holds objects dynamically 
 * SET -- cannot contain duplicates
 * List -- can contains duplicates 
 * A Collection is a group of individual objects represented as a single unit
 * The Collection interface (java.util.Collection) and Map interface (java.util.Map) 
 * are the two main “root” interfaces of Java collection classes.
 * Need for Collection Framework :
Before Collection Framework (or before JDK 1.2) was introduced, 
the standard methods for grouping Java objects (or collections) 
were Arrays or Vectors or Hashtables. 
All of these collections had no common interface.

Accessing elements of these Data Structures was a hassle as each had a 
different method (and syntax) for accessing its members:*/




public class Collection {
public static void main(String[] args) {
	// Creating instances of array, vector and hashtable 
    int arr[] = new int[] {1, 2, 3, 4}; 
    Vector<Integer> v = new Vector(); 
    Hashtable<Integer, String> h = new Hashtable(); 
    v.addElement(1); 
    v.addElement(2); 
    h.put(1,"geeks"); 
    h.put(2,"4geeks"); 

    // Array instance creation requires [], while Vector 
    // and hastable require () 
    // Vector element insertion requires addElement(), but 
    // hashtable element insertion requires put() 

    // Accessing first element of array, vector and hashtable 
    System.out.println(arr[0]); 
    System.out.println(v.elementAt(0)); 
    System.out.println(h.get(1)); 

    // Array elements are accessed using [], vector elements 
    // using elementAt() and hashtable elements using get() 
    /*
     * Collection : Root interface with basic methods like add(), remove(), 
             contains(), isEmpty(), addAll(), ... etc.
 
Set : Doesn't allow duplicates. Example implementations of Set 
      interface are HashSet (Hashing based) and TreeSet (balanced
      BST based). Note that TreeSet implements SortedSet.

List : Can contain duplicates and elements are ordered. Example
       implementations are LinkedList (linked list based) and
       ArrayList (dynamic array based)

Queue : Typically order elements in FIFO order except exceptions
        like PriorityQueue.  

Deque : Elements can be inserted and removed at both ends. Allows
        both LIFO and FIFO. 

Map : Contains Key value pairs. Doesn't allow duplicates.  Example
      implementation are HashMap and TreeMap. 
      TreeMap implements SortedMap.        

The difference between Set and Map interface is that in Set we 
have only keys, whereas in Map, we have key, value pairs.*/
}
}
