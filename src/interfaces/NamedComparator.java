package interfaces;

import java.util.Comparator;

public class NamedComparator implements Comparator<Named> {
	
	public NamedComparator() {
		
	}

	@Override
	public int compare(Named pers1, Named pers2) {
		if (!pers1.getFamilyName().equals(pers2.getFamilyName())) {
			return pers1.getFamilyName().compareTo(pers2.getFamilyName());
		}
		return pers1.getGivenName().compareTo(pers2.getGivenName());
	}
}
