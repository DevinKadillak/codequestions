codequestions
=============

cs160 programming assignments
import java.util.Arrays;

// R12 Recitation
// Author: Devin Kadillak
// Date:  Oct 23, 2014
// Class:  CS160
// Email:  devbot@rams.colostate.edu

public class R12 {
	public static double arrayAverage(double[] array){
		double d=0;
		double e=array.length;
		for(int i=0; i<array.length;i++){
			d=d+array[i];
		}
		double average = d/e;
		return average;
	}
	public static double[] swapArray(double[] swap){

		for(double i=swap.length-1; i>=swap[0];i--)
		{
			for(double d=swap[0]; d<swap[swap.length]; d++)
			{
				d=i;
			}
		}
		return swap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] grades = {81.2, 92.5, 48.9, 78.8};
		int[] numbers = {12, 42, 33, 67, 92, 58};
		String[] arguments = new String[9];
		System.out.println(grades.length);
		System.out.println(numbers.length);
		System.out.println(arguments.length);
		System.out.println(grades[3]);
		System.out.println(grades[1]);
		System.out.println(numbers[2]);
		numbers[0]=99;
		grades[3]=90.5;
		arguments[6]="maze7.txt";
		for(int i=0;i<grades.length;i++){
		System.out.print(grades[i]+",");
		}
		System.out.println();
		for(int n=0; n<numbers.length;n++){
			System.out.print(numbers[n]+" ");
		}
		System.out.println();
		for(int a=0; a<arguments.length;a++){
			System.out.print(arguments[a]+"_");
		}
		System.out.println();
		System.out.println(Arrays.toString(grades));
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(arguments));
		System.out.println(R12.arrayAverage(grades));
		System.out.print(R12.swapArray(grades));
	
		}
	}

