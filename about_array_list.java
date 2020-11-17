
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class about_array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<student_details> obj = new ArrayList<student_details>();
//		obj.add("akhila");
//		obj.add(202);
//		obj.add("abc");
//		obj.add("xyz");
//		obj.add("123");
//		//System.out.println(obj);
//		
		obj.add(new student_details("koti", 221, 98));
		obj.add(new student_details("varshi", 222, 99));
		obj.add(new student_details("sai", 223, 97));

		// for each loop
		System.out.println("for each loop :");

		for (Object b : obj) {
			System.out.println(b);
		}
		// iterator
		System.out.println("iterator loop : ");
		Iterator i = obj.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("first index : " + obj.get(1));
		System.out.println("hashcode : " + obj.hashCode());
		// System.out.println(obj.parallelStream());

		System.out.println("Stream class : ");
		Stream<student_details> sref = obj.stream();
		// sref.forEach(System.out::println);
//		List<student_details> updatestream1 = obj.stream().filter((p) -> p.getRollnumber() > 221)
//				.collect(Collectors.toList());
		
		// System.out.println(updatestream1.size());
		// List<student_details> updatestream = sref.filter((p) -> p.getRollnumber() >
		// 221).collect(Collectors.toList());
		
		// System.out.println("updated list : " + updatestream.size());
		System.out.println("count : " + sref.filter((p) -> p.getRollnumber() > 221).count());

	}
}
