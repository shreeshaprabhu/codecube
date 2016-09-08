package in.ac.manit.matrix.codecube.model;

import in.ac.manit.matrix.codecube.enumerator.Gender;

import lombok.*;

/**
 * This class is model for User table in database
 * @author Shreesha Prabhu K
 * 
 */

@Data
public class User {
	private long scholarNo;
	private String name;
	private String email;
	private Gender gender;
	private String phoneNo;
	private String handle;
	private double yearRating;
	private double overallRating;
	private String branch;
	private int joiningYear;
}
