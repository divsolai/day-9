package java30;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestandLargestinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,temp=0,sm=0;
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
		Arrays.sort(arr);
		System.out.println("The sortred array is"+ Arrays.toString(arr));
		System.out.println("smallest number in array is"+ arr[0]);
		System.out.println("the biggest number in array is"+ arr[num-1]);
		scan.close();
	}
	}



