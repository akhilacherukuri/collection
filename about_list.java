import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class about_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List obj = new ArrayList();
		obj.add("abc");
		obj.add("xyz");
		obj.add("123");
		obj.add(new student_details("koti", 221, 98));
		obj.forEach(System.out::println);
		Iterator i = obj.iterator();
		while (i.hasNext()) {
			System.out.println("iterator : " + i.next());
		}

		
		
		
		System.out.println("linkedlist : ");

		LinkedList obj1 = new LinkedList(obj);
		obj1.add(1);
		obj1.add(7);
		obj1.add(10);
		obj1.forEach(System.out::println);
		System.out.println("size : " + obj1.size());
		System.out.println("get method : " + obj1.get(2));
		System.out.println(obj1.hashCode());
		System.out.println(obj1.lastIndexOf(obj1));
		System.out.println(obj1.remove(3));
		System.out.println("after remove method : " + obj1);
		System.out.println("first element : " + obj1.getFirst());
		System.out.println("last element : " + obj1.getLast());
		obj1.push("akhila");
		obj1.peek();
		System.out.println("After peak method : " + obj1);
		System.out.println(obj1.peekFirst());
		System.out.println(obj1.peekLast());
		System.out.println(obj1.poll());
		obj1.pollFirst();
		obj1.pollLast();
		ListIterator l = obj1.listIterator();
		System.out.println("list ieraor : ");
		while (l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("after poll method : " + obj1);
//		obj.removeAll(obj1);
//		System.out.println("after remove all method : "+obj);

		
		
		
		
		Vector v = new Vector();
		v.addElement(obj1);
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		// v.forEach(System.out::println);

	}

}
