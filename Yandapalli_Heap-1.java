package HeapLab;

import java.util.ArrayList;
import java.util.Collections;

/**
*
* @author S546764
* @author Sridevi Yandapalli
*/
public class Yandapalli_Heap 
{
	public static void main(String[] args)
	{
		MinHeap H1=new MinHeap();
		ArrayList<Integer> A1=new ArrayList<>();
		H1.insert(10);
		H1.insert(14);
		H1.insert(19);
		H1.insert(26);
		H1.insert(31);
		H1.insert(42);
		H1.insert(27);
		H1.insert(44);
		H1.insert(35);
		H1.insert(33);
		H1.heapifyDown();
		H1.display();
		//System.out.println(H1.display());
		while(!H1.isEmpty()) {			
			A1.add(H1.delete());			
		}
		
		System.out.println("\nThe Largest Element in Heap is "+Collections.max(A1));
		int k=Collections.min(A1);
		//System.out.println(k);
		int s=A1.indexOf(k);
		//System.out.println(s);
		A1.remove(s);
		System.out.println(A1);
		for(int i=0;i<A1.size();i++){
			H1.insert(A1.get(i));
		}
		
		
		System.out.println("The sum of largest and smallest is "+((Collections.min(A1))+Collections.max(A1)));
		//System.out.println(Collections.min(A1));
		
		System.out.println("The Index of smallest Element is "+A1.indexOf(Collections.min(A1)));
		MaxHeap H2=new MaxHeap();
		ArrayList<Integer> A2=new ArrayList<>();
		H2.insert(44);
		H2.insert(42);
		H2.insert(35);
		H2.insert(33);
		H2.insert(31);
		H2.insert(19);
		H2.insert(27);
		H2.insert(10);
		H2.insert(26);
		H2.insert(14);
		H2.display();
		while(!H2.isEmpty()) {
			A2.add(H2.delete());
		}
		int sum=0;
		for(int i=0;i<A2.size();i++) {
			H2.insert(A2.get(i));
			sum=sum+A2.get(i);
		}
		System.out.println("\nThe sum of all elements of maxheap is "+sum);
		H2.insert(45);
		System.out.print("The updated heap after adding 45  ");
		H2.display();
		System.out.println();	
		
		while(!H2.isEmpty()) {
			H2.delete();
		}
		for(int i=0;i<A2.size();i++) {
			H2.insert(A2.get(i));			
		}
		System.out.print("The updated heap after deleting 45 is ");
		H2.display();
		System.out.println();
		while(!H2.isEmpty()){ 
		     A2.add(H2.delete());

		}
		System.out.println("The last element after updating is "+A2.get(A2.size()-1));
		
		}

}
