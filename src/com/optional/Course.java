package com.optional;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
    private  List<Module> modules = new ArrayList<>();
    
    public void addModule(Module module){
        modules.add(module);
    }
    public List<Module> getModules() {
        return modules;
    }
}