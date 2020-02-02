package gr.codehub.MyCollege;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static java.sql.Types.NULL;

@Data
public class Student {
    private final int PASSMARK = 5;
    private int id;
    private Course course;
    private List<MarkModule> markModules;

    //CONSTRUCTOR

    public Student() {
        markModules = new ArrayList<>();
    }

    public Student(Course course, List<MarkModule> markModules) {
        this();
        this.course = course;
        this.markModules = markModules;
    }

    //METHODS
    public int enroll(Module module) throws Exception{
        if (this.getId() == NULL) {
            throw new Exception("No student id");

        }
       // System.out.println("Student with ID: " + this.getId() + "enrolled to moduele  " + module.getName());
        MarkModule markmodule = new MarkModule();
        markmodule.setModule(module);
        markModules.add(markmodule);
        return 1;
    }

    public double getAverageMark(){
        double averageMark = 0;
        if (markModules.size() == NULL) {
            System.out.println("There are no Marked modueles CALL PARENTS");
        }
        for (MarkModule m : markModules) {
            if (m.getHighestMark() >=PASSMARK)
                averageMark += m.getHighestMark();
        }
        return averageMark = averageMark / markModules.size();
    }

    public boolean checkIfAllModulesPassed() throws Exception {
        boolean ok = true;
        if (markModules.size() == NULL) {
            throw new Exception("There are no Marked modueles CALL PARENTS");
        }
        for (MarkModule m : markModules) {
            if (!(m.checkIfModulePassed())) {
                throw new Exception("There are no Passed modueles CALL PARENTS");
            }
        }
        return ok;
    }

//    public void getsMarkAtModule(int mark){
//        MarkModule m = new MarkModule();
//        m.getsAmark(mark);
//
//    }

    public void printStudentToConsole() {
        System.out.println(this.toString());
    }

}
