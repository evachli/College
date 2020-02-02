package gr.codehub.MyCollege;

import lombok.Data;

@Data
public class Course {
    private String name;
    private String location;
    private Cohort cohort;

    //CONSTRUCTOR

    public Course() {
    }

    public Course(String name, String location, Cohort cohort) {
        this.name = name;
        this.location = location;
        this.cohort = cohort;
    }

    public Course(String name, String location) {
        this.name = name;
        this.location = location;
    }
}
