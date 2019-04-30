package pack1;

public class Tester {
	
	public static void main(String[] args) {
		
		int[][] myArray = new int[7][7];
		
		zero(myArray);
		
		int i = 3, j = 2;
		
	/*	myArray[i][j] = 25;   // center
		init(i, j);
		myArray[i--][j] = 25; // T
		init(i, j);
		myArray[i--][j++] = 25;  // TR
		init(i, j);
		myArray[i][j++] = 25;  // R
		init(i, j);
		myArray[i++][j++] = 25;  // BR
		init(i, j);
		myArray[i++][j] = 25; // B
		init(i, j);
		myArray[i++][j--] = 25; // BL
		init(i, j);
		myArray[i][j--] = 25;  // L
		init(i, j);
		myArray[i--][j--] = 25;  // TL
		init(i, j);  */
		
		/*
		myArray[3][2] = 25;   // center
		
		myArray[2][2] = 25; // T
		
		myArray[2][3] = 25;  // TR
		
		myArray[3][3] = 25;  // R
		
		myArray[4][3] = 25;  // BR
		
		myArray[4][2] = 25; // B
		
		myArray[4][1] = 25; // BL
		
		myArray[3][1] = 25;  // L
		
		myArray[2][1] = 25;  // TL
		
		
		for(i = 0; i < myArray.length; ++i) {
			for(j = 0; j< myArray[i].length; ++j) {
				System.out.print(myArray[i][j] + "|");
			}
			System.out.println();
		}
		
		for(i = 0; i < 2; ++i) {
			System.out.println(myArray.length);
			for(j = 0; j < 1; ++j) {
				System.out.print(myArray[i].length);
			}
		}
		*/
		
		for(i = 0; i < myArray.length; ++i) {
			System.out.println("i = " + i);
			for(j = 0; j < myArray[i].length; ++j) {
				
				System.out.print("j = " + j);
			}
			System.out.println();
		}
		
	}
	
	public static void zero(int myArray[][]) {
		
		for(int i = 0; i < myArray.length - 1; ++i) {
			for(int j = 0; j< myArray[i].length - 1; ++j) {
				myArray[i][j] = 88;
			}
			System.out.println();
		}
	}
	
	public static void init(int a, int b) {
		a = 3;
		b = 2;
	}

}
