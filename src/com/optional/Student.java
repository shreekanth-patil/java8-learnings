package com.optional;

public class Student {
	
	private int numberOfStudents;

	public Student(int number) {
		this.numberOfStudents = number;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public static void main(String[] args) {
		
		Course computerScience = new Course();
		Module algorithms = new Module("Algorithms");
		
		Student studentsOnAlgorithm = new Student(50);
		
		Student studentsOnPascal = new Student(50);
		
		algorithms.setStudents(studentsOnAlgorithm);
		computerScience.addModule(algorithms);
		
		Module cancelledModules = new Module("Pascal");
		//cancelledModules.setStudents(studentsOnPascal); - No students opted for Pascal Module so when we try to 
		// m.getStudent().getNumberOfStudents() - Pascal module has no student mapped to fails with Null
		// so Use the Optional Rectify the problem 
        computerScience.addModule(cancelledModules);

		computerScience.getModules().stream().forEach((m) -> {
			System.out.println("Module --->; " + m.getModuleName() + " \n" + m.getStudent().getNumberOfStudents()
					+ " students take this module");
		});
	}

}
