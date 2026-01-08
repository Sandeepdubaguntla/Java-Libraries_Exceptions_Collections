package loanManagementSystem;

public class AcadamicRecords {
	private String schoolName;
	private double tenthPercent;
	private String collegeName;
	private double interPercent;
	private String UniversityName;
	private double ugPercent;

	public AcadamicRecords(String schoolName, double tenthPercent, String collegeName, double interPercent,
			String universityName, double ugPercent) {
		super();
		this.schoolName = schoolName;
		this.tenthPercent = tenthPercent;
		this.collegeName = collegeName;
		this.interPercent = interPercent;
		UniversityName = universityName;
		this.ugPercent = ugPercent;
	}
	public AcadamicRecords(String schoolName, double tenthPercent, String collegeName, double interPercent) {
		super();
		this.schoolName = schoolName;
		this.tenthPercent = tenthPercent;
		this.collegeName = collegeName;
		this.interPercent = interPercent;
	}
	public AcadamicRecords(String schoolName, double tenthPercent) {
		super();
		this.schoolName = schoolName;
		this.tenthPercent = tenthPercent;
		
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public double getTenthPercent() {
		return tenthPercent;
	}

	public void setTenthPercent(double tenthPercent) {
		this.tenthPercent = tenthPercent;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public double getInterPercent() {
		return interPercent;
	}

	public void setInterPercent(double interPercent) {
		this.interPercent = interPercent;
	}

	public String getUniversityName() {
		return UniversityName;
	}

	public void setUniversityName(String universityName) {
		UniversityName = universityName;
	}

	public double getUgPercent() {
		return ugPercent;
	}

	public void setUgPercent(double ugPercent) {
		this.ugPercent = ugPercent;
	}
	
	
}
