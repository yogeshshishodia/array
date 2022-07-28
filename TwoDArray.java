package arraypractise;

public class TwoDArray {
	
	public static void main(String[]args) {
		
		
		int arrays2D[][]=new int [3][3];
		for (int i=0;i<arrays2D.length;i++) {
			for(int j=0;j<arrays2D.length;j++) {
				arrays2D[i][j]=i+1;
				System.out.println(arrays2D[i][j]);
				
			}
		}
		
		for (int i=0;i<arrays2D.length;i++) {
			for(int j=0;j<arrays2D.length;j++) {
				arrays2D[i][j]=j+1;
				System.out.println(arrays2D[i][j]);
			
				
				
			}
		}
	}

}
