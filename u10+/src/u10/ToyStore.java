package u10;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import static java.lang.System.*;

public class ToyStore {
	private ArrayList<Toy> toyList;
	private String[] toyRay;
	private String out;

	public ToyStore( String toys ) {
		loadToys(toys);
		toyString();
	}

	public void loadToys( String toys )
	{
		toyRay = toys.split(" ");
		List<String> toyRayList = Arrays.asList(toyRay);
		Set<String> s = new HashSet<String>(toyRayList);
		for(String k: toyRay) {
			int i = 0;
			Toy(k, Collections.frequency(toyRayList,str));
		}
		toyList = Arrays.asList(toyRay);
	}
	
	public void toyString() {
		Set<String> s = new HashSet<String>(toyL);
		for (String str: s) {
			out += str + " " +Collections.frequency(toyL,str) + "\n";
		}
	}

	public Toy getThatToy(String nm) {
		return null;
	}

	public String getMostFrequentToy() {
		return "";
	}

	public void sortToysByCount() {
	}

	public String toString() {
		return out;
	}
}