/**
 * 
 */
package arraypractise;

import java.util.Scanner;

/**
 * @author yogesh.v
 *
 */
public class Even {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter the element of array");
		for (int i=0;i<10;i++) {
		a[i]=sc.nextInt();
		}
		
		
		System.out.println("even number are");
		
		for (int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				
				System.out.print(a[i]+" ");
				
			}
		}
		
		System.out.println("");
		
System.out.println("odd number are");
		
		for (int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				
				System.out.print(a[i]+" ");
				
			}
		}

	}

}
