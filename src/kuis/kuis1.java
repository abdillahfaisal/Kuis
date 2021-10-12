package kuis;

import java.util.Scanner;

public class kuis1 {
	public static void main(String args[])
	  {
	 
	    int i;
	 
	    System.out.println("Masukan berapa yang mau dirata-ratakan");
	 
	    Scanner sc=new Scanner(System.in);
	 
	    int n=sc.nextInt();
	 
	    int[] a=new int[n];
	 
	    double avg=0;
	 
	    System.out.println("Masukan Nilai");
	 
	    for( i=0;i<n;i++)
	    {
	       a[i]=sc.nextInt();
	    }
	 
	    for( i=0;i<n;i++)
	    {
	      avg=avg+a[i];
	    }
	 
	    System.out.print("Rata-rata (");
	 
	    for(i=0;i<n-1;i++)
	    {
	      System.out.print(a[i]+",");
	    }
	    System.out.println(a[i]+") ="+avg/n);
	  }
}
