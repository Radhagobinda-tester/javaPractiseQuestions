package BasicQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindingCommonElementsinArrays {

	public static void main(String[] args) {
        // Declaring first array 
		int[] array1 = {0,1,2,3,4,5,6};
		//Declaring Second array 
		int[] array2 = {99,1,8,9,4,5,6};
		
		List<Integer> commonElements = new ArrayList<>();
		// using for loop 
		for(int i =0; i<array1.length;i++) {
			
			for(int j =0; j<array2.length;j++) {
				
				if(array1[i]==array2[j]) {
					
					commonElements.add(array1[i]); // Add common element to list
				}
				
			}
		}                
		
		System.out.print("The comon elements are : "+commonElements);
		
		// By using Java Stream
		String[] array3 = { "Java", "JavaScript", "C", "C++" };
		String[] array4 = { "Python", "C#", "Java", "C++" };
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList(array3));
		ArrayList<String> list4 = new ArrayList<>(Arrays.asList(array4));
		List<String> commonElements1 =
		list3.stream().filter(list4::contains).collect(Collectors.toList());
		System.out.println(commonElements1);
		}
	
		
	}


