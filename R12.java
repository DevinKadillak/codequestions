cs160 programming assignments import java.util.Arrays;

// R12 Recitation // Author: Devin Kadillak // Date: Oct 23, 2014 // Class: CS160 // Email: devbot@rams.colostate.edu

public class R12 {
 
    public static double[] swapArray(double[] swap){
	int inArrayLength = swap.length - 1;
	double[] outArray = new double[swap.length];
	for(int i = 0; i < swap.length; i++)
	    {
		// Take the first element of the swap array, increase the counter and put it into the last element of the array
		outArray[inArrayLength] = swap[i];
		inArrayLength--;
	    }
	    
	return outArray;
    }
}

public static void main(String[] args) {
    public static void main(String[] args) {
	double[] practiceArr = {1.0, 2.0, 3.0};
	double[] outArr = swapArray(practiceArr);

	// You have to loop through the array to print it out.
	for (int i = 0; i < practiceArr.length; i++){
	    System.out.print(outArr[i]);
	}

    }
}