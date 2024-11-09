import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
	 /*
		int[] arr1; //Declaration of Array
		int[] arr2;
		arr1 =new int[6]; //Creation of array
		arr2 =new int[0];
		//arr3 =new int[-10]; //InvalidIn
		//arr3 =new int[Integer.MAX_VALUE]; Exception
		
		System.out.println(Integer.MAX_VALUE);
		arr1[0]=44;
		arr1[1]=55;
		arr1[2]=66;
		System.out.println(Arrays.toString(arr1));
		
		int[] arr4 =new int[] {10,202,02,56,56}; //Declaration ,creation,initialization in a single line
		int[] arr5 = {10,54,12,554,251,120};
		
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		//System.out.println(arr4);
		System.out.println("Size of array4 is : "+arr4.length);
		System.out.println(arr4[0]);  //Access first element using index
		System.out.println(arr4[arr4.length-1]); //Access last element 
		
		// Traversal
		
		int[] subjectMarks = {44,55,66,77,88,99};
		
		System.out.println(" Using for loop ");
		
		for (int index=0; index <subjectMarks.length;index++)
		{
			System.out.println("Sublect "+ (index+1)+" Marks is : "+subjectMarks[index]);
			
		}
		
		System.out.println(" Using While loop ");
		int i=0;
		while(i< subjectMarks.length) {
			System.out.println("Subject "+(i+1)+" Marks is "+subjectMarks[i]);
			i++;
		}
		
		System.out.println("Using For each loop or enhanced loop ");
		for(int eachSubjectMarks : subjectMarks) {
			System.out.println(eachSubjectMarks);
		} 
		
		*/
		/// Using double -----------------------------------------------------------//////
		double[] salaries = {55000.00,45000.00,65000.00,75000.00,85000.00,95000.00};
		System.out.println(" size of Array is : "+salaries.length);
		System.out.println(" Using for loop ");
		for (int index=0; index <salaries.length;index++)
		{
			System.out.println("salary of  "+ (index+1) +" is : "+salaries[index]);
			
		}
		
		System.out.println(" Using While loop ");
		int j=0;
		while(j< salaries.length) {
			System.out.println("salary of "+(j+1)+ " is : "+salaries[j]);
			j++;
		}
		
		System.out.println("Using For each loop or enhanced loop ");
		for(double eachSubjectMarks : salaries) {
			System.out.println(eachSubjectMarks);
		}
		
		 double sum =0;
		
		for (int index=0; index <salaries.length;index++)
		{
			 sum =sum+salaries[index];
		}
		 System.out.println("Total Salary is : "+sum);
	
		
		double min =salaries[0];
		double max=salaries[0];
		
		for (int k1=0;k1<salaries.length;k1++) {
			if(salaries[k1]<min) {
				min=salaries[k1];
			}
			
			if(salaries[k1]>max) {
				max=salaries[k1];
			}
			
		}
		System.out.println("Minimum salary is : "+min);
		System.out.println("Maximum salary is : "+max);
	}

}
