package gr.codehub.MyCollege;

import lombok.Data;

import java.util.Date;

@Data
public class AchievedMark {
    private Date date;
    private int mark;

    //CONSTRUCTOR


    public AchievedMark() {
    }

    public AchievedMark(Date date, int mark) {
        this.date = date;
        this.mark = mark;
    }
}
