package encapsulation;

import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Person {
	private String name;
	private String email;
	private Date birthday;
	private char gender;
//	kjønn må være'M', 'F' eller '\0'? char
	private String[] countryCodes = Locale.getISOCountries();
	
		
//	Source --> genereate getters and setters
	
	public Person() {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
//		fornavn og etternavn må være minst to tegn hver
		checkName(name);
		this.name = name;
	}
	
	private void checkName(String name) {
		if (!name.matches("[a-zA-Z][a-zA-Z]+[ ][a-zA-Z][a-zA-Z]+")) {
//			[a-zA-Z][a-zA-Z]+ minst to bokstaver
			throw new IllegalArgumentException("Fornavn og etternavn må være lenger enn to bokstaver");
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) { 
		checkEmail(email);
		this.email = email;
	}
	
	private void checkEmail(String email) {
		if (email == null) {
			;
		}
		else if (!email.matches("[a-zA-Z]+[.][a-zA-Z]+[@][a-zA-Z]+[.][a-zA-Z]+")) {
			throw new IllegalArgumentException("Feil format på epost");
		}
		else if (!name.substring(0, name.indexOf(" ")).equalsIgnoreCase(email.substring(0, email.indexOf(".")))) {
			throw new IllegalStateException("Feil fornavn");
		}
		else if (!name.substring(name.indexOf(" ")+1).equalsIgnoreCase(email.substring(email.indexOf(".")+1, email.indexOf("@")))) {
			throw new IllegalStateException("Feil etternavn");
		}
		else if (!Arrays.asList(countryCodes).contains(email.substring(email.lastIndexOf(".")+1).toUpperCase())) {
			throw new IllegalStateException("Feil landkode)");
		}
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		checkBirthday(birthday);
		this.birthday = birthday;
	}

	private void checkBirthday(Date birthday) {
		Date date = new Date();
		if (birthday.after(date)) {
			throw new IllegalArgumentException("Bursdagen må være i fortiden");
		}
	}

	public char getGender() {
		return gender;
	}

	void setGender(char gender) {
		checkGender(gender);
		this.gender = gender;
	}
	
	private void checkGender(char gender) {
		if (gender != 'M' && gender != 'F' && gender != '\0') {
			throw new IllegalArgumentException("Ugyldig kjønn");
		}
	}

	
	public static void main(String[] args) {
		Person ola = new Person();
		ola.setName("Ola Nordmann");
		ola.setEmail("ola.nordmann@ntnu.no");
		ola.setBirthday(new Date(0L));
		ola.setGender('M');
		System.out.println(ola.name);
		System.out.println(ola.email);
		System.out.println(ola.birthday);
		System.out.println(ola.gender);
	}
	
}
