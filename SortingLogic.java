import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingLogic {

	public static void main(String[] args) {
		
	}
	
	public static class PrimitiveJavaSorting {
		
		public static void main (String []args){
			
			char [] charArray = {'Z','T','D','J','S','Q','H','T','C','A','B'};
			System.out.println("Char Array before sorting : "+Arrays.toString(charArray));
			Arrays.sort(charArray);
			System.out.println("char Array after Sorting : "+Arrays.toString(charArray));

			int [] intArray = {99,23,85,3,67,92,100,6,9,45,0};
			System.out.println("intArray before sorting : "+Arrays.toString(intArray));
			Arrays.sort(intArray);
			System.out.println("Int array after sorting : "+Arrays.toString(intArray));
		
			List strList = new ArrayList ();
			strList.add("Priti");
			strList.add("Piya");
			strList.add("Abishek");
			strList.add("Saurav");
			
			System.out.println("ArrayList before sorting :" +strList.toString());
			Collections.sort(strList);
			System.out.println("Array List after Sorting : "+strList);
		}
	}

}
