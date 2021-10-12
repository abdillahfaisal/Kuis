package kuis;

import java.util.Scanner;

public class kuis3 {
	public static void main(String[] args) {
	 int numrows;
	 System.out.println("Masukan Angka");
	 Scanner scan = new Scanner(System.in);
	 numrows = scan.nextInt();
	 scan.close();
	 
	 int i = 0;
	for (int row = i; row <= 10; row++) {
		    for (int j = 1; j <= row; j++) {
		        System.out.print(j + " ");
		    }
		    System.out.print("  ");
		    for (int j = 10; j >= row; j--) {
		        System.out.print(j + " ");
		    }
		    System.out.println();
		}
	}
}
