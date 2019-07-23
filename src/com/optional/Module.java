package com.optional;

class Module {
	
	private Student students;
	private String moduleName;

	public Module(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public Student getStudent() {
		return students;
	}

	public void setStudents(Student students) {
		this.students = students;
	}
}
