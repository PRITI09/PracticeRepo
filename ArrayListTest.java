import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		System.out.println("Hello to programming !");
		arraylistTest ();
	}
	
	
	public static void arraylistTest (){
		System.out.println("Hello inside arrayListTest () ");
		List <String> tempList = new ArrayList <> ();
		String tempVal;
		tempList.add("Priti");
		tempList.add("Priya");
		tempList.add("Abhishek");
		tempList.add("Saurav");
		Iterator<String> itr1 = tempList.iterator();
			while (itr1.hasNext()){
				tempVal=(String) itr1.next();
				if (tempVal.length()==8){
					int pos=tempList.indexOf(tempVal);
					tempList.set(pos, "cutie");
				}
			}
			Iterator itr2 = tempList.iterator();
			while (itr2.hasNext())
		System.out.println("Elements of array list are as follows : "+itr2.next());
	}

}
