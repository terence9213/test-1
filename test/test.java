import java.util.*;

public class test
{
	public static void main(String[] args)
	{
		ArrayList<String> listOne = new ArrayList<String>();
		
		listOne.add("one");
		listOne.add("two");
		
		List newList = listOne.subList(0,1);
		
		System.out.println(listOne);
		System.out.println(newList);
		
		ArrayList<String> listTwo = new ArrayList<String>();
		listTwo = new ArrayList<String>(newList);
		System.out.println(listTwo);
		
		System.out.println("Bleh");
		
		int answer = 41;
		
		answer++;
		
		System.out.println("The answer to the question is " + answer);
		
	}
}