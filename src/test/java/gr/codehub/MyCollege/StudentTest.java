package gr.codehub.MyCollege;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student s;
    private MarkModule markModule;

    @BeforeEach
    void setUp() {
        s = new Student();
        markModule = new MarkModule();
        AchievedMark achievedMark = new AchievedMark();
        achievedMark.setMark(6);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void enroll() {

    }
}