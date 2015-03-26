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
		if (mother != null && mother.gender != 'F') {
			throw new IllegalArgumentException("You can't have a male mother!");
		}
		
		else if (this == mother) {
			throw new IllegalArgumentException("You can't be your own mother!");
		}
		
		else if (mother == this.mother) {
			return;
		}
		
		else if (this.mother != null) {
			this.mother.children.remove(this);
			this.mother = mother;
			mother.children.add(this);
		}
		else {
			this.mother = mother;
			mother.children.add(this);
		}		
	}
	
	public Person getFather() {
		return father;
	}
	
	public void setFather(Person father) {
		if (father != null && father.gender != 'M') {
			throw new IllegalArgumentException("You can't have a female father!");
		}
		
		else if (this == father) {
			throw new IllegalArgumentException("You can't be your own father!");
		}

		else if (father == this.father) {
			return;
		}
		
		else if (this.father != null) {
			this.father.children.remove(this);
//			må fjerne den gamle faren
			this.father = father;
			father.children.add(this);
		}
		else {
			this.father = father;
			father.children.add(this);
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
		boolean alreadyChild = false;
		for (Person p : this.children) {
//			will go through the list of children and check if the child is already a child of this parent
			if (p == child) {
				alreadyChild = true;
			}
		}
		if (alreadyChild) {
			throw new IllegalArgumentException("This child is already a child of this parent");
		}
		else if (this != child) {
//			if the child is not in the list of children
//			"this" is the parent
//			add to the list of children
			if (this.gender == 'M') {
				if (child.father != null) {
					child.father.children.remove(child);
				}
				child.setFather(this);
			}
			else {
				if (child.mother != null) {
					child.mother.children.remove(child);
				}
				child.setMother(this);
			}
		}
		else {
			throw new IllegalArgumentException("This child is not a child of this parent!");
		}	
	}

	
	public void removeChild(Person child) {
		boolean alreadyChild = false;
		for (Person p : this.children) {
			if (p == child) {
				alreadyChild = true;
			}
		}
		if (alreadyChild) {
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
		Person anne = new Person("Anne", 'F');
		Person jens = new Person("Jens", 'M');
		Person hallvar = new Person("Hallvar", 'M');
		
		jens.addChild(anne);
		jens.addChild(hallvar);
		System.out.println(jens.children);
		
		
		
		
		Person me = new Person("Håvard", 'M');
		Person p = new Person("Finn", 'M');
		Person m = new Person("Bergljot", 'F');
		Person b = new Person("Bjørn", 'M');
		Person g = new Person("Guro", 'F');
		Person mm = new Person("Vesla", 'F');
		Person mf = new Person ("Kjell", 'M');
		
		ArrayList<Person> persons = new ArrayList<Person>();
//		puts the family in a list
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
		
		System.out.println("Hele familien:");
		
		for (Person familyMember : persons) {
			System.out.printf("Navn: %s  [%c]\n", familyMember.getName(),familyMember.getGender());
		}
		
		
		
		
	}
}
