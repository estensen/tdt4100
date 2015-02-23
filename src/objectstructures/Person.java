package objectstructures;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private char gender;
	private Person mother, father;
	private List<Person> children = new ArrayList<Person>();
	
	public Person(String name, char gender) {
		this.name = name;
		checkGender(gender);
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}

	
	private void checkGender(char gender) {
		if (gender != 'M' && gender != 'F') {
			throw new IllegalArgumentException("Gender has to be [M]ale, or [F]emale");
		}
	}

	
	public Person getMother() {
		return mother;
	}
	
	public void setMother(Person mother) {
		if (mother.gender != 'F') {
			throw new IllegalArgumentException("You can't have a male mother!");
		}
		
		else if (this == mother) {
			throw new IllegalArgumentException("You can't be your own mother!");
		}
		
		else if (this.mother != null) {
			throw new IllegalArgumentException("This person already has a mother!");
		}
		else {
			this.mother = mother;
			mother.addChild(this);
		}		
	}
	
	public Person getFather() {
		return father;
	}
	
	public void setFather(Person father) {
		if (father.gender != 'M') {
			throw new IllegalArgumentException("You can't have a female father!");
		}
		
		else if (this == father) {
			throw new IllegalArgumentException("You can't be your own father!");
		}
		
		else if (this.father != null) {
			throw new IllegalArgumentException("This person already has a father!");
		}
		else {
			this.father = father;
			father.addChild(this);
		}		
	}
	
	
	public int getChildCount() {
		return children.size();
	}
	
	public Person getChild(int n) {
		if (n > getChildCount()) {
			throw new IllegalArgumentException("You don't have that many children");
		}

		else if (n < 0) {
			throw new IllegalArgumentException("You can't have negative children");
		}
		else {
			return children.get(n);
		}
	}
	
	public void addChild(Person child) {
		boolean childAsChild = false;
		for (Person p : this.children) {
			if (p == child) {
				childAsChild = true;
			}
		}
		if (childAsChild) {
			
		}
		else if (this != child) {
			this.children.add(child);
			if (this.gender == 'M') {
				child.setFather(this);
			}
			else {
				child.setMother(this);
			}
		}
		else {
			throw new IllegalArgumentException("This child is not a child of this parent!");
		}	
	}

	
	public void removeChild(Person child) {
		boolean childAsChild = false;
		for (Person p : this.children) {
			if (p == child) {
				childAsChild = true;
			}
		}
		if (childAsChild) {
			this.children.remove(child);
			if (this.gender == 'M') {
				child.setFather(null);
			}
			else {
				child.setMother(null);
			}
		}
		else {
			throw new IllegalArgumentException("This child is not a child of this parent!");	
		}
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
	public static void main(String[] args) {
		Person me = new Person("Håvard", 'M');
		Person p = new Person("Finn", 'M');
		Person m = new Person("Bergljot", 'F');
		Person b = new Person("Bjørn", 'M');
		Person g = new Person("Guro", 'F');
		Person mm = new Person("Vesla", 'F');
		Person mf = new Person ("Kjell", 'M');
		
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(me);
		persons.add(p);
		persons.add(m);
		persons.add(b);
		persons.add(g);
		persons.add(mm);
		persons.add(mf);
		
		mm.addChild(m);
		mf.addChild(m);
		m.addChild(me);
		m.addChild(b);
		m.addChild(g);
		p.addChild(me);
		p.addChild(b);
		p.addChild(g);
		
		
		System.out.println("Antall barn p har: " + p.getChildCount());
		System.out.println("Barn 1: " + p.getChild(0));
		System.out.println("Barn 2: " + p.getChild(1));
		System.out.println("Barn 3: " + p.getChild(2));
	}
}
