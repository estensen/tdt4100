package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Person1 implements Named {

	private String givenName;
	private String familyName;
	
	public Person1(String givenName, String familyName) {
		this.givenName = givenName;
		this.familyName = familyName;
	}

	@Override
	public void setGivenName(String s) {
		this.givenName = s;
	}

	@Override
	public String getGivenName() {
		return this.givenName;
	}

	@Override
	public void setFamilyName(String s) {
		this.familyName = s;
	}

	@Override
	public String getFamilyName() {
		return this.familyName;
	}

	@Override
	public void setFullName(String s) {
		this.givenName = s.split(" ")[0];
		this.familyName = s.split(" ")[1];
	}

	@Override
	public String getFullName() {
		return this.givenName + " " + this.familyName;
	}
	
	public String toString() {
		return this.getFullName();
	}
	
	public static void main(String[] args) {
		Named p1 = new Person1("Håvard", "Estensen");
		Named p2 = new Person2("Ola Nordmann");
		Named p3 = new Person1("Kari", "Nordmann");
		
		List<Named> personList = new ArrayList<Named>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		System.out.println(personList);
		personList.sort(new NamedComparator());
		System.out.println(personList);
		
	}
}
