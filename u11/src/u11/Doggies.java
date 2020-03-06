package u11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
		if(spot<5) {
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		return null;
	}

	public String getNameOfYoungest()
	{
		return null;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}