package kuis;

import java.util.Scanner;

	public class kuis_2 {

	        public static void main(String[] args) {

	            String pattern;
	            int kaliBerapa;
	            Scanner scanner = new Scanner(System.in);
	            System.out.print("Masukan pola yang diinginkan : ");
	            pattern = scanner.nextLine();
	            System.out.print("Masukan berapa kali berapa : ");
	            kaliBerapa = scanner.nextInt();

	            for(int i=1; i<=kaliBerapa; i++) {              
	                System.out.println();
	                if(i==1 || i==kaliBerapa) {	          
	                    for(int j=1; j<=kaliBerapa; j++){	                    
	                        System.out.print(pattern+" ");	                    
	                    }
	                } 
	                else { 	                    
	                    for(int k=1; k<=kaliBerapa;k++) {                     
	                        if(k==1 || k == kaliBerapa) { 	                        
	                            System.out.print(pattern + " ");	                        
	                        }                    
	                        else { 	                         
	                            System.out.print("  ");	                        
	                        }
	                    }
	                }
	            }
	        }
	    }
	
