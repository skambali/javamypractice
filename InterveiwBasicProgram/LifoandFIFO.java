package InterveiwBasicProgram;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LifoandFIFO {
	
	public static void main(String[] args) {
		
		Queue<Integer> arrayLifoQueue=Collections.asLifoQueue(new ArrayDeque<Integer>());
		
		arrayLifoQueue.add(1);
		arrayLifoQueue.add(2);
		arrayLifoQueue.add(3);
		arrayLifoQueue.add(4);
		
	//	Queue<Integer> arrayLifoQueue = Collections.asLifoQueue(new ArrayDeque<Integer>());
		Queue<Integer> linkedListLifoQueue = Collections.asLifoQueue(new LinkedList<Integer>());
		linkedListLifoQueue.add(1);
		linkedListLifoQueue.add(2);
		linkedListLifoQueue.add(3);
		linkedListLifoQueue.add(4);
	
		System.out.println(arrayLifoQueue);
		
		System.out.println(linkedListLifoQueue);
	}
	
	

} 