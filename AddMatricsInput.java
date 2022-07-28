package arraypractise;

import java.util.Scanner;

public class AddMatricsInput {
	public static void main(String args[]){ 
		
		//creating two matrices    
//		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
//		int b[][]={{1,3,4},{2,4,3},{1,2,4}}; 
		
		
		int a[][]=new int[3][3];  
		int b[][]=new int[3][3];  
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element of first matrics");
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				 a[i][j]=sc.nextInt();
			
		}}
		
		System.out.println("enter element of second matrics");
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				 b[i][j]=sc.nextInt();
			
		}}
		
		    
		
		int c[][]=new int[3][3];  
		    
		
		System.out.println("sum of two matrics are");
	    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];     
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println("");
		
		}    
		}}  

