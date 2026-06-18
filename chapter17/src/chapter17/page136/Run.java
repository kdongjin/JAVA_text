package chapter17.page136;

import java.util.LinkedList;
import java.util.Queue;

public class Run {
	public static void main(String[] args) {
		//Queue 컬프 
		Queue<Data> queue = new LinkedList<Data>();
		
		//add, add, put<k,v>, push, offer
		queue.offer(new Data(1));
		queue.offer(new Data(2));
		queue.offer(new Data(3));
		queue.offer(new Data(4));
		queue.offer(new Data(5));
		
		System.out.println(queue);
		//get, contain => for each, get, peek, peek, poll
		System.out.printf("queue.peek() = %s \n",queue.peek());
		System.out.printf("queue.size() = %d \n",queue.size());
		
		System.out.printf("queue.poll() = %s \n",queue.poll());
		System.out.printf("queue.size() = %d \n",queue.size());
		System.out.println(queue);
	
		System.out.printf("queue.poll() = %s \n",queue.remove());
		System.out.printf("queue.poll() = %s \n",queue.remove());
		System.out.printf("queue.poll() = %s \n",queue.remove());
		System.out.printf("queue.poll() = %s \n",queue.remove());
		System.out.printf("queue.poll() = %s \n",queue.remove());

//		System.out.printf("queue.poll() = %s \n",queue.poll());
//		System.out.printf("queue.poll() = %s \n",queue.poll());
//		System.out.printf("queue.poll() = %s \n",queue.poll());
//		System.out.printf("queue.poll() = %s \n",queue.poll());
	
	}
	
}















