package JAVA8;
s
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OldJava {

	public static void main(String[] args) {
		
		List<Person> personlist = Arrays.asList(
				new Person("Pritesh","Pawar"),
				new Person("A","B"),
				new Person("AM","Mathur"),
				new Person("C","D")
				);
		
		Collections.sort(personlist, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getlastName().compareTo(o2.getlastName());
			}
			
		});
		
		printall(personlist);
		
		printConditionally(personlist, new Condition() {
			
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getlastName().startsWith("P");
			}
		});
	}

	private static void printall(List<Person> personlist) {

		for(Person p : personlist)
		{
			System.out.println(p);
		}
			
	}
	
	private static void printConditionally(List<Person> personlist, Condition condition)
	{
		for(Person p : personlist)
		{
			if(condition.test(p))
			{
				System.out.println(p);
			}
		}
	}
	
}

interface Condition
{
 boolean test(Person p);	
}