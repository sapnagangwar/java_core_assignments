package com.javaCore.BasicJavaExercise;

public class Exercise7 {
	private int empNo;
	private String empName;
	private String address;
	private String state;
	private int zipCode;
	private String phone;
	private String designation;
	private int experienceInYears;
	private String emailAddress;
	private double basic;
	private double hra;
	private double bonus;

	public Exercise7() {
	}

	public Exercise7(int empNo, String empName, String address, String state,
			int zipCode, String phone, String designation,
			int experienceInYears, String emailAddress, double basic,
			double hra, double bonus) {
		this.empNo = empNo;
		this.empName = empName;
		this.address = address;
		this.state = state;
		this.zipCode = zipCode;
		this.phone = phone;
		this.designation = designation;
		this.experienceInYears = experienceInYears;
		this.emailAddress = emailAddress;
		this.basic = basic;
		this.hra = hra;
		this.bonus = bonus;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public String getAddress() {
		return address;
	}

	public String getState() {
		return state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public String getPhone() {
		return phone;
	}

	public String getDesignation() {
		return designation;
	}

	public int getExperienceInYears() {
		return experienceInYears;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public double getBasic() {
		return basic;
	}

	public double getHra() {
		return hra;
	}

	public double getBonus() {
		return bonus;
	}

	public double getSalary() {
		return getBasic() + getHra() + (getBonus() / 100) * getBasic();
	}

	@Override
	public String toString() {
		return "[empNo=" + empNo + ", empName=" + empName + ", address="
				+ address + ", state=" + state + ", zipCode=" + zipCode
				+ ", phone=" + phone + ", designation=" + designation
				+ ", experienceInYears=" + experienceInYears
				+ ", emailAddress=" + emailAddress + ", basic=" + basic
				+ ", hra=" + hra + ", bonus=" + bonus + "]";
	}

}
