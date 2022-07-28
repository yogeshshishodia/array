package arraypractise;

public class Arraydemo {
	
	public static void main(String[] args) {
		int [] intArr;
		double [] doubleArr=new double[4];
		doubleArr[0]=0;
		doubleArr[1]=2;
		doubleArr[2]=3;
		doubleArr[3]=4;
		
		 
		intArr=new int[5];
		intArr[0]=1;
		intArr[1]=2;
		intArr[2]=3;
		intArr[3]=4;
		intArr[4]=5;
		
		
//		
//		System.out.println(intArr);
//		System.out.println(intArr.toString());
//		System.out.println(intArr[1]);
//		System.out.println(intArr[2]);
//		System.out.println(intArr[3]);
		  
		
		for (int i=0;i<intArr.length;i++) {
		System.out.println(i);
		}
		System.out.println("***********************************************");
		
//		for (int j=0;j<doubleArr.length;j++) {
//		System.out.println(j);
//		}
		
//		for (int a:intArr) {
//			System.out.println(a);
//		}
		
		Person[] personArr=new Person[6];
		personArr[0]=new Person(1,"yogesh");
		personArr[1]=new Person(2,"tinku");
		personArr[2]=new Person(3,"suraj");
		personArr[3]=new Person(4,"rohan");
		personArr[4]=new Person(5,"roop");
		personArr[5]=new Person(6,"ravi");
		
		for (Person b:personArr) {
			
//			System.out.println(b);
			System.out.println(b.getPersonId());
			
			System.out.println(b.getPersonname());
			
		}
		
				
		
	}

}
