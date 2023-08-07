import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
	public static void main(String[] args) {
		// ArrayList<String> studentsName = new ArrayList<>();
		// studentsName.add("Rakesh");

		/*
		 * List<Integer> list = new ArrayList(); list.add(1); list.add(2); list.add(3);
		 * System.out.println(list);
		 * 
		 * list.add(4); System.out.println(list);
		 * 
		 * list.add(1, 50); System.out.println(list);
		 * 
		 * List<Integer> newlist = new ArrayList(); newlist.add(150); newlist.add(160);
		 * 
		 * list.addAll(newlist); System.out.println(list);
		 * 
		 * System.out.println(list.get(1));
		 */

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);

		/*
		 * list.set(2, 100);
		 * 
		 * System.out.println(list);
		 * 
		 * System.out.println(list.contains(50));
		 */

		/*
		 * list.remove(1); System.out.println(list);
		 * 
		 * list.remove(Integer.valueOf(80)); System.out.println(list);
		 * 
		 * list.clear(); System.out.println(list);
		 */

		//1st methods of Iterator list of element not list of size
		
		/*
		 * for (int i = 0; i < list.size(); i++) { System.out.println("The Element is "
		 * + list.get(i)); }
		 * 
		 * //2nd method In foreach loop how to Iterate
		 * 
		 * for(Integer element: list) { System.out.println("foreach element is " +
		 * element); }
		 * 
		 * //3rd method of Iterator Iterator<Integer> itr = list.iterator();
		 * while(itr.hasNext()) { System.out.println("iterator " + itr.next()); }
		 */

		
	}

}
