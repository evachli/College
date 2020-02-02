package gr.codehub.MyCollege;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.sql.Types.NULL;

@Data
public class MarkModule {
    private Module module;
    private List<AchievedMark> achievedMarks;

    //CONSTRUCTOR

    public MarkModule() {
        achievedMarks = new ArrayList<>();
    }

    public MarkModule(Module module, List<AchievedMark> achievedMarks) {
        this();
        this.module = module;
        this.achievedMarks = achievedMarks;
    }
    public MarkModule(Module module) {
        this();
        this.module = module;
    }

    //METHODS
    public void getsAmark(int mark){
        AchievedMark achvMark = new AchievedMark();
        achvMark.setMark(mark);
        achievedMarks.add(achvMark);
    }
    public int getHighestMark() {
        if (achievedMarks.size() != NULL) {
            for (AchievedMark achievedMark : achievedMarks) {

                int max = Collections.max(Arrays.asList(achievedMark.getMark()));
                return max;
            }
        }else
                System.out.println("Empty list at Mark Module");
            return 0;
        }

        public boolean checkIfModulePassed(){
        boolean ok = true;
            if (achievedMarks.size() == NULL) {
                System.out.println("Empty list at Mark Module");
                return !ok;
                }
            if (this.getHighestMark() < 5){
                System.out.println("NOT PASSED");
                return !ok;
            }
        return ok;
        }
    }

