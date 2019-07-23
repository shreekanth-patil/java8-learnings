package com.optional;

import java.util.Optional;

public class ModuleWithOptional {

	private Optional<StudentWithOptional> students = Optional.empty();
	private String moduleName;

	public ModuleWithOptional(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public Optional<StudentWithOptional> getStudent() {
		return students;
	}

	public void setStudents(Optional<StudentWithOptional> students) {
		this.students = students;
	}
}
