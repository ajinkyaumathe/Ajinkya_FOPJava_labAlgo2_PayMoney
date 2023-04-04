package com.greatlearning.iitr.dsa.labsession2;
import java.util.Scanner;
public class Transaction {
	
	static int sum;
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the size of transaction array ");
		
		int size=sc.nextInt();
		
		int i;
		
		int trans[]=new int[size];
		
		for(i=0;i<size;i++)
		
		{
			System.out.println("Enter the values of array");
			trans[i]=sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved ");
		
		int targets=sc.nextInt();
		
		int flag;
		
		for(i=1;i<=targets;i++)
			
		{
			sum=0;
			
			flag=0;    
			
			System.out.println("Enter the value of target " +i);
			
			int target=sc.nextInt(); 
			
			for(int j=0;j<trans.length;j++)
			{
				sum+=trans[j];
				if(sum>=target)
				
				{
					flag=1;
					System.out.println("Target achieved after " +(j+1)  + " trasanctions\n ");
					break;
				}
				
			}
				if(flag==0)
					System.out.println("Given target is not achieved\n");
		}
		
		
	}
	}