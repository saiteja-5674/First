import java.util.*;
/*  vector is a type of list(implements list) and it is almost same as ArrayList.Vector is a 
 * dynamic array in which we can increase the size of array . one quest will arrise as we have 
 * list , collection framewwork to do same job right Ans) vector increase size of array 
 * dynamically  .
 *
 * vector came in  jdk1.0
 * list and collectionframework came in jdk 1.2 
 * so vector is old class than list later vector is modified to work with list.
 * 
 * 
 * question arise as "when to use vector and when to use arraylist": arraylist is implementioncof list and even vector is implementation of list ,
*/
public class VectorClass {
public static void main(String[] args) {

	Vector v = new Vector();
	System.out.println(v.capacity());// initially size is 10 
	v.add(1);
	v.add(1);
	v.add(1);
	v.add(1);
	v.add(1);
	v.add(1);
	v.add(1);
	v.add(1);
	v.add(1);
	v.add(9);
	v.add(10);
	v.remove(10);//remove(object 0)
	System.out.println(v.capacity());// capacity is 20
	// increases capacity by 100% i.e 10,20,40,80 etc . 
	
	for(Object i:v)
	{
		System.out.println(i);
	}
	/* we can also use generics here  */
	Vector<Integer> v1 = new Vector<Integer>();
	v1.add(1);
	v1.add(2);
	v1.add(3);
	v1.add(4);
	v1.add(1);
	v1.add(1);
	v1.add(1);
	v1.add(1);
	v1.add(1);
	v1.add(1);
	v1.add(1);
	v1.remove(1);//remove(int index)
	v1.remove(3);//remove(object o)  --- will not work as all are integers not objects.
	System.out.println(v.capacity());// capacity is 20
	for(int i:v1)
	{
		System.out.println(i);
	}
	
	ArrayList<Integer> a = new ArrayList<>();
	System.out.println(a.size());//0
	a.add(1);
	System.out.println(a.size());//1
	a.add(2);
	a.add(3);
	System.out.println(a.size());//3
	//ArrayList also increases dynamically but saves memory by required size. but in vector 10,20,40,80 etc.
	//every method in vector is synchronized that means threadsafe , array list is not threadsafe.
	//Arraylist is fast(since it is not threadsafe) and vector is slow(since it is threadsafe).
	//so Preffered  is ArrayList.
	
}

}
