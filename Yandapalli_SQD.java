package StackQueueDequeLab;

import java.util.*;

/**
*
* @author Sridevi Yandapalli
* S546764
*/

public class Yandapalli_SQD {
	
	public static void main(String[] args){
		
		Stack<Integer> S = new Stack<>();
	       S.push(1);
	       S.push(2);
	       S.push(3);
	       S.push(4);
	       S.push(6);
	       S.push(7);
	       S.push(8);
	       S.push(10);
	       S.push(12);
	       System.out.println("Elements in the Stack are: "+S);
	       
	       ListIterator<Integer> obj=S.listIterator(S.size());
			System.out.print("Displaying the Stack in top-down fashion: ");
			while(obj.hasPrevious()) {
				System.out.print(obj.previous()+" ");
			}
				
			S.pop();
			System.out.println("\nAfter removing the top element from the stack: " +S);
			
			if(S.isEmpty()) {
					System.out.println("The stack is empty");
				}
				else {
					System.out.println("The Stack is not empty");
				}
			
			System.out.println("The position of the book with book number 2 from the top of the stack: "+S.search(2));
			
			int size=S.size();
			ListIterator<Integer> er=S.listIterator(size/2);		
			ArrayList<Integer> L=new ArrayList<>();
			
			System.out.println("Elements in the Stack are: "+S);
			
			//LIFO order
			while(er.hasPrevious()) {
				int i=er.previous();
				   L.add(i);
				
			}	
			
			System.out.println(" ");
			//FIFO order
			ListIterator<Integer> er2=S.listIterator(size/2);	
		    	
		    while(er2.hasNext()) {
			   int j=er2.next();
			   L.add(j);
			
		     }
		    	   
			System.out.println("The new Array List obtained is: " +L);
			
		//using priority Queue
			
			Queue<Integer> Q=new PriorityQueue<>();
			Q.addAll(L);
			
			Iterator<Integer> QueueIterator=Q.iterator();
			System.out.print("Elements present in priority Queue are: ");
			while(QueueIterator.hasNext()) {
				System.out.print(QueueIterator.next()+" ");
			}
			
			// using Array Deque
	        Deque<Integer> D=new ArrayDeque<>();
			D.addAll(L);
			Iterator<Integer> dequeIterator=D.iterator();
			System.out.print("\nElements in Array Deque are: ");
			while(dequeIterator.hasNext()) {
				System.out.print(dequeIterator.next()+" ");
			}
			
			}
		}