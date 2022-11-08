package listLab;

import java.util.LinkedList;
import java.util.Scanner;

/**
*
* @author Sridevi Yandapalli
* S546764
*/



 public class Yandapalli_List {

	 public static void main(String[] args) {
			LinkedList<Integer> L=new LinkedList<>();
			// adding elements into the list
			L.add(2);
			L.add(5);
			L.add(3);
			L.add(6);
			L.add(7);
			L.add(9);
			System.out.println("The Employee ID's in List are: "+L);
			//removing elements from the previous list
			L.remove(L.indexOf(3));
			L.remove(L.indexOf(7));
			//printing the update list after removing the elements
			System.out.println("After removing the retired employee ID's are: "+L);
			//printing the list in reverse order
			System.out.println("The reverse order of the LinkedList is:  ");
			for(int n=L.size();n>0;n--) {
				System.out.print(L.get(n-1)+" ");
			}
			
			System.out.println("\nemployee ID 5 is in L "+L.contains(5));
			System.out.println("employee ID 3 is in L "+L.contains(3));
			System.out.println("employee ID 6 is in L "+L.contains(6));
			System.out.println("employee ID 8 is in L "+L.contains(8));
			
			for(int n=0;n<L.size();n++) {
				L.set(n, L.get(n)+5);
			}
			System.out.println("The linked List after Incrementing is: "+L);
			Scanner c=new Scanner(System.in);
			System.out.println("Enter value between 0 and "+L.size());
			int k=c.nextInt();
			System.out.println("The last "+k+" employee ids are :");
			for(int m=k;m>0;m--) {
				System.out.println(L.get(L.size()-m));
			}
			System.out.println("The first "+k+" employee ids are :");
			for(int m=0;m<k;m++) {
				System.out.println(L.get(m));
			}
			
			
			System.out.println("employee ID 5 is in L :"+L.contains(5));
			System.out.println("employee ID 12 is in L :"+L.contains(12));
			
			
		}
		

	}