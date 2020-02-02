package gr.codehub.MyCollege;

import lombok.Data;

@Data
public class Module {
    private String name;
    private Course course;
    private String assignedTutor;
    private ModuleType moduleType;

    //CONSTRUCTOR

    public Module() {
    }

    public Module(String name, Course course, String assignedTutor, ModuleType moduleType) {
        this.name = name;
        this.course = course;
        this.assignedTutor = assignedTutor;
        this.moduleType = moduleType;
    }
}
