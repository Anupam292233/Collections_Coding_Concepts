import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
	public static void main(String[] args) {
		
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder ());
		
		pq.offer(40);
		pq.offer(12);
		pq.offer(24);
		pq.offer(36);
		pq.offer(30);

	     System.out.println(pq);
	     
	     pq.poll();
	     
		
	}

}
