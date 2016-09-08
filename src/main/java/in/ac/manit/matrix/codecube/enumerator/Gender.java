package in.ac.manit.matrix.codecube.enumerator;

public enum Gender {
	OTHER("Other"), MALE("Male"), FEMALE("Female");
	private String value;

	private Gender(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
