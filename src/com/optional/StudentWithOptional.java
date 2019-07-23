package com.optional;

import java.util.Optional;

/**
 * @author 
 *
 */
public class StudentWithOptional {

	private int numberOfStudents;

	public StudentWithOptional(int number){
        this.numberOfStudents = number;
    }

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public static void main(String[] args) {
        // TODO code application logic here
        CourseWithOptional computerScience = new CourseWithOptional();
        ModuleWithOptional algorithms = new ModuleWithOptional("Algorithms");
        Optional<StudentWithOptional> studentsOnAlgorithm = Optional.of(new StudentWithOptional(50));
        algorithms.setStudents(studentsOnAlgorithm);
        computerScience.addModule(algorithms);
 
        ModuleWithOptional cancelledModules = new ModuleWithOptional("Pascal");
        //cancelledModules.setStudents(studentsOnPascal); - No students opted for Pascal Module so when we try to 
      	// 'm.getStudent().get().getNumberOfStudents()' - Pascal module has no student mapped but because we make getStudent as 'Optional'
      	// so we don't get Null ERROR 'm.getStudent().isPresent()' getNumberOfStudents() is invoked only if it has mapped student
        computerScience.addModule(cancelledModules);
 
        computerScience.getModules().stream().forEach((m) -> {
            if (m.getStudent().isPresent()) {
                System.out.println("Module ---&gt; " + m.getModuleName() + " \n" + m.getStudent().get().getNumberOfStudents() + " students take this module");
            } else {
                System.out.println("Module ---&gt; " + m.getModuleName() + "\nhas no students attached to it");
            }
        });
    }

}
