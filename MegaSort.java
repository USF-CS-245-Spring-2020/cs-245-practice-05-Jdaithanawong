import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class MegaSort {

	 public static void main(String[] args) {
		 Scanner nameScanner = new Scanner(System.in);
		 System.out.println("Enter username");
		 String fileName = nameScanner.nextLine(); //file name is "1m-ints.txt"
		 File textFile = new File(fileName);
		 nameScanner.close();
		 int[] intArray = new int[1000000];
		 int indexCounter = 0;
		 try 
		 {
			 Scanner scanner = new Scanner(textFile);
			 
			 while (scanner.hasNextLine()) 
			 {
				int placeholder = Integer.parseInt(scanner.nextLine());
	            intArray[indexCounter] = placeholder;
	            indexCounter++;
	         }
			 QuickSort sorter = new QuickSort();
			 
		     sorter.sort(intArray);
		     for(int i = 0; i < intArray.length ; i++)
		     {
		    	 String output = Integer.toString(intArray[i]);
		    	 System.out.println(output);
		     }
		    	 
			 scanner.close();  
	     } 
		 catch (FileNotFoundException e) 
		 {
	         e.printStackTrace();
	     }
		 
		 
		
	 }

}


