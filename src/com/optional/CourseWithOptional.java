package com.optional;

import java.util.ArrayList;
import java.util.List;

public class CourseWithOptional {
	
private  List<ModuleWithOptional> modules = new ArrayList<>();
    
    public void addModule(ModuleWithOptional module){
        modules.add(module);
    }
    public List<ModuleWithOptional> getModules() {
        return modules;
    }

}
