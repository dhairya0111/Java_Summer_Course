package Assignment_13;
import java.util.ArrayList;
import java.util.Collections;
public class Age_Name implements Comparable<Age_Name> {
	
	
		Integer age;
		String name;
		public  int compareTo(Age_Name t)
		{
			int c = this.name.compareTo(t.name);
			if((this.age > t.age) && (c == 0))
				return 1;
			else
				return -1;
		}
		public void ageSet(Integer age)
		{
			this.age = age;
		}
		public void nameSet(String name)
		{
			this.name = name;
		}
		public Integer printage()
		{
			return age;
		}
		public String printname()
		{
			return name;
		}
		
		public static void main(String[] args) {
			ArrayList <Age_Name> l1 = new ArrayList<Age_Name>();
			Age_Name a1 = new Age_Name();
			Age_Name a2 = new Age_Name();
			Age_Name a3 = new Age_Name();
			a1.ageSet(11);
			a1.nameSet("Dhairya");
			a2.ageSet(12);
			a2.nameSet("Aman");
			a3.ageSet(10);
			a3.nameSet("Acadview");
			l1.add(a1);
			l1.add(a2);
			l1.add(a3);
			Collections.sort(l1);
			for(Age_Name l:l1)
			{
				System.out.println("Age: " + l.printage() + " Name: " + l.printname());
			}
		}

	}

