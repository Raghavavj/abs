package org.abs;

public class College extends UniversityInformation {

	@Override
	public void studId() {
		System.out.println("ID---1");
		
	}

	public static void main(String[] args) {
		College c=new College();
		c.ug();
		c.pg();
		c.studId();
	}
}
