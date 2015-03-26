package interfaces;

public class Person2 implements Named {

	private String fullName;
	
	public Person2(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public void setGivenName(String s) {
		this.fullName = s + " " + this.getFamilyName();
	}

	@Override
	public String getGivenName() {
		return this.fullName.split(" ")[0];
	}

	@Override
	public void setFamilyName(String s) {
		this.fullName = this.getGivenName() + " " + s;
	}

	@Override
	public String getFamilyName() {
		return this.fullName.split(" ")[1];
	}

	@Override
	public void setFullName(String s) {
		this.fullName = s;
	}

	@Override
	public String getFullName() {
		return this.fullName;
	}

	public String toString() {
		return this.getFullName();
	}
	
	
}
