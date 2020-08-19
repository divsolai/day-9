package java30;

import java.util.Arrays;
import java.util.Scanner;

public class Averageofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,temp=0,sum=0,avg=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		num=scan.nextInt();
		int[] arr= new int[num];
		System.out.println("Enter the numbers in the array");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("the array entered is"+ Arrays.toString(arr));
		System.out.println("the addition of numbers in array is ");
		for(int i=0;i<num;i++)
		{
		  temp=arr[i];
		  sum= sum+temp;
		  avg=sum/num;
		  }
		System.out.println("the sum of the array is " + sum);
		System.out.println("the average of the array is"+ avg);
		scan.close();
			}


	}


