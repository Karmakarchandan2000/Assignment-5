package com.EdyodaAssignment.Assignment5;
import java.util.*;

public class RotateArrayToLeft{
	public static void main(String[] args){

		int a[]= {10,20,30,40,50,60};
		System.out.println("Input Array : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter how many times you want to rotate array to left : ");
		int no=sc.nextInt();
		for(int i=0;i<no;i++){

			int first=a[0];
			for(int j=0;j<a.length-1;j++){
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		System.out.println("Output Array : ");

		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}