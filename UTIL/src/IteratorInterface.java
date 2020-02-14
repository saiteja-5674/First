

import java.util.*;
/**/
public class IteratorInterface {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	a.add(6);
	a.add(7);
	a.add(8);
	a.add(9);
	a.add(10);
	// here ArrayList is container to traversethe each elements
	Iterator<Integer> i = a.iterator();
	while(i.hasNext())//has next method starts at above zero and method type is boolean
	{
		System.out.println(i.next());// next method is used to print next value for example
		//for index of -1 next value is index of zero here at index of zero value is one
		
	}
	
	
}
}
