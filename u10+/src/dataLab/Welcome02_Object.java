package dataLab;

import java.util.ArrayList;
import java.util.Scanner;

import core.data.*;

public class Welcome02_Object {
	public static void main(String[] args) {
		String id1 = "KATL";
		DataSource ds1 = DataSource.connect("http://weather.gov/xml/current_obs/" + id1 + ".xml");
		ds1.setCacheTimeout(15 * 60);
		ds1.load();
		// ds1.printUsageString();

		Observation ob1 = ds1.fetch(Observation.class, "weather", "temp_f", "wind_degrees");
		System.out.println(id1 + ": " + ob1);

		String id2 = "KSAV";
		DataSource ds2 = DataSource.connect("http://weather.gov/xml/current_obs/" + id2 + ".xml");
		ds2.setCacheTimeout(15 * 60);
		ds2.load();

		Observation ob2 = ds2.fetch(Observation.class, "weather", "temp_f", "wind_degrees");
		System.out.println(id2 + ": " + ob2);

		String id3 = "KDKK";
		DataSource ds3 = DataSource.connect("http://weather.gov/xml/current_obs/" + id3 + ".xml");
		ds3.setCacheTimeout(15 * 60);
		ds3.load();
		
		Observation ob3 = ds3.fetch(Observation.class, "weather", "temp_f", "wind_degrees");
		System.out.println(id3 + ": " + ob3);

		DataSource ds4 = DataSource.connect("https://data.baltimorecity.gov/api/views/yhtd-6cjz/rows.xml?accessType=DOWNLOAD");
		ds4.setCacheTimeout(15 * 60);
		ds4.load();
		ds4.printUsageString();
		
		ArrayList<BadGuy> bgList1 = ds4.fetchList(BadGuy.class, "row/row/csa2010", "row/row/domvio10", "row/row/viol10", "row/row/crime10");
		System.out.println("Total locations: " + bgList1.size());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a location string:");
		String input = scan.next();
		
		boolean boo = false;
		BadGuy bagy = null;
		for (BadGuy bg : bgList1) {
			if(bg.getCsa().equals(input) == true) {
				boo = true;
				bagy = bg;
			}
			else
				boo = false;
		}
		if(boo = true)
			System.out.println("for " + bagy.getCsa() + ", crime is " + bagy.getCrime());
		else
			System.out.println("nothing with that string");
		
		
		if (ob1.colderThan(ob2) && ob1.colderThan(ob3)) {
			System.out.println("Colder at ID " + id1);
		} else if (ob2.colderThan(ob3) && ob2.colderThan(ob1)) {
			System.out.println("Colder at ID " + id2);
		} else {
			System.out.println("Colder at ID " + id3);
		}
	}
}

/* Represents a weather observation */
class Observation {
	float temp; // in fahrenheit
	int windDir; // in degrees
	String description;

	Observation(String description, float temp, int windDir) {
		this.description = description;
		this.temp = temp;
		this.windDir = windDir;
	}

	/* determine if the temperature of this observation is colder than 'that's */
	public boolean colderThan(Observation that) {
		return this.temp < that.temp;
	}

	/* produce a string describing this observation */
	public String toString() {
		return (temp + " degrees; " + description + " (wind: " + windDir + " degrees)");
	}
}

/* Represents a badguy observation */
class BadGuy {
	String csa;
	float domVio; // domestic violence rate
	float viol; // violence rate
	float crime; // crime rate
	

	BadGuy(String cs, float dV, float v, float cr) {
		this.csa = cs;
		this.domVio = dV;
		this.viol = v;
		this.crime = cr;
	}
	
	public float getCrime() {
		return crime;
	}
	
	public String getCsa() {
		return csa;
	}

	/* produce a string describing this observation */
	public String toString() {
		return ("for " + csa + ", domestic violence; " + domVio + ", violence; " + viol + ", crime; " + crime);
	}
}